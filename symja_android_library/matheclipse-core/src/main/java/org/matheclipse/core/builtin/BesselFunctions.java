package org.matheclipse.core.builtin;

import org.hipparchus.complex.Complex;
import org.matheclipse.core.basic.Config;
import org.matheclipse.core.builtin.functions.BesselJS;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.ValidateException;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.reflection.system.rules.BesselIRules;
import org.matheclipse.core.reflection.system.rules.BesselKRules;
import org.matheclipse.core.reflection.system.rules.BesselYRules;

public class BesselFunctions {
	/**
	 * 
	 * See <a href="https://pangin.pro/posts/computation-in-static-initializer">Beware of computation in static
	 * initializer</a>
	 */
	private static class Initializer {

		private static void init() {
			F.AiryAi.setEvaluator(new AiryAi());
			F.AiryAiPrime.setEvaluator(new AiryAiPrime());
			F.AiryBi.setEvaluator(new AiryBi());
			F.AiryBiPrime.setEvaluator(new AiryBiPrime());
			F.BesselI.setEvaluator(new BesselI());
			F.BesselJ.setEvaluator(new BesselJ());
			F.BesselJZero.setEvaluator(new BesselJZero());
			F.BesselK.setEvaluator(new BesselK());
			F.BesselY.setEvaluator(new BesselY());
			F.BesselYZero.setEvaluator(new BesselYZero());
			F.HankelH1.setEvaluator(new HankelH1());
			F.HankelH2.setEvaluator(new HankelH2());
			F.SphericalBesselJ.setEvaluator(new SphericalBesselJ());
			F.SphericalBesselY.setEvaluator(new SphericalBesselY());
		}
	}

	private final static class AiryAi extends AbstractFunctionEvaluator {
		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr z = ast.arg1();

			if (z.isReal()) {
				try {
					return F.complexNum(BesselJS.airyAi(z.evalDouble()));
				} catch (NegativeArraySizeException nae) {
					return engine.printMessage("AiryAi: " + ast.toString() + " caused NegativeArraySizeException");
				} catch (RuntimeException rte) {
					return engine.printMessage("AiryAi: " + rte.getMessage());
				}
			} else if (z.isNumeric()) {
				try {
					return F.complexNum(BesselJS.airyAi(z.evalComplex()));
				} catch (NegativeArraySizeException nae) {
					return engine.printMessage("AiryAi: " + ast.toString() + " caused NegativeArraySizeException");
				} catch (RuntimeException rte) {
					return engine.printMessage("AiryAi: " + rte.getMessage());
				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_1_1;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class AiryAiPrime extends AbstractFunctionEvaluator {
		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr z = ast.arg1();

			if (z.isReal()) {
				try {
					return F.complexNum(BesselJS.airyAiPrime(z.evalDouble()));
				} catch (NegativeArraySizeException nae) {
					return engine.printMessage("AiryAiPrime: " + ast.toString() + " caused NegativeArraySizeException");
				} catch (RuntimeException rte) {
					return engine.printMessage("AiryAiPrime: " + rte.getMessage());
				}
			} else if (z.isNumeric()) {
				try {
					return F.complexNum(BesselJS.airyAiPrime(z.evalComplex()));
				} catch (NegativeArraySizeException nae) {
					return engine.printMessage("AiryAiPrime: " + ast.toString() + " caused NegativeArraySizeException");
				} catch (RuntimeException rte) {
					return engine.printMessage("AiryBiPrime: " + rte.getMessage());
				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_1_1;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class AiryBi extends AbstractFunctionEvaluator {
		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr z = ast.arg1();

			if (z.isReal()) {
				try {
					return F.complexNum(BesselJS.airyBi(z.evalDouble()));
				} catch (NegativeArraySizeException nae) {
					return engine.printMessage("AiryBi: " + ast.toString() + " caused NegativeArraySizeException");
				} catch (RuntimeException rte) {
					return engine.printMessage("AiryBi: " + rte.getMessage());
				}
			} else if (z.isNumeric()) {
				try {
					return F.complexNum(BesselJS.airyBi(z.evalComplex()));
				} catch (NegativeArraySizeException nae) {
					return engine.printMessage("AiryBi: " + ast.toString() + " caused NegativeArraySizeException");
				} catch (RuntimeException rte) {
					return engine.printMessage("AiryBi: " + rte.getMessage());
				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_1_1;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class AiryBiPrime extends AbstractFunctionEvaluator {
		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr z = ast.arg1();

			if (z.isReal()) {
				try {
					return F.complexNum(BesselJS.airyBiPrime(z.evalDouble()));
				} catch (NegativeArraySizeException nae) {
					return engine.printMessage("AiryBiPrime: " + ast.toString() + " caused NegativeArraySizeException");
				} catch (RuntimeException rte) {
					return engine.printMessage("AiryBiPrime: " + rte.getMessage());
				}
			} else if (z.isNumeric()) {
				try {
					return F.complexNum(BesselJS.airyBiPrime(z.evalComplex()));
				} catch (NegativeArraySizeException nae) {
					return engine.printMessage("AiryBiPrime: " + ast.toString() + " caused NegativeArraySizeException");
				} catch (RuntimeException rte) {
					return engine.printMessage("AiryAiPrime: " + rte.getMessage());
				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_1_1;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	/**
	 * <pre>
	 * BesselJ(n, z)
	 * </pre>
	 * 
	 * <blockquote>
	 * <p>
	 * Bessel function of the first kind.
	 * </p>
	 * </blockquote>
	 * <p>
	 * See
	 * </p>
	 * <ul>
	 * <li><a href="https://en.wikipedia.org/wiki/Bessel_function">Wikipedia - Bessel function</a></li>
	 * </ul>
	 * <h3>Examples</h3>
	 * 
	 * <pre>
	 * &gt;&gt; BesselJ(1, 3.6)
	 * 0.09547
	 * </pre>
	 */
	private final static class BesselJ extends AbstractFunctionEvaluator {

		/**
		 * Precondition <code> n - 1/2 </code> is an integer number.
		 * 
		 * @param n
		 * @param z
		 * @return
		 */
		private IExpr besselJHalf(IExpr n, IExpr z) {
			// (1/Sqrt(z))*Sqrt(2/Pi)*(Cos((1/2)*Pi*(n - 1/2) - z)*Sum(((-1)^j*(2*j + Abs(n) + 1/2)! * (2*z)^(-2*j -
			// 1))/
			// ((2*j + 1)! * (-2*j + Abs(n) - 3/2)!), {j, 0, Floor((1/4)*(2*Abs(n) - 3))}) - Sin((1/2)*Pi*(n - 1/2) -
			// z)*Sum(((-1)^j*(2*j + Abs(n) - 1/2)!)/ ((2*j)!*(-2*j + Abs(n) - 1/2)!*(2*z)^(2*j)), {j, 0,
			// Floor((1/4)*(2*Abs(n) - 1))}))
			ISymbol j = F.Dummy("j");
			return F.Times(F.CSqrt2, F.Power(F.Pi, F.CN1D2), F.Power(z, F.CN1D2), F.Plus(
					F.Times(F.Cos(F.Plus(F.Times(F.C1D2, F.Plus(F.CN1D2, n), F.Pi), F.Negate(z))), F.Sum(
							F.Times(F.Power(F.CN1, j), F.Power(F.Times(F.C2, z), F.Plus(F.CN1, F.Times(F.CN2, j))),
									F.Factorial(F.Plus(F.Times(F.C2, j), F.Abs(n), F.C1D2)),
									F.Power(F.Times(F.Factorial(F.Plus(F.Times(F.C2, j), F.C1)),
											F.Factorial(F.Plus(F.QQ(-3L, 2L), F.Times(F.CN2, j), F.Abs(n)))), -1)),
							F.List(j, F.C0, F.Floor(F.Times(F.C1D4, F.Plus(F.CN3, F.Times(F.C2, F.Abs(n)))))))),
					F.Times(F.CN1, F.Sin(F.Plus(F.Times(F.C1D2, F.Plus(F.CN1D2, n), F.Pi), F.Negate(z))), F.Sum(
							F.Times(F.Power(F.CN1, j),
									F.Power(F.Times(F.Factorial(F.Times(F.C2, j)),
											F.Factorial(F.Plus(F.CN1D2, F.Times(F.CN2, j), F.Abs(n))),
											F.Power(F.Times(F.C2, z), F.Times(F.C2, j))), -1),
									F.Factorial(F.Plus(F.CN1D2, F.Times(F.C2, j), F.Abs(n)))),
							F.List(j, F.C0, F.Floor(F.Times(F.C1D4, F.Plus(F.CN1, F.Times(F.C2, F.Abs(n))))))))));
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();
			final int order = n.toIntDefault(Integer.MIN_VALUE);
			if (z.isZero()) {
				if (n.isZero()) {
					// (0, 0)
					return F.C1;
				}
				if (n.isIntegerResult() || order != Integer.MIN_VALUE) {
					return F.C0;
				}

				IExpr a = n.re();
				if (a.isPositive()) {
					// Re(arg1) > 0
					return F.C0;
				} else if (a.isNegative()) {
					// Re(arg1) < 0 && !a.isInteger()
					return F.CComplexInfinity;
				} else if (a.isZero() && !n.isZero()) {
					return F.Indeterminate;
				}

			}
			if (n.isReal()) {
				IExpr in = engine.evaluate(((ISignedNumber) n).add(F.CN1D2));
				if (in.isNumIntValue()) {
					return besselJHalf(n, z);
					// if (n.equals(F.CN1D2) || n.equals(F.num(-0.5))) {
					// // (Sqrt(2/Pi)* Cos(z))/Sqrt(z)
					// return F.Times(F.Sqrt(F.Divide(F.C2, F.Pi)), F.Cos(z), F.Power(z, F.CN1D2));
					// }
					// if (n.equals(F.C1D2) || n.equals(F.num(0.5))) {
					// // (Sqrt(2/Pi)* Sin(z))/Sqrt(z)
					// return F.Times(F.Sqrt(F.Divide(F.C2, F.Pi)), F.Sin(z), F.Power(z, F.CN1D2));
					// }
				}
			}
			if (z.isInfinity() || z.isNegativeInfinity()) {
				return F.C0;
			}
			if (n.isInteger() || order != Integer.MIN_VALUE) {
				if (n.isNegative()) {
					// (-n,z) => (-1)^n*BesselJ(n,z)
					return F.Times(F.Power(F.CN1, n), F.BesselJ(n.negate(), z));
				}
			}

			if (engine.isDoubleMode()) {
				try {
					double nDouble = Double.NaN;
					double zDouble = Double.NaN;
					try {
						nDouble = n.evalDouble();
						zDouble = z.evalDouble();
					} catch (ValidateException ve) {
					}
					if (Double.isNaN(nDouble) || Double.isNaN(zDouble) || zDouble < 0.0) {
						Complex nc = n.evalComplex();
						Complex zc = z.evalComplex();
						return F.complexNum(BesselJS.besselJ(nc, zc));
					} else {
						return F.num(BesselJS.besselJDouble(nDouble, zDouble));
					}

				} catch (ValidateException ve) {
					if (Config.SHOW_STACKTRACE) {
						ve.printStackTrace();
					}
				} catch (RuntimeException rex) {
					// rex.printStackTrace();
					return engine.printMessage(ast.topHead() + ": " + rex.getMessage());
				}
			}

			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class BesselJZero extends AbstractFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();
			final int k = z.toIntDefault(Integer.MIN_VALUE);

			if (k > 0 && engine.isDoubleMode()) {
				try {
					// numeric mode evaluation
					if (n.isReal()) {
						return F.num(BesselJS.besselJZero(n.evalDouble(), k));
					}
				} catch (RuntimeException rte) {
					return engine.printMessage("BesselJZero: " + rte.getMessage());
				}
			}

			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class BesselI extends AbstractFunctionEvaluator implements BesselIRules {

		@Override
		public IAST getRuleAST() {
			return RULES;
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();
			// final int order = n.toIntDefault(Integer.MIN_VALUE);
			if (z.isZero()) {
				if (n.isZero()) {
					return F.C1;
				}
				if (n.isInteger()) {
					return F.C0;
				}
				IExpr re = n.re();
				if (re.isPositiveResult()) {
					return F.C0;
				}
				if (re.isNegativeResult() && n.isNumber() && !n.isInteger()) {
					return F.ComplexInfinity;
				}
				if (re.isZero() && n.isNumber() && !n.isZero()) {
					return F.Indeterminate;
				}
			}
			if (n.isNumber() && //
					(z.isDirectedInfinity(F.CI) || //
							z.isDirectedInfinity(F.CNI))) {
				return F.C0;
			}
			if (engine.isDoubleMode()) {
				try {
					double nDouble = Double.NaN;
					double zDouble = Double.NaN;
					try {
						nDouble = n.evalDouble();
						zDouble = z.evalDouble();
					} catch (ValidateException ve) {
					}
					if (Double.isNaN(nDouble) || Double.isNaN(zDouble) || zDouble < 0.0) {
						Complex nc = n.evalComplex();
						Complex zc = z.evalComplex();
						return F.complexNum(BesselJS.besselI(nc, zc));
					} else {
						return F.num(BesselJS.besselIDouble(nDouble, zDouble));
					}

				} catch (ValidateException ve) {
					if (Config.SHOW_STACKTRACE) {
						ve.printStackTrace();
					}
				} catch (RuntimeException rex) {
					// rex.printStackTrace();
					return engine.printMessage(ast.topHead() + ": " + rex.getMessage());
				}
			}

			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			super.setUp(newSymbol);
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class BesselK extends AbstractFunctionEvaluator implements BesselKRules {

		@Override
		public IAST getRuleAST() {
			return RULES;
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();
			// final int order = n.toIntDefault(Integer.MIN_VALUE);
			if (z.isZero()) {
				if (n.isZero()) {
					return F.CInfinity;
				}
				IExpr re = n.re();
				if (re.isZero() && n.isNumber() && !n.isZero()) {
					return F.Indeterminate;
				}
				if (re.isNumber() && !re.isZero()) {
					return F.ComplexInfinity;
				}
			}
			if (n.isNumber() && //
					(z.isDirectedInfinity(F.CI) || //
							z.isDirectedInfinity(F.CNI))) {
				return F.C0;
			}
			if (engine.isDoubleMode()) {
				try {
					double nDouble = Double.NaN;
					double zDouble = Double.NaN;
					try {
						nDouble = n.evalDouble();
						zDouble = z.evalDouble();
					} catch (ValidateException ve) {
					}
					if (Double.isNaN(nDouble) || Double.isNaN(zDouble) || zDouble < 0.0) {
						Complex nc = n.evalComplex();
						Complex zc = z.evalComplex();
						return F.complexNum(BesselJS.besselK(nc, zc));
					} else {
						return F.num(BesselJS.besselKDouble(nDouble, zDouble));
					}

				} catch (ValidateException ve) {
					if (Config.SHOW_STACKTRACE) {
						ve.printStackTrace();
					}
				} catch (RuntimeException rex) {
					// rex.printStackTrace();
					return engine.printMessage(ast.topHead() + ": " + rex.getMessage());
				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			super.setUp(newSymbol);
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class BesselY extends AbstractFunctionEvaluator implements BesselYRules {

		@Override
		public IAST getRuleAST() {
			return RULES;
		}

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();
			// final int order = n.toIntDefault(Integer.MIN_VALUE);

			if (z.isZero()) {
				if (n.isZero()) {
					return F.CNInfinity;
				}
				IExpr re = F.Re.of(engine, n);
				if (re.isZero() && n.isNumber() && !n.isZero()) {
					return F.Indeterminate;
				}
				if (re.isNumber() && !re.isZero()) {
					return F.ComplexInfinity;
				}
			}
			if (n.isNumber() && //
					(z.isInfinity() || //
							z.isNegativeInfinity())) {
				return F.C0;
			}
			if (engine.isDoubleMode()) {
				try {
					double nDouble = Double.NaN;
					double zDouble = Double.NaN;
					try {
						nDouble = n.evalDouble();
						zDouble = z.evalDouble();
					} catch (ValidateException ve) {
					}
					if (Double.isNaN(nDouble) || Double.isNaN(zDouble) || zDouble < 0.0) {
						Complex nc = n.evalComplex();
						Complex zc = z.evalComplex();
						return F.complexNum(BesselJS.besselY(nc, zc));
					} else {
						return F.num(BesselJS.besselYDouble(nDouble, zDouble));
					}

				} catch (ValidateException ve) {
					if (Config.SHOW_STACKTRACE) {
						ve.printStackTrace();
					}
				} catch (RuntimeException rex) {
					// rex.printStackTrace();
					return engine.printMessage(ast.topHead() + ": " + rex.getMessage());
				}
			}

			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			super.setUp(newSymbol);
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class BesselYZero extends AbstractFunctionEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();
			final int k = z.toIntDefault(Integer.MIN_VALUE);

			if (k > 0 && engine.isDoubleMode()) {
				try {
					// numeric mode evaluation
					if (n.isReal()) {
						return F.num(BesselJS.besselYZero(n.evalDouble(), k));
					}
				} catch (RuntimeException rte) {
					return engine.printMessage("BesselYZero: " + rte.getMessage());
				}
			}

			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class HankelH1 extends AbstractFunctionEvaluator {
		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();

			try {
				double nDouble = Double.NaN;
				double zDouble = Double.NaN;
				try {
					nDouble = n.evalDouble();
					zDouble = z.evalDouble();
				} catch (ValidateException ve) {
				}
				if (Double.isNaN(nDouble) || Double.isNaN(zDouble)) {
					Complex nc = n.evalComplex();
					Complex zc = z.evalComplex();
					return F.complexNum(BesselJS.hankelH1(nc, zc));
				} else {
					return F.complexNum(BesselJS.hankelH1(nDouble, zDouble));
				}

			} catch (ValidateException ve) {
				if (Config.SHOW_STACKTRACE) {
					ve.printStackTrace();
				}
			} catch (RuntimeException rex) {
				// rex.printStackTrace();
				return engine.printMessage(ast.topHead() + ": " + rex.getMessage());
			}

			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class HankelH2 extends AbstractFunctionEvaluator {
		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();

			try {
				double nDouble = Double.NaN;
				double zDouble = Double.NaN;
				try {
					nDouble = n.evalDouble();
					zDouble = z.evalDouble();
				} catch (ValidateException ve) {
				}
				if (Double.isNaN(nDouble) || Double.isNaN(zDouble)) {
					Complex nc = n.evalComplex();
					Complex zc = z.evalComplex();
					return F.complexNum(BesselJS.hankelH2(nc, zc));
				} else {
					return F.complexNum(BesselJS.hankelH2(nDouble, zDouble));
				}

			} catch (ValidateException ve) {
				if (Config.SHOW_STACKTRACE) {
					ve.printStackTrace();
				}
			} catch (RuntimeException rex) {
				// rex.printStackTrace();
				return engine.printMessage(ast.topHead() + ": " + rex.getMessage());
			}

			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class SphericalBesselJ extends AbstractFunctionEvaluator {
		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();
			if (engine.isDoubleMode()) {
				try {
					double nDouble = Double.NaN;
					double zDouble = Double.NaN;
					try {
						nDouble = n.evalDouble();
						zDouble = z.evalDouble();
					} catch (ValidateException ve) {
					}
					if (Double.isNaN(nDouble) || Double.isNaN(zDouble)) {
						Complex nc = n.evalComplex();
						Complex zc = z.evalComplex();
						return F.complexNum(BesselJS.sphericalBesselJ(nc, zc));
					} else {
						return F.complexNum(BesselJS.sphericalBesselJ(nDouble, zDouble));
					}

				} catch (ValidateException ve) {
					if (Config.SHOW_STACKTRACE) {
						ve.printStackTrace();
					}
				} catch (RuntimeException rex) {
					// rex.printStackTrace();
					return engine.printMessage(ast.topHead() + ": " + rex.getMessage());
				}
			}
			// if (n.isReal() && z.isReal()) {
			// try {
			// return F.complexNum(BesselJS.sphericalBesselJ(n.evalDouble(), z.evalDouble()));
			// } catch (NegativeArraySizeException nae) {
			// return engine
			// .printMessage("SphericalBesselJ: " + ast.toString() + " caused NegativeArraySizeException");
			// } catch (RuntimeException rte) {
			// return engine.printMessage("SphericalBesselJ: " + rte.getMessage());
			// }
			// }
			// if (n.isNumeric() && z.isNumeric()) {
			// try {
			// return F.complexNum(BesselJS.sphericalBesselJ(n.evalComplex(), z.evalComplex()));
			// } catch (NegativeArraySizeException nae) {
			// return engine
			// .printMessage("SphericalBesselJ: " + ast.toString() + " caused NegativeArraySizeException");
			// } catch (RuntimeException rte) {
			// return engine.printMessage("SphericalBesselJ: " + rte.getMessage());
			// }
			// }
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	private final static class SphericalBesselY extends AbstractFunctionEvaluator {
		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr n = ast.arg1();
			IExpr z = ast.arg2();

			if (engine.isDoubleMode()) {
				try {
					double nDouble = Double.NaN;
					double zDouble = Double.NaN;
					try {
						nDouble = n.evalDouble();
						zDouble = z.evalDouble();
					} catch (ValidateException ve) {
					}
					if (Double.isNaN(nDouble) || Double.isNaN(zDouble) || zDouble < 0.0) {
						Complex nc = n.evalComplex();
						Complex zc = z.evalComplex();
						return F.complexNum(BesselJS.sphericalBesselY(nc, zc));
					} else {
						return F.complexNum(BesselJS.sphericalBesselY(nDouble, zDouble));
					}

				} catch (ValidateException ve) {
					if (Config.SHOW_STACKTRACE) {
						ve.printStackTrace();
					}
				} catch (RuntimeException rex) {
					// rex.printStackTrace();
					return engine.printMessage(ast.topHead() + ": " + rex.getMessage());
				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}

		@Override
		public void setUp(final ISymbol newSymbol) {
			newSymbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		}
	}

	public static void initialize() {
		Initializer.init();
	}

	private BesselFunctions() {

	}
}
