{
  D(ArcCos(f_),x_NotListQ):=D(f,x)*(-1)*(1-f^2)^(-1/2),
  D(ArcCosh(f_),x_NotListQ):=D(f,x)*(f^2-1)^(-1/2),
  D(ArcCot(f_),x_NotListQ):=D(f,x)*(-1)*(1+f^2)^(-1),
  D(ArcCoth(f_),x_NotListQ):=D(f,x)*(1-f^2)^(-1),
  D(ArcCsc(f_),x_NotListQ):=-D(f,x)*1*f^(-2)*(1-x^(-2))^(-1/2),
  D(ArcCsch(f_),x_NotListQ):=D(f,x)*(-1)*Abs(f)^(-1)*(1+f^2)^(-1/2),
  D(ArcSin(f_),x_NotListQ):=D(f,x)*(1-f^2)^(-1/2),
  D(ArcSinh(f_),x_NotListQ):=D(f,x)*(1+f^2)^(-1/2),
  D(ArcTan(f_),x_NotListQ):=D(f,x)*(1+f^2)^(-1),
  D(ArcTanh(f_),x_NotListQ):=D(f,x)*(1-f^2)^(-1),
  D(ArcSec(f_),x_NotListQ):=D(f,x)*x^(-2)*(1-f^(-2))^(-1/2),
  D(ArcSech(f_),x_NotListQ):=D(f,x)*(-1)*f^(-1)*(1-f^2)^(-1/2),
  D(Ceiling(f_),x_NotListQ):=0,
  D(Erf(f_),x_NotListQ):=D(f,x)*(2*E^(-f^(2))/Sqrt(Pi)),
  D(Erfc(f_),x_NotListQ):=D(f,x)*(-2*E^(-f^(2))/Sqrt(Pi)),
  D(Erfi(f_),x_NotListQ):=D(f,x)*(2*E^(f^(2))/Sqrt(Pi)),
  D(Floor(f_),x_NotListQ):=0,
  D(FractionalPart(f_),x_NotListQ):=D(f,x)*1,
  D(FresnelC(f_),x_NotListQ):=D(f,x)*Cos((Pi*f^2)/2),
  D(FresnelS(f_),x_NotListQ):=D(f,x)*Sin((Pi*f^2)/2),
  D(Gamma(f_),x_NotListQ):=D(f,x)*Gamma(f)*PolyGamma(f),
  D(IntegerPart(f_),x_NotListQ):=0,
  D(InverseErf(f_),x_NotListQ):=D(f,x)*(1/2*Sqrt(Pi)*E^(InverseErf(f)^2)),
  D(Log(f_),x_NotListQ):=D(f,x)*f^(-1),
  D(PolyGamma(f_),x_NotListQ):=D(f,x)*PolyGamma(1,f),
  D(Cot(f_),x_NotListQ):=D(f,x)*(-1)*Csc(f)^2,
  D(Coth(f_),x_NotListQ):=D(f,x)*(-1)*Sinh(f)^(-2),
  D(Cos(f_),x_NotListQ):=D(f,x)*(-1)*Sin(f),
  D(Cosh(f_),x_NotListQ):=D(f,x)*Sinh(f),
  D(Csc(f_),x_NotListQ):=D(f,x)*(-1)*Cot(f)*Csc(f),
  D(Csch(f_),x_NotListQ):=D(f,x)*(-1)*Coth(f)*Csch(f),
  D(Round(f_),x_NotListQ):=0,
  D(Sin(f_),x_NotListQ):=D(f,x)*Cos(f),
  D(Sinh(f_),x_NotListQ):=D(f,x)*Cosh(f),
  D(Tan(f_),x_NotListQ):=D(f,x)*Sec(f)^2,
  D(Tanh(f_),x_NotListQ):=D(f,x)*Sech(f)^(2),
  D(Sec(f_),x_NotListQ):=D(f,x)*Sec(f)*Tan(f),
  D(Sech(f_),x_NotListQ):=D(f,x)*(-1)*Tanh(f)*Sech(f)
}