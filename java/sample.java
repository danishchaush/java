package com.org.java;

public class sample {
	
	int a;
	int b;
	
	public void add(int num1,int num2)
	{
		this.a=num1;
		this.b=num2;
		System.out.println("the additon is = ");
		System.out.println(num1+num2);
	}
	public void display()
	{
		System.out.println("the frist number is "+a);
		System.out.println("the second number is "+b);
	}
	public void sub(int num1,int num2)
	{

		this.a=num1;
		this.b=num2;
		System.out.println("the subtraciton is = ");
		System.out.println(num1-num2);
	}
	public void mul(int num1,int num2)
	{

		this.a=num1;
		this.b=num2;
		System.out.println("the multiplication is = ");
		System.out.println(num1*num2);
	}
	public void div(int num1,int num2)
	{

		this.a=num1;
		this.b=num2;
		System.out.println("the division is = ");
		System.out.println(num1/num2);
	}

	
}	
