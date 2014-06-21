 {
	 Sin(0)=0,
	 Sin(1/6*Pi)=1/2,
	 Sin(1/4*Pi)=2^(1/2)/2,
	 Sin(1/3*Pi)=3^(1/2)/2,
	 Sin(1/2*Pi)=1,
	 Sin(Pi)=0,
	 Sin(5/12*Pi)=1/4*6^(1/2)*(1+1/3*3^(1/2)),
	 Sin(Pi/5)=1/4*2^(1/2)*(5-5^(1/2))^(1/2),
	 Sin(Pi/12)=1/4*6^(1/2)*(1-1/3*3^(1/2)),
	 Sin(Pi/10)=1/4*5^(1/2)-1/4,
	 Sin(2/5*Pi)=1/4*2^(1/2)*(5+5^(1/2))^(1/2),
	 Sin(3/10*Pi)=1/4*5^(1/2)+1/4,
	 Sin(3/8*Pi)=1/2*(2+2^(1/2))^(1/2),
	 Sin(1/8*Pi)=1/2*(2-2^(1/2))^(1/2),
	 Sin(I)=I*Sinh(1),
	 Sin(ArcSin(x_)):=x,
	 Sin(ArcCos(x_)):=(1-x^2)^(1/2),
	 Sin(ArcTan(x_)):=x/(1+x^2)^(1/2),
	 Sin(x_NumberQ*Pi):=If(x<1, Sin((1-x)*Pi),If(x<2,-Sin((2-x)*Pi), Sin((x-2*Quotient(IntegerPart(x),2))*Pi) ) ) /; x>=1/2,
	 
	 Sin(I*Infinity)=I*Infinity,
	 Sin(ComplexInfinity)=Indeterminate
}