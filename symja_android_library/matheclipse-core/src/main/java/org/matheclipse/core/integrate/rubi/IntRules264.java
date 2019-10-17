package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules264 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(6601,Int(Times(Log(Plus(C1,Times(e_DEFAULT,x_))),Power(x_,CN1),PolyLog(C2,Times(c_DEFAULT,x_))),x_Symbol),
    Condition(Negate(Simp(Times(C1D2,Sqr(PolyLog(C2,Times(c,x)))),x)),And(FreeQ(List(c,e),x),EqQ(Plus(c,e),C0))));
IIntegrate(6602,Int(Times(Plus(Times(Log(Plus(C1,Times(e_DEFAULT,x_))),h_DEFAULT),g_),Power(x_,CN1),PolyLog(C2,Times(c_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Dist(g,Int(Times(PolyLog(C2,Times(c,x)),Power(x,CN1)),x),x),Dist(h,Int(Times(Log(Plus(C1,Times(e,x))),PolyLog(C2,Times(c,x)),Power(x,CN1)),x),x)),And(FreeQ(List(c,e,g,h),x),EqQ(Plus(c,e),C0))));
IIntegrate(6603,Int(Times(Plus(g_DEFAULT,Times(Log(Times(f_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),h_DEFAULT)),Power(x_,m_DEFAULT),PolyLog(C2,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Plus(g,Times(h,Log(Times(f,Power(Plus(d,Times(e,x)),n))))),PolyLog(C2,Times(c,Plus(a,Times(b,x)))),Power(Plus(m,C1),CN1)),x),Dist(Times(b,Power(Plus(m,C1),CN1)),Int(ExpandIntegrand(Times(Plus(g,Times(h,Log(Times(f,Power(Plus(d,Times(e,x)),n))))),Log(Subtract(Subtract(C1,Times(a,c)),Times(b,c,x)))),Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,x)),CN1)),x),x),x),Negate(Dist(Times(e,h,n,Power(Plus(m,C1),CN1)),Int(ExpandIntegrand(PolyLog(C2,Times(c,Plus(a,Times(b,x)))),Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,x)),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h,n),x),IntegerQ(m),NeQ(m,CN1))));
IIntegrate(6604,Int(Times(Plus(g_DEFAULT,Times(Log(Times(f_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),h_DEFAULT)),$p("§px"),PolyLog(C2,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(u,IntHide($s("§px"),x))),Plus(Simp(Times(u,Plus(g,Times(h,Log(Times(f,Power(Plus(d,Times(e,x)),n))))),PolyLog(C2,Times(c,Plus(a,Times(b,x))))),x),Dist(b,Int(ExpandIntegrand(Times(Plus(g,Times(h,Log(Times(f,Power(Plus(d,Times(e,x)),n))))),Log(Subtract(Subtract(C1,Times(a,c)),Times(b,c,x)))),Times(u,Power(Plus(a,Times(b,x)),CN1)),x),x),x),Negate(Dist(Times(e,h,n),Int(ExpandIntegrand(PolyLog(C2,Times(c,Plus(a,Times(b,x)))),Times(u,Power(Plus(d,Times(e,x)),CN1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g,h,n),x),PolyQ($s("§px"),x))));
IIntegrate(6605,Int(Times(Plus(g_DEFAULT,Times(Log(Plus(C1,Times(e_DEFAULT,x_))),h_DEFAULT)),$p("§px"),Power(x_,m_),PolyLog(C2,Times(c_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Dist(Coeff($s("§px"),x,Subtract(Negate(m),C1)),Int(Times(Plus(g,Times(h,Log(Plus(C1,Times(e,x))))),PolyLog(C2,Times(c,x)),Power(x,CN1)),x),x),Int(Times(Power(x,m),Subtract($s("§px"),Times(Coeff($s("§px"),x,Subtract(Negate(m),C1)),Power(x,Subtract(Negate(m),C1)))),Plus(g,Times(h,Log(Plus(C1,Times(e,x))))),PolyLog(C2,Times(c,x))),x)),And(FreeQ(List(c,e,g,h),x),PolyQ($s("§px"),x),ILtQ(m,C0),EqQ(Plus(c,e),C0),NeQ(Coeff($s("§px"),x,Subtract(Negate(m),C1)),C0))));
IIntegrate(6606,Int(Times(Plus(g_DEFAULT,Times(Log(Times(f_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),h_DEFAULT)),$p("§px"),Power(x_,m_DEFAULT),PolyLog(C2,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(x,m),$s("§px")),x))),Plus(Simp(Times(u,Plus(g,Times(h,Log(Times(f,Power(Plus(d,Times(e,x)),n))))),PolyLog(C2,Times(c,Plus(a,Times(b,x))))),x),Dist(b,Int(ExpandIntegrand(Times(Plus(g,Times(h,Log(Times(f,Power(Plus(d,Times(e,x)),n))))),Log(Subtract(Subtract(C1,Times(a,c)),Times(b,c,x)))),Times(u,Power(Plus(a,Times(b,x)),CN1)),x),x),x),Negate(Dist(Times(e,h,n),Int(ExpandIntegrand(PolyLog(C2,Times(c,Plus(a,Times(b,x)))),Times(u,Power(Plus(d,Times(e,x)),CN1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e,f,g,h,n),x),PolyQ($s("§px"),x),IntegerQ(m))));
IIntegrate(6607,Int(Times(Plus(g_DEFAULT,Times(Log(Times(f_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),h_DEFAULT)),$p("§px",true),Power(x_,m_),PolyLog(C2,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(Unintegrable(Times($s("§px"),Power(x,m),Plus(g,Times(h,Log(Times(f,Power(Plus(d,Times(e,x)),n))))),PolyLog(C2,Times(c,Plus(a,Times(b,x))))),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n),x),PolyQ($s("§px"),x))));
IIntegrate(6608,Int(PolyLog(n_,Times(d_DEFAULT,Power(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_DEFAULT))),x_Symbol),
    Condition(Simp(Times(PolyLog(Plus(n,C1),Times(d,Power(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),p))),Power(Times(b,c,p,Log(FSymbol)),CN1)),x),FreeQ(List(FSymbol,a,b,c,d,n,p),x)));
IIntegrate(6609,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),PolyLog(n_,Times(d_DEFAULT,Power(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_DEFAULT)))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(e,Times(f,x)),m),PolyLog(Plus(n,C1),Times(d,Power(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),p))),Power(Times(b,c,p,Log(FSymbol)),CN1)),x),Dist(Times(f,m,Power(Times(b,c,p,Log(FSymbol)),CN1)),Int(Times(Power(Plus(e,Times(f,x)),Subtract(m,C1)),PolyLog(Plus(n,C1),Times(d,Power(Power(FSymbol,Times(c,Plus(a,Times(b,x)))),p)))),x),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,f,n,p),x),GtQ(m,C0))));
IIntegrate(6610,Int(Times(u_,PolyLog(n_,v_)),x_Symbol),
    Condition(With(List(Set(w,DerivativeDivides(v,Times(u,v),x))),Condition(Simp(Times(w,PolyLog(Plus(n,C1),v)),x),Not(FalseQ(w)))),FreeQ(n,x)));
IIntegrate(6611,Int(Times(Log(w_),u_,PolyLog(n_,v_)),x_Symbol),
    Condition(With(List(Set(z,DerivativeDivides(v,Times(u,v),x))),Condition(Subtract(Simp(Times(z,Log(w),PolyLog(Plus(n,C1),v)),x),Int(SimplifyIntegrand(Times(z,D(w,x),PolyLog(Plus(n,C1),v),Power(w,CN1)),x),x)),Not(FalseQ(z)))),And(FreeQ(n,x),InverseFunctionFreeQ(w,x))));
IIntegrate(6612,Int(Power(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_),x_Symbol),
    Condition(Plus(Simp(Times(Plus(a,Times(b,x)),Power(Times(c,ProductLog(Plus(a,Times(b,x)))),p),Power(Times(b,Plus(p,C1)),CN1)),x),Dist(Times(p,Power(Times(c,Plus(p,C1)),CN1)),Int(Times(Power(Times(c,ProductLog(Plus(a,Times(b,x)))),Plus(p,C1)),Power(Plus(C1,ProductLog(Plus(a,Times(b,x)))),CN1)),x),x)),And(FreeQ(List(a,b,c),x),LtQ(p,CN1))));
IIntegrate(6613,Int(Power(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_DEFAULT),x_Symbol),
    Condition(Subtract(Simp(Times(Plus(a,Times(b,x)),Power(Times(c,ProductLog(Plus(a,Times(b,x)))),p),Power(b,CN1)),x),Dist(p,Int(Times(Power(Times(c,ProductLog(Plus(a,Times(b,x)))),p),Power(Plus(C1,ProductLog(Plus(a,Times(b,x)))),CN1)),x),x)),And(FreeQ(List(a,b,c),x),Not(LtQ(p,CN1)))));
IIntegrate(6614,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Plus(a_,Times(b_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(b,Plus(m,C1)),CN1),Subst(Int(ExpandIntegrand(Power(Times(c,ProductLog(x)),p),Power(Plus(Times(b,e),Times(CN1,a,f),Times(f,x)),m),x),x),x,Plus(a,Times(b,x))),x),And(FreeQ(List(a,b,c,e,f,p),x),IGtQ(m,C0))));
IIntegrate(6615,Int(Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Subtract(Simp(Times(x,Power(Times(c,ProductLog(Times(a,Power(x,n)))),p)),x),Dist(Times(n,p),Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(C1,ProductLog(Times(a,Power(x,n)))),CN1)),x),x)),And(FreeQ(List(a,c,n,p),x),Or(EqQ(Times(n,Subtract(p,C1)),CN1),And(IntegerQ(Subtract(p,C1D2)),EqQ(Times(n,Subtract(p,C1D2)),CN1))))));
IIntegrate(6616,Int(Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(Times(n,p),C1),CN1)),x),Dist(Times(n,p,Power(Times(c,Plus(Times(n,p),C1)),CN1)),Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,C1)),Power(Plus(C1,ProductLog(Times(a,Power(x,n)))),CN1)),x),x)),And(FreeQ(List(a,c,n),x),Or(And(IntegerQ(p),EqQ(Times(n,Plus(p,C1)),CN1)),And(IntegerQ(Subtract(p,C1D2)),EqQ(Times(n,Plus(p,C1D2)),CN1))))));
IIntegrate(6617,Int(Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Times(c,ProductLog(Times(a,Power(Power(x,n),CN1)))),p),Power(x,CN2)),x),x,Power(x,CN1))),And(FreeQ(List(a,c,p),x),ILtQ(n,C0))));
IIntegrate(6618,Int(Times(Power(x_,m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(x,Plus(m,C1)),Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(m,C1),CN1)),x),Dist(Times(n,p,Power(Plus(m,C1),CN1)),Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(C1,ProductLog(Times(a,Power(x,n)))),CN1)),x),x)),And(FreeQ(List(a,c,m,n,p),x),NeQ(m,CN1),Or(And(IntegerQ(Subtract(p,C1D2)),IGtQ(Times(C2,Simplify(Plus(p,Times(Plus(m,C1),Power(n,CN1))))),C0)),And(Not(IntegerQ(Subtract(p,C1D2))),IGtQ(Plus(Simplify(Plus(p,Times(Plus(m,C1),Power(n,CN1)))),C1),C0))))));
IIntegrate(6619,Int(Times(Power(x_,m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(m,Times(n,p),C1),CN1)),x),Dist(Times(n,p,Power(Times(c,Plus(m,Times(n,p),C1)),CN1)),Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,C1)),Power(Plus(C1,ProductLog(Times(a,Power(x,n)))),CN1)),x),x)),And(FreeQ(List(a,c,m,n,p),x),Or(EqQ(m,CN1),And(IntegerQ(Subtract(p,C1D2)),ILtQ(Subtract(Simplify(Plus(p,Times(Plus(m,C1),Power(n,CN1)))),C1D2),C0)),And(Not(IntegerQ(Subtract(p,C1D2))),ILtQ(Simplify(Plus(p,Times(Plus(m,C1),Power(n,CN1)))),C0))))));
IIntegrate(6620,Int(Times(Power(x_,m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,x))),p),Power(Plus(C1,ProductLog(Times(a,x))),CN1)),x),Dist(Power(c,CN1),Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,x))),Plus(p,C1)),Power(Plus(C1,ProductLog(Times(a,x))),CN1)),x),x)),FreeQ(List(a,c,m),x)));
IIntegrate(6621,Int(Times(Power(x_,m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Times(c,ProductLog(Times(a,Power(Power(x,n),CN1)))),p),Power(Power(x,Plus(m,C2)),CN1)),x),x,Power(x,CN1))),And(FreeQ(List(a,c,p),x),ILtQ(n,C0),IntegerQ(m),NeQ(m,CN1))));
IIntegrate(6622,Int(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),CN1),x_Symbol),
    Condition(Simp(Times(Plus(a,Times(b,x)),Power(Times(b,d,ProductLog(Plus(a,Times(b,x)))),CN1)),x),FreeQ(List(a,b,d),x)));
IIntegrate(6623,Int(Times(ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(d,x),x),Int(Power(Plus(d,Times(d,ProductLog(Plus(a,Times(b,x))))),CN1),x)),FreeQ(List(a,b,d),x)));
IIntegrate(6624,Int(Times(Power(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(c,Plus(a,Times(b,x)),Power(Times(c,ProductLog(Plus(a,Times(b,x)))),Subtract(p,C1)),Power(Times(b,d),CN1)),x),Dist(Times(c,p),Int(Times(Power(Times(c,ProductLog(Plus(a,Times(b,x)))),Subtract(p,C1)),Power(Plus(d,Times(d,ProductLog(Plus(a,Times(b,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),GtQ(p,C0))));
IIntegrate(6625,Int(Times(Power(ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),CN1),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Simp(Times(ExpIntegralEi(ProductLog(Plus(a,Times(b,x)))),Power(Times(b,d),CN1)),x),FreeQ(List(a,b,d),x)));
  }
}
}