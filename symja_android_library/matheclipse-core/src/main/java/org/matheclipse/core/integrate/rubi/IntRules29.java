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
public class IntRules29 { 
  public static IAST RULES = List( 
IIntegrate(1451,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("mn")))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(x,Times(n,p)),-1)),x),And(FreeQ(List(a,b,c,d,e,n,q),x),EqQ($s("mn"),Negate(n)),IntegerQ(p)))),
IIntegrate(1452,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("mn")))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(n,FracPart(p))),Power(Plus(a,Times(b,Power(Power(x,n),-1)),Times(c,Power(x,n))),FracPart(p)),Power(Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),-1)),Int(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(x,Times(n,p)),-1)),x),x),And(FreeQ(List(a,b,c,d,e,n,p,q),x),EqQ($s("mn"),Negate(n)),Not(IntegerQ(p))))),
IIntegrate(1453,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Power(x_,n_))),r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(Times(C4,c),IntPart(p)),Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,FracPart(p)))),-1)),Int(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(f,Times(g,Power(x,n))),r),Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n,p,q,r),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(1454,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Power(x_,n_))),r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(p,q)),Power(Plus(f,Times(g,Power(x,n))),r),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),p)),x),And(FreeQ(List(a,b,c,d,e,f,g,n,q,r),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(p)))),
IIntegrate(1455,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Power(x_,n_))),r_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(p,q)),Power(Plus(f,Times(g,Power(x,n))),r),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),p)),x),And(FreeQ(List(a,c,d,e,f,g,n,q,r),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IntegerQ(p)))),
IIntegrate(1456,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Power(x_,n_))),r_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(Plus(d,Times(e,Power(x,n))),FracPart(p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),FracPart(p))),-1)),Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(p,q)),Power(Plus(f,Times(g,Power(x,n))),r),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n,p,q,r),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p))))),
IIntegrate(1457,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Power(x_,n_))),r_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(Plus(d,Times(e,Power(x,n))),FracPart(p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),FracPart(p))),-1)),Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(p,q)),Power(Plus(f,Times(g,Power(x,n))),r),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),p)),x),x),And(FreeQ(List(a,c,d,e,f,g,n,p,q,r),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p))))),
IIntegrate(1458,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),Power(x_,$p("non2",true)))),q_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),Power(x_,$p("non2",true)))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(Times($s("d1"),$s("d2")),Times($s("e1"),$s("e2"),Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ($s("non2"),Times(C1D2,n)),EqQ(Plus(Times($s("d2"),$s("e1")),Times($s("d1"),$s("e2"))),C0),Or(IntegerQ(q),And(GtQ($s("d1"),C0),GtQ($s("d2"),C0)))))),
IIntegrate(1459,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),Power(x_,$p("non2",true)))),q_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),Power(x_,$p("non2",true)))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus($s("d1"),Times($s("e1"),Power(x,Times(C1D2,n)))),FracPart(q)),Power(Plus($s("d2"),Times($s("e2"),Power(x,Times(C1D2,n)))),FracPart(q)),Power(Power(Plus(Times($s("d1"),$s("d2")),Times($s("e1"),$s("e2"),Power(x,n))),FracPart(q)),-1)),Int(Times(Power(Plus(Times($s("d1"),$s("d2")),Times($s("e1"),$s("e2"),Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ($s("non2"),Times(C1D2,n)),EqQ(Plus(Times($s("d2"),$s("e1")),Times($s("d1"),$s("e2"))),C0)))),
IIntegrate(1460,Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,m_DEFAULT))),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(ASymbol,Int(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),Dist(BSymbol,Int(Times(Power(x,m),Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(m,Negate(n),C1),C0)))),
IIntegrate(1461,Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,m_DEFAULT))),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(ASymbol,Int(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x),Dist(BSymbol,Int(Times(Power(x,m),Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x)),And(FreeQ(List(a,c,d,e,ASymbol,BSymbol,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(m,Negate(n),C1),C0)))),
IIntegrate(1462,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Times(e_DEFAULT,Power(x_,n_)),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,m),Power(Times(n,Power(e,Plus(Times(Plus(m,C1),Power(n,-1)),Negate(C1)))),-1)),Subst(Int(Times(Power(Times(e,x),Plus(q,Times(Plus(m,C1),Power(n,-1)),Negate(C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),Or(IntegerQ(m),GtQ(f,C0)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(1463,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Times(e_DEFAULT,Power(x_,n_)),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,m),Power(Times(n,Power(e,Plus(Times(Plus(m,C1),Power(n,-1)),Negate(C1)))),-1)),Subst(Int(Times(Power(Times(e,x),Plus(q,Times(Plus(m,C1),Power(n,-1)),Negate(C1))),Power(Plus(a,Times(c,Sqr(x))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,c,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),Or(IntegerQ(m),GtQ(f,C0)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(1464,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Times(e_DEFAULT,Power(x_,n_)),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,m),Power(e,IntPart(q)),Power(Times(e,Power(x,n)),FracPart(q)),Power(Power(x,Times(n,FracPart(q))),-1)),Int(Times(Power(x,Plus(m,Times(n,q))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),Or(IntegerQ(m),GtQ(f,C0)),Not(IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))))))),
IIntegrate(1465,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Times(e_DEFAULT,Power(x_,n_)),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,m),Power(e,IntPart(q)),Power(Times(e,Power(x,n)),FracPart(q)),Power(Power(x,Times(n,FracPart(q))),-1)),Int(Times(Power(x,Plus(m,Times(n,q))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,c,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),Or(IntegerQ(m),GtQ(f,C0)),Not(IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1)))))))),
IIntegrate(1466,Int(Times(Power(Times(f_,x_),m_DEFAULT),Power(Times(e_DEFAULT,Power(x_,n_)),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,IntPart(m)),Power(Times(f,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Times(e,Power(x,n)),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(m))))),
IIntegrate(1467,Int(Times(Power(Times(f_,x_),m_DEFAULT),Power(Times(e_DEFAULT,Power(x_,n_)),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,IntPart(m)),Power(Times(f,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Times(e,Power(x,n)),q),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,c,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(m))))),
IIntegrate(1468,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(Plus(d,Times(e,x)),q),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Simplify(Plus(m,Negate(n),C1)),C0)))),
IIntegrate(1469,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(Plus(d,Times(e,x)),q),Power(Plus(a,Times(c,Sqr(x))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,c,d,e,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Simplify(Plus(m,Negate(n),C1)),C0)))),
IIntegrate(1470,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,Plus(Times(C2,p),q)))),Power(Plus(e,Times(d,Power(Power(x,n),-1))),q),Power(Plus(c,Times(b,Power(Power(x,n),-1)),Times(a,Power(Power(x,Times(C2,n)),-1))),p)),x),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),IntegersQ(p,q),NegQ(n)))),
IIntegrate(1471,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Plus(m,Times(n,Plus(Times(C2,p),q)))),Power(Plus(e,Times(d,Power(Power(x,n),-1))),q),Power(Plus(c,Times(a,Power(Power(x,Times(C2,n)),-1))),p)),x),And(FreeQ(List(a,c,d,e,m,n),x),EqQ($s("n2"),Times(C2,n)),IntegersQ(p,q),NegQ(n)))),
IIntegrate(1472,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(n,-1)),Negate(C1))),Power(Plus(d,Times(e,x)),q),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p)),IGtQ(m,C0),IGtQ(n,C0),IGtQ(Times(Plus(m,C1),Power(n,-1)),C0)))),
IIntegrate(1473,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(c,IntPart(p)),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,FracPart(p)))),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),Not(IntegerQ(p))))),
IIntegrate(1474,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(d,Times(e,x)),q),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(1475,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(d,Times(e,x)),q),Power(Plus(a,Times(c,Sqr(x))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,c,d,e,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(1476,Int(Times(Power(Times(f_,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,IntPart(m)),Power(Times(f,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(1477,Int(Times(Power(Times(f_,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(f,IntPart(m)),Power(Times(f,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,c,d,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,-1))))))),
IIntegrate(1478,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,n))),Plus(q,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),p)),x),And(FreeQ(List(a,b,c,d,e,f,m,n,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(p)))),
IIntegrate(1479,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,n))),Plus(q,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),p)),x),And(FreeQ(List(a,c,d,e,f,q,m,n,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IntegerQ(p)))),
IIntegrate(1480,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(Plus(d,Times(e,Power(x,n))),FracPart(p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,n))),Plus(q,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(p))))),
IIntegrate(1481,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(Plus(d,Times(e,Power(x,n))),FracPart(p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),FracPart(p))),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,n))),Plus(q,p)),Power(Plus(Times(a,Power(d,-1)),Times(c,Power(x,n),Power(e,-1))),p)),x),x),And(FreeQ(List(a,c,d,e,f,m,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p))))),
IIntegrate(1482,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Negate(d),Plus(Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)),Negate(C1))),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),p),Power(x,Plus(Mod(m,n),C1)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Power(Times(n,Power(e,Plus(Times(C2,p),Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)))),Plus(q,C1)),-1)),x),Dist(Power(Times(n,Power(e,Plus(Times(C2,p),Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)))),Plus(q,C1)),-1),Int(Times(Power(x,Mod(m,n)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),ExpandToSum(Together(Times(C1,Plus(Times(n,Power(e,Plus(Times(C2,p),Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)))),Plus(q,C1),Power(x,Plus(m,Negate(Mod(m,n)))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),Times(CN1,Power(Negate(d),Plus(Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)),Negate(C1))),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),p),Plus(Times(d,Plus(Mod(m,n),C1)),Times(e,Plus(Mod(m,n),Times(n,Plus(q,C1)),C1),Power(x,n))))),Power(Plus(d,Times(e,Power(x,n))),-1))),x)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IGtQ(p,C0),ILtQ(q,CN1),IGtQ(m,C0)))),
IIntegrate(1483,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Negate(d),Plus(Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)),Negate(C1))),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),p),Power(x,Plus(Mod(m,n),C1)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Power(Times(n,Power(e,Plus(Times(C2,p),Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)))),Plus(q,C1)),-1)),x),Dist(Power(Times(n,Power(e,Plus(Times(C2,p),Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)))),Plus(q,C1)),-1),Int(Times(Power(x,Mod(m,n)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),ExpandToSum(Together(Times(C1,Plus(Times(n,Power(e,Plus(Times(C2,p),Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)))),Plus(q,C1),Power(x,Plus(m,Negate(Mod(m,n)))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),Times(CN1,Power(Negate(d),Plus(Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)),Negate(C1))),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),p),Plus(Times(d,Plus(Mod(m,n),C1)),Times(e,Plus(Mod(m,n),Times(n,Plus(q,C1)),C1),Power(x,n))))),Power(Plus(d,Times(e,Power(x,n))),-1))),x)),x),x)),And(FreeQ(List(a,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),IGtQ(p,C0),ILtQ(q,CN1),IGtQ(m,C0)))),
IIntegrate(1484,Int(Times(Power(x_,m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Negate(d),Plus(Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)),Negate(C1))),Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),p),Power(x,Plus(Mod(m,n),C1)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Power(Times(n,Power(e,Plus(Times(C2,p),Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)))),Plus(q,C1)),-1)),x),Dist(Times(Power(Negate(d),Plus(Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)),Negate(C1))),Power(Times(n,Power(e,Times(C2,p)),Plus(q,C1)),-1)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),ExpandToSum(Together(Times(C1,Plus(Times(n,Power(Negate(d),Plus(Times(CN1,Plus(m,Negate(Mod(m,n))),Power(n,-1)),C1)),Power(e,Times(C2,p)),Plus(q,C1),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),Times(CN1,Power(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),p),Power(Times(Power(e,Times(Plus(m,Negate(Mod(m,n))),Power(n,-1))),Power(x,Plus(m,Negate(Mod(m,n))))),-1),Plus(Times(d,Plus(Mod(m,n),C1)),Times(e,Plus(Mod(m,n),Times(n,Plus(q,C1)),C1),Power(x,n))))),Power(Plus(d,Times(e,Power(x,n))),-1))),x)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IGtQ(p,C0),ILtQ(q,CN1),ILtQ(m,C0)))),
IIntegrate(1485,Int(Times(Power(x_,m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Negate(d),Plus(Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)),Negate(C1))),Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),p),Power(x,Plus(Mod(m,n),C1)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Power(Times(n,Power(e,Plus(Times(C2,p),Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)))),Plus(q,C1)),-1)),x),Dist(Times(Power(Negate(d),Plus(Times(Plus(m,Negate(Mod(m,n))),Power(n,-1)),Negate(C1))),Power(Times(n,Power(e,Times(C2,p)),Plus(q,C1)),-1)),Int(Times(Power(x,m),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),ExpandToSum(Together(Times(C1,Plus(Times(n,Power(Negate(d),Plus(Times(CN1,Plus(m,Negate(Mod(m,n))),Power(n,-1)),C1)),Power(e,Times(C2,p)),Plus(q,C1),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),Times(CN1,Power(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),p),Power(Times(Power(e,Times(Plus(m,Negate(Mod(m,n))),Power(n,-1))),Power(x,Plus(m,Negate(Mod(m,n))))),-1),Plus(Times(d,Plus(Mod(m,n),C1)),Times(e,Plus(Mod(m,n),Times(n,Plus(q,C1)),C1),Power(x,n))))),Power(Plus(d,Times(e,Power(x,n))),-1))),x)),x),x)),And(FreeQ(List(a,c,d,e),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),IGtQ(p,C0),IntegersQ(m,q),ILtQ(q,CN1),ILtQ(m,C0)))),
IIntegrate(1486,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,p),Power(Times(f,x),Plus(m,Times(C2,n,p),Negate(n),C1)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Power(Times(e,Power(f,Plus(Times(C2,n,p),Negate(n),C1)),Plus(m,Times(C2,n,p),Times(n,q),C1)),-1)),x),Dist(Power(Times(e,Plus(m,Times(C2,n,p),Times(n,q),C1)),-1),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,n))),q),ExpandToSum(Plus(Times(e,Plus(m,Times(C2,n,p),Times(n,q),C1),Plus(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Times(CN1,Power(c,p),Power(x,Times(C2,n,p))))),Times(CN1,d,Power(c,p),Plus(m,Times(C2,n,p),Negate(n),C1),Power(x,Plus(Times(C2,n,p),Negate(n))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IGtQ(p,C0),GtQ(Times(C2,n,p),Plus(n,Negate(C1))),Not(IntegerQ(q)),NeQ(Plus(m,Times(C2,n,p),Times(n,q),C1),C0)))),
IIntegrate(1487,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(c,p),Power(Times(f,x),Plus(m,Times(C2,n,p),Negate(n),C1)),Power(Plus(d,Times(e,Power(x,n))),Plus(q,C1)),Power(Times(e,Power(f,Plus(Times(C2,n,p),Negate(n),C1)),Plus(m,Times(C2,n,p),Times(n,q),C1)),-1)),x),Dist(Power(Times(e,Plus(m,Times(C2,n,p),Times(n,q),C1)),-1),Int(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,n))),q),ExpandToSum(Plus(Times(e,Plus(m,Times(C2,n,p),Times(n,q),C1),Plus(Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p),Times(CN1,Power(c,p),Power(x,Times(C2,n,p))))),Times(CN1,d,Power(c,p),Plus(m,Times(C2,n,p),Negate(n),C1),Power(x,Plus(Times(C2,n,p),Negate(n))))),x)),x),x)),And(FreeQ(List(a,c,d,e,f,m,q),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),IGtQ(p,C0),GtQ(Times(C2,n,p),Plus(n,Negate(C1))),Not(IntegerQ(q)),NeQ(Plus(m,Times(C2,n,p),Times(n,q),C1),C0)))),
IIntegrate(1488,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,q),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(1489,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,c,d,e,f,m,q),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),IGtQ(p,C0)))),
IIntegrate(1490,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,GCD(Plus(m,C1),n))),Condition(Dist(Power(k,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(k,-1)),Negate(C1))),Power(Plus(d,Times(e,Power(x,Times(n,Power(k,-1))))),q),Power(Plus(a,Times(b,Power(x,Times(n,Power(k,-1)))),Times(c,Power(x,Times(C2,n,Power(k,-1))))),p)),x),x,Power(x,k)),x),Unequal(k,C1))),And(FreeQ(List(a,b,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(1491,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,GCD(Plus(m,C1),n))),Condition(Dist(Power(k,-1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(k,-1)),Negate(C1))),Power(Plus(d,Times(e,Power(x,Times(n,Power(k,-1))))),q),Power(Plus(a,Times(c,Power(x,Times(C2,n,Power(k,-1))))),p)),x),x,Power(x,k)),x),Unequal(k,C1))),And(FreeQ(List(a,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),IntegerQ(m)))),
IIntegrate(1492,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Dist(Times(k,Power(f,-1)),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(d,Times(e,Power(x,Times(k,n)),Power(Power(f,n),-1))),q),Power(Plus(a,Times(b,Power(x,Times(k,n)),Power(Power(f,n),-1)),Times(c,Power(x,Times(C2,k,n)),Power(Power(f,Times(C2,n)),-1))),p)),x),x,Power(Times(f,x),Power(k,-1))),x)),And(FreeQ(List(a,b,c,d,e,f,p,q),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),FractionQ(m),IntegerQ(p)))),
IIntegrate(1493,Int(Times(Power(Times(f_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Dist(Times(k,Power(f,-1)),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(Plus(d,Times(e,Power(x,Times(k,n)),Power(f,-1))),q),Power(Plus(a,Times(c,Power(x,Times(C2,k,n)),Power(f,-1))),p)),x),x,Power(Times(f,x),Power(k,-1))),x)),And(FreeQ(List(a,c,d,e,f,p,q),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),FractionQ(m),IntegerQ(p)))),
IIntegrate(1494,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Plus(Times(d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),Times(e,Plus(m,C1),Power(x,n))),Power(Times(f,Plus(m,C1),Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),-1)),x),Dist(Times(n,p,Power(Times(Power(f,n),Plus(m,C1),Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,n)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Negate(C1))),Simp(Plus(Times(C2,a,e,Plus(m,C1)),Times(CN1,b,d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),Times(Plus(Times(b,e,Plus(m,C1)),Times(CN1,C2,c,d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),GtQ(p,C0),LtQ(m,CN1),NeQ(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),C0),IntegerQ(p)))),
IIntegrate(1495,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p),Plus(Times(d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),Times(e,Plus(m,C1),Power(x,n))),Power(Times(f,Plus(m,C1),Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),-1)),x),Dist(Times(C2,n,p,Power(Times(Power(f,n),Plus(m,C1),Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,n)),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),Plus(p,Negate(C1))),Plus(Times(a,e,Plus(m,C1)),Times(CN1,c,d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),Power(x,n)))),x),x)),And(FreeQ(List(a,c,d,e,f),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),GtQ(p,C0),LtQ(m,CN1),NeQ(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),C0),IntegerQ(p)))),
IIntegrate(1496,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Plus(Times(b,e,n,p),Times(c,d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),Times(c,e,Plus(Times(C2,n,p),m,C1),Power(x,n))),Power(Times(c,f,Plus(Times(C2,n,p),m,C1),Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),-1)),x),Dist(Times(n,p,Power(Times(c,Plus(Times(C2,n,p),m,C1),Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Negate(C1))),Simp(Plus(Times(C2,a,c,d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),Times(CN1,a,b,e,Plus(m,C1)),Times(Plus(Times(C2,a,c,e,Plus(Times(C2,n,p),m,C1)),Times(b,c,d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),Times(CN1,Sqr(b),e,Plus(m,Times(n,p),C1))),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),GtQ(p,C0),NeQ(Plus(Times(C2,n,p),m,C1),C0),NeQ(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),C0),IntegerQ(p)))),
IIntegrate(1497,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p),Plus(Times(c,d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),Times(c,e,Plus(Times(C2,n,p),m,C1),Power(x,n))),Power(Times(c,f,Plus(Times(C2,n,p),m,C1),Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),-1)),x),Dist(Times(C2,a,n,p,Power(Times(Plus(Times(C2,n,p),m,C1),Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),-1)),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),Plus(p,Negate(C1))),Simp(Plus(Times(d,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1)),Times(e,Plus(Times(C2,n,p),m,C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,c,d,e,f,m),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),GtQ(p,C0),NeQ(Plus(Times(C2,n,p),m,C1),C0),NeQ(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),C0),IntegerQ(p)))),
IIntegrate(1498,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(f,Plus(n,Negate(C1))),Power(Times(f,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Plus(Times(b,d),Times(CN1,C2,a,e),Times(CN1,Plus(Times(b,e),Times(CN1,C2,c,d)),Power(x,n))),Power(Times(n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x),Dist(Times(Power(f,n),Power(Times(n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Simp(Plus(Times(Plus(n,Negate(m),Negate(C1)),Plus(Times(b,d),Times(CN1,C2,a,e))),Times(Plus(Times(C2,n,p),Times(C2,n),m,C1),Plus(Times(b,e),Times(CN1,C2,c,d)),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),LtQ(p,CN1),GtQ(m,Plus(n,Negate(C1))),IntegerQ(p)))),
IIntegrate(1499,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(f,Plus(n,Negate(C1))),Power(Times(f,x),Plus(m,Negate(n),C1)),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Plus(Times(a,e),Times(CN1,c,d,Power(x,n))),Power(Times(C2,a,c,n,Plus(p,C1)),-1)),x),Dist(Times(Power(f,n),Power(Times(C2,a,c,n,Plus(p,C1)),-1)),Int(Times(Power(Times(f,x),Plus(m,Negate(n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Plus(Times(a,e,Plus(n,Negate(m),Negate(C1))),Times(c,d,Plus(Times(C2,n,p),Times(C2,n),m,C1),Power(x,n)))),x),x)),And(FreeQ(List(a,c,d,e,f),x),EqQ($s("n2"),Times(C2,n)),IGtQ(n,C0),LtQ(p,CN1),GtQ(m,Plus(n,Negate(C1))),IntegerQ(p)))),
IIntegrate(1500,Int(Times(Power(Times(f_DEFAULT,x_),m_DEFAULT),Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Plus(Times(d,Plus(Sqr(b),Times(CN1,C2,a,c))),Times(CN1,a,b,e),Times(Plus(Times(b,d),Times(CN1,C2,a,e)),c,Power(x,n))),Power(Times(a,f,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),-1),Int(Times(Power(Times(f,x),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Simp(Plus(Times(d,Plus(Times(Sqr(b),Plus(m,Times(n,Plus(p,C1)),C1)),Times(CN1,C2,a,c,Plus(m,Times(C2,n,Plus(p,C1)),C1)))),Times(CN1,a,b,e,Plus(m,C1)),Times(c,Plus(m,Times(n,Plus(Times(C2,p),C3)),C1),Plus(Times(b,d),Times(CN1,C2,a,e)),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m),x),EqQ($s("n2"),Times(C2,n)),NeQ(Plus(Sqr(b),Times(CN1,C4,a,c)),C0),IGtQ(n,C0),LtQ(p,CN1),IntegerQ(p))))
  );
}