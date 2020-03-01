package com.epam.clean_code;

class SimpleInterest{
	double principal,rate,time;
	double si;
	public SimpleInterest(double p,double t,double r)
	{
		this.principal=p;
		this.rate=r;
		this.time=t;
	}
	public double simple()
	{
		si=(principal*time*rate)/100;
		return si;
	}
}