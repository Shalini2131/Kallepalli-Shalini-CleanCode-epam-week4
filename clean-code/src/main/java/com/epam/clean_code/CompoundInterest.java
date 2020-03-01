package com.epam.clean_code;

class CompoundInterest{
	double principal,rate,time;
	double ci;
	public CompoundInterest(double p,double t,double r)
	{
		this.principal=p;
		this.rate=r;
		this.time=t;
	}
	public double compound()
	{
		ci=principal*(Math.pow((1+rate)/100,time));
		return ci;
	}
}