package com.epam.clean_code;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the principal amount: ");
    	double principal=sc.nextDouble();
    	System.out.println("Enter the rate: ");
    	double rate=sc.nextDouble();
    	System.out.println("Enter period of time: ");
    	double time=sc.nextDouble();
    	System.out.println("Enter the area of the House: ");
    	int f=sc.nextInt();
    	int cpf=0;
    	System.out.println("Select the above options : ");
    	System.out.println("Option1--> 1200INR if we use standard materials");
    	System.out.println("Option2--> 1500INR if we use above standard materials");
    	System.out.println("Option3--> 2200INR if we use high  standard materials");
    	System.out.println("Option4--> 2500INR if we use standard materials and fully automated home");
    	int n=sc.nextInt();
    	switch(n)
    	{
    		case 1:cpf=1200;
    	       	   break;
    		case 2:cpf=1500;
    	       	   break;
    		case 3:cpf=1800;
    			   break;
    		case 4:cpf=2500;
    	           break;
    	}
    	double cost=f*cpf;
    	System.out.println("Total estimated cost of the house is "+cost);
        SimpleInterest S=new SimpleInterest(principal,rate,time);
        CompoundInterest C=new CompoundInterest(principal,rate,time);
        System.out.println("The Simple Interest is "+S.simple());
        System.out.println("The Compound Interest is "+C.compound());
    }
}
