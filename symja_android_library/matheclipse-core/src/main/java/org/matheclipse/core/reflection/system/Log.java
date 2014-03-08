package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.CI;
import static org.matheclipse.core.expression.F.CInfinity;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.E;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Log;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.SetDelayed;
import static org.matheclipse.core.expression.F.Times;

import org.matheclipse.core.eval.interfaces.AbstractArg12;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.eval.interfaces.INumeric;
import org.matheclipse.core.expression.ComplexNum;
import org.matheclipse.core.expression.ComplexUtils;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.Num;
import org.matheclipse.core.generic.BinaryFunctorImpl;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IComplexNum;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.INum;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.parser.client.SyntaxError;

/**
 * See <a href="http://en.wikipedia.org/wiki/Logarithm">Wikipedia - Logarithm</a>
 * 
 */
public class Log extends AbstractArg12 implements INumeric {

	/**
	 * <pre>
	 * { Log[1]=0, Log[E]=1, Log[E^(x_Integer)]:=x, Log[E^(x_Rational)]:=x, Log[E^(I)]=I, Log[Exp[-I]]=(-I),
	 * Log[0]=(-Infinity) }
	 * </pre>
	 */
	static IAST RULES = null;

	@Override
	public IAST getRuleAST() {
		if (RULES == null) {
			RULES = List(Set(Log(Power(E, Times(CN1, CI))), Times(CN1, CI)), Set(Log(Power(E, CI)), CI),
					Set(Log(C0), Times(CN1, CInfinity)), Set(Log(C1), C0), Set(Log(E), C1),
					SetDelayed(Log(Power(E, $p("x", $s("Integer")))), $s("x")),
					SetDelayed(Log(Power(E, $p("x", $s("Rational")))), $s("x")));
		}
		return RULES;
	}

	public Log() {
	}

	@Override
	public IExpr e1DblArg(final INum arg1) {
		return Num.valueOf(Math.log(arg1.getRealPart()));
	}

	@Override
	public IExpr e1DblComArg(final IComplexNum arg1) {
		return ComplexUtils.log((ComplexNum) arg1);
	}

	@Override
	public IExpr e2DblArg(final INum arg1, final INum arg2) {
		return Num.valueOf(Math.log(arg2.getRealPart()) / Math.log(arg1.getRealPart()));
	}

	@Override
	public IExpr e2IntArg(final IInteger arg1, final IInteger arg2) {
		return baseBLog(arg1, arg2);
	}

	/**
	 * Integer logarithm of <code>arg</code> for base <code>b</code>. Gives Log<sub>b</sub>(arg) or <code>Log(arg)/Log(b)</code>.
	 * 
	 * @param b
	 *            the base of the logarithm
	 * @param arg
	 * @return
	 */
	public static IExpr baseBLog(final IInteger b, final IInteger arg) {
		try {
			long l1 = b.toLong();
			long l2 = arg.toLong();
			double res = Math.log(l2) / Math.log(l1);
			if (F.isNumIntValue(res)) {
				int r = Double.valueOf(Math.round(res)).intValue();
				if (arg.equals(b.pow(r))) {
					return F.integer(r);
				}
			}
		} catch (ArithmeticException ae) {
			// toLong() method failed
		}
		return null;
	}

	public static BinaryFunctorImpl<IExpr> getFunction() {
		return new BinaryFunctorImpl<IExpr>() {

			/**
			 * Evaluate if Log(arg2)/Log(arg1) has an integer number result
			 */
			@Override
			public IExpr apply(IExpr arg1, IExpr arg2) {
				if (arg1.isLog() && arg2.isPower()) {
					IExpr i1 = arg1.getAt(1);
					if (arg2.getAt(1).isLog() && arg2.getAt(2).equals(F.CN1)) {
						IExpr i2 = arg2.getAt(1).getAt(1);
						if (i1.isInteger() && i2.isInteger()) {
							return baseBLog((IInteger) i2, (IInteger) i1);
						}
					}
				}
				return null;
			}

		};
	}

	public double evalReal(final double[] stack, final int top, final int size) {
		if (size != 1) {
			throw new UnsupportedOperationException();
		}
		return Math.log(stack[top]);
	}

	@Override
	public void setUp(ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		super.setUp(symbol);
	}

	@Override
	public IExpr e1ObjArg(IExpr arg1) {
		if (AbstractFunctionEvaluator.isNegativeExpression(arg1)) {
			IExpr temp = F.eval(Times(CN1, arg1));
			if (temp.isPositive()) {
				return F.Plus(Log(temp), Times(CI, F.Pi));
			}
		}
		return null;
	}
}
