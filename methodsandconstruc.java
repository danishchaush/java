package com.org.java;

import java.util.Scanner;

public class methodsandconstruc {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	sample s1 = new sample();
	
	
	while(true)
	{
		System.out.println("enter 1 to add");
		System.out.println("enter 2 to sub");
		System.out.println("enter 3 to mul");
		System.out.println("enter 4 to div");
		System.out.println("enter 5 to display number");
		System.out.println("enter 6 to exit of calculator");
		int o=sc.nextInt();
		if(o==1)
		{		System.out.println("enter frist number");
		int x= sc.nextInt();
		System.out.println("enter second number");
		int y=sc.nextInt();
			s1.add(x,y);
			
		}
		else if(o==2)
		{	System.out.println("enter frist number");
		int x= sc.nextInt();
		System.out.println("enter second number");
		int y=sc.nextInt();
			s1.sub(x, y);
		}
		else if(o==3)
		{
			System.out.println("enter frist number");
			int x= sc.nextInt();
			System.out.println("enter second number");
			int y=sc.nextInt();
			s1.mul(x,y);
		}
		else if(o==4)
		{
			System.out.println("enter frist number");
			int x= sc.nextInt();
			System.out.println("enter second number");
			int y=sc.nextInt();
			s1.div(x, y);
		}
		else if(o==5)
		{
			s1.display();
		}
		else if(o==6)
		{
			break;
		}
		else {
		break;	
		}
	}	
}
}
