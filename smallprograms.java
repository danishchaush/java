package com.org.java;

public class smallprograms {

	public static void main(String[] args) {
		//wap a program to print 30 to 50
		/*
		for(int i=30;i<=50;i++)
		{
			System.out.print(i+" ");
		}
		*/
		//wap a program to print 65 to 35
		/*
		for(int i=65;i>=35;i--)
		{
			System.out.print(i+ " ");
		}
		*/
		//wap to print even number 1 to 100
		/*
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		*/
		//wap to print all number divisible by 5  present b/w 1to65
		/*
		for(int i=1;i<=65;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		*/
		//wap to count of odd number 1 to 25
		/*
		int c=0;
		for(int i=1;i<=25;i++)
		{
			if(i%2==1)
			{
				c++;
			}
		}
		System.out.println(c);
		*/
		//wap to print sum of natural number from 1 to 10
		/*
		int s=0;
		for(int i=1;i<=10;i++)
		{
			s=s+i;
			
		}
		System.out.println(s);
		*/
		//wap to print product of natural number from 1 to 10
		/*
		int s=0;
		for(int i=0;i<=10;i++)
		{
			s=s-i;
		}
		System.out.println(s);
		*/
		//wap to print sum of all numbers divide by 5 b/w 1 to 30
		/*
		int s=0;
		for(int i=1;i<=30;i++)
		{
			if(i%5==0)
			{
				s=s+i;
			}
		}
		System.out.println(s);
		*/
		//wap to print sum of even number b/w 1 to 30
		/*
		int s=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				s=s+i;
			}
		}
		System.out.println(s);
		*/
		//wap to print all from 1 to 100 excluding multiples 7
		/*
		for(int i=1;i<=100;i++)
		{
			if(i%7!=0)
			{
				System.out.print(i+" ");
			}
		}
		*/
		//wap to print table 5
		/*
		for(int i=1;i<=10;i++)
		{
			System.out.print(5*i+" ");
		}
		*/
		//wap to print 5 factroial
		/*
		int f=1;
		for(int i=5;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println(f);
		*/
		//wap to print 1 to 100 divide by 5 and 51 to 59
		/*
		for(int i=1;i<=100;i++)
		{
			if((i%5==0)||(i>=50&&i<=60))
			{
				System.out.print(i+" ");
			}
		}
		*/
		//wap to print 1 to 50 using while
		/*
		int i=1;
		while(i<=50)
		{
			System.out.print(i+" ");
			i++;
		}
		*/
		//wap to print 50 rever using while
		/*
		int i=50;
		while(i>=1)
		{
			System.out.print(i+" ");
			i--;
		}
		*/
		//wap to print reverse number
		/*
		int n =123,digit,rev=0;
		while(n!=0)
		{
			digit=n%10;
			n=n/10;
			rev=(rev*10)+digit;
			
		}
		System.out.print(rev);
		*/
		//wap to print palindrome number
		int n=1221,digit,rev=0,temp=n;
		while(n!=0)
		{
			digit=n%10;
			n=n/10;
			rev=(rev*10)+digit;
		}
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	
	

}
