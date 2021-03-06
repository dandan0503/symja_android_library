package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface Hypergeometric2F1Rules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 3, 6 };

  final public static IAST RULES = List(
    IInit(Hypergeometric2F1, SIZES),
    // Hypergeometric2F1(0,b_,c_,z_)=1
    ISet(Hypergeometric2F1(C0,b_,c_,z_),
      C1),
    // Hypergeometric2F1(a_,0,c_,z_)=1
    ISet(Hypergeometric2F1(a_,C0,c_,z_),
      C1),
    // Hypergeometric2F1(a_,b_,c_,0)=1
    ISet(Hypergeometric2F1(a_,b_,c_,C0),
      C1),
    // Hypergeometric2F1(1/2,1/2,3/2,z_):=ArcSin(Sqrt(z))/Sqrt(z)
    ISetDelayed(Hypergeometric2F1(C1D2,C1D2,QQ(3L,2L),z_),
      Times(Power(z,CN1D2),ArcSin(Sqrt(z)))),
    // Hypergeometric2F1(1/2,1,3/2,z_):=ArcTanh(Sqrt(z))/Sqrt(z)
    ISetDelayed(Hypergeometric2F1(C1D2,C1,QQ(3L,2L),z_),
      Times(Power(z,CN1D2),ArcTanh(Sqrt(z)))),
    // Hypergeometric2F1(1,1,2,z_):=-Log(1-z)/z
    ISetDelayed(Hypergeometric2F1(C1,C1,C2,z_),
      Times(CN1,Power(z,CN1),Log(Subtract(C1,z)))),
    // Hypergeometric2F1(1,b_,2,z_):=-(-1+(1-z)^b+z)/((1-z)^b*(-1+b)*z)
    ISetDelayed(Hypergeometric2F1(C1,b_,C2,z_),
      Times(CN1,Plus(CN1,Power(Subtract(C1,z),b),z),Power(Times(Power(Subtract(C1,z),b),Plus(CN1,b),z),CN1))),
    // Hypergeometric2F1(1,2,3/2,z_):=(Sqrt(z)*Sqrt(1-z)+ArcSin(Sqrt(z)))/(2*(1-z)^(3/2)*Sqrt(z))
    ISetDelayed(Hypergeometric2F1(C1,C2,QQ(3L,2L),z_),
      Times(Power(Times(C2,Power(Subtract(C1,z),QQ(3L,2L)),Sqrt(z)),CN1),Plus(Times(Sqrt(z),Sqrt(Subtract(C1,z))),ArcSin(Sqrt(z))))),
    // Hypergeometric2F1(3/2,2,5/2,a_.*z_^n_.):=((-1)*3*(Sqrt(a)*z^(n/2)-ArcTanh(Sqrt(a)*z^(n/2))+a*z^n*ArcTanh(Sqrt(a)*z^(n/2))))/(z^(1/2*3*n)*2*a^(3/2)*(-1+a*z^n))
    ISetDelayed(Hypergeometric2F1(QQ(3L,2L),C2,QQ(5L,2L),Times(a_DEFAULT,Power(z_,n_DEFAULT))),
      Times(CN1,C3,Power(Times(Power(z,Times(C1D2,C3,n)),C2,Power(a,QQ(3L,2L)),Plus(CN1,Times(a,Power(z,n)))),CN1),Plus(Times(Sqrt(a),Power(z,Times(C1D2,n))),Negate(ArcTanh(Times(Sqrt(a),Power(z,Times(C1D2,n))))),Times(a,Power(z,n),ArcTanh(Times(Sqrt(a),Power(z,Times(C1D2,n)))))))),
    // Hypergeometric2F1(m_Integer,n_Integer,2,1):=CatalanNumber(-n)/;n<0&&m==n+1
    ISetDelayed(Hypergeometric2F1($p(m, Integer),$p(n, Integer),C2,C1),
      Condition(CatalanNumber(Negate(n)),And(Less(n,C0),Equal(m,Plus(n,C1))))),
    // Hypergeometric2F1(a_,b_,c_,z_):=(-1/(-1+b)+b/(-1+b)+z/(-1+b)+z*a/(-1+b)-b/(-1+b)*z)/(1-z)^(1+a)/;NumberQ(b)&&NumberQ(c)&&!(IntegerQ(c)&&c<0)&&PossibleZeroQ(-1+b-c)
    ISetDelayed(Hypergeometric2F1(a_,b_,c_,z_),
      Condition(Times(Power(Subtract(C1,z),Subtract(CN1,a)),Plus(Negate(Power(Plus(CN1,b),CN1)),Times(Power(Plus(CN1,b),CN1),b),Times(Power(Plus(CN1,b),CN1),z),Times(z,a,Power(Plus(CN1,b),CN1)),Times(CN1,Power(Plus(CN1,b),CN1),b,z))),And(And(NumberQ(b),NumberQ(c)),Not(And(IntegerQ(c),Less(c,C0))),PossibleZeroQ(Plus(CN1,b,Negate(c)))))),
    // Hypergeometric2F1(b_,a_,c_,z_):=(-1/(-1+b)+b/(-1+b)+z/(-1+b)+z*a/(-1+b)-b/(-1+b)*z)/(1-z)^(1+a)/;NumberQ(b)&&NumberQ(c)&&!(IntegerQ(c)&&c<0)&&PossibleZeroQ(-1+b-c)
    ISetDelayed(Hypergeometric2F1(b_,a_,c_,z_),
      Condition(Times(Power(Subtract(C1,z),Subtract(CN1,a)),Plus(Negate(Power(Plus(CN1,b),CN1)),Times(Power(Plus(CN1,b),CN1),b),Times(Power(Plus(CN1,b),CN1),z),Times(z,a,Power(Plus(CN1,b),CN1)),Times(CN1,Power(Plus(CN1,b),CN1),b,z))),And(And(NumberQ(b),NumberQ(c)),Not(And(IntegerQ(c),Less(c,C0))),PossibleZeroQ(Plus(CN1,b,Negate(c))))))
  );
}
