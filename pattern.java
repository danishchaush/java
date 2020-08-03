package com.org.java;

public class pattern {

	public static void main(String[] args) {
		
		//pattern1
		/*
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//pattern2
		/*
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==3&&j>1)
				{
					System.out.print(" ");
				}
				else
				{
				System.out.print("*");
				}
			}
			System.out.println();
			*/
		//pattern3
		/*
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		//pattern3
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if((i==j)||(i+j==6))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			*/
		//pattern4
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3||j==3)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			*/
		//pattern5
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==1||i==5||j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			*/
		//pattern6
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==j||i+j==6)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			*/
		//pattern7
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		//pattern8
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(j>=i)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			*/
		//pattern9
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>j)
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			*/
		//pattern10
		/*
		int space=5;
		int star=0;
		for(int i=1;i<=5;i++)
		{
			star++;
			space--;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//pattern11
		/*
		int space=7;
		int star=0;
		for(int i=0;i<=5;i++)
		{
			space--;
			star++;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		//pattern12
		/*
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();	
		}
		*/
		//pattern13
		/*
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		*/
		///pattern14
		/*
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		//pattern15
		/*
		int a=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		*/
		//pattern16
		/*
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
		*/
		//pattern17
		/*
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
		*/
		//pattern 18
		/*
		int a=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print(a);
					a++;
				}
			}
			System.out.println();
		}
		*/
		//pattern19
		/*
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
		*/
		//pattern20
		/*
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
		*/
		//pattern21
		/*
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print((char)(j+64));
				}
			}
			System.out.println();
		}
		*/
		//pattern22
		/*
		int a=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print((char)(a+64));
					a++;
				}
			}
			System.out.println();
		}
		*/
		//pattern23
		/*
		int star=1;
		int space=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star+=2;
			space--;
			System.out.println();
		}
		*/
		//pattern24
		/*
		int star=7;
		int space=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star-=2;
			space++;
			System.out.println();	
		}
		*/
		//pattern25
		/*
		int star=7;
		int space=0;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			if(i<4)
			{
				star-=2;
				space++;
			}
			else {
				star+=2;
				space--;
			}
			System.out.println();	
		}
		*/
		//pattern26
		/*
		int star=1;
		int space=7;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			if(i<4)
			{
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			System.out.println();	
		}
		*/
		//pattern27
		/*
		int star=1;
		for(int i=1;i<=7;i++)
		{
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			if(i<4)
			{
				star++;
			}
			else {
				star--;
			}
			System.out.println();	
		}
		*/
		//pattern28
		/*
		int space=4;
		int star=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			if(i<4)
			{
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			System.out.println();
		}
		*/
		//prime number single 
		/*
		int num=8;
		int c=0;
		for(int i=1;i<=num;i++)
		{
			
			if(num%i==0)
			{
				c++;
			}
			
		}

		if(c==2)
		{
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
	*/
		//prime numbers below 15
		/*
		int num=20;
		for(int i=1;i<=num;i++)
		{
			int c=0;
			for(int j=1;j<=num;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i+"prime number");
			}
		}
		*/
		//pattern29
		/*
		int star=1;
		for(int i=1;i<=7;i++)
		{
			
			for(int j=1;j<=12;j++)
			{
			
			if(i>=3&&i<=5)
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			if(i<4)
			{
				star++;
			}
			else{
				star--;
			}
			System.out.println();
			
		}
		*/

		//pattern 30
		/*
		int lstar=6;
		int rstar=6;
		int space=-2;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				lstar--;
				rstar--;
				space+=2;
			}
			else {

				lstar++;
				rstar++;
				space-=2;
			}
			for(int j=1;j<=lstar;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int x=1;x<=rstar;x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//pattern31
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==4||i+j==8||i*j==8)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
			*/
		//pattern32
		/*
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==4||i+j==8||i*j==8)
				{
					System.out.print(n);
					n++;
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		*/
		//pattern33
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==4||i+j==8||i*j==9||i*j==8)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			*/
		///pattern34
		/*
		int n=1;
		char ch='a';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==4||i+j==8||i*j==9||i*j==8)
				{
					if(i%2!=0)
					{
					System.out.print(n);
					n++;
				}
				else {
					System.out.print(ch);
					ch++;
				}
			}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	
		}
		*/
		///pattern35
		/*
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==4||i*j==8||i+j==8)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		*/
		///pattern36
		int star=4;
		int space =0;
		int num=1;
		for(int i=1;i<=5;i++) {
			
			if(i<=3)
			{
				star--;
				space++;	
			}
			else {
				star++;
				space--;
			}	
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" "+" "+num );
				num++;
			}
			System.out.println();
			
			
			
		}
	}
	
		
}

