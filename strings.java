package com.org.java;

public class strings {
public static void main(String[] args) {
	///wap to to count no of word in string
	/*
	String s1 = " i am java development and prepare application me i want a job ";
	s1=s1.trim();
	int c=0;
	if(s1.charAt(0)!=' ')
	{
		c++;
	}
	for (int i = 0; i<=s1.length()-1; i++) {
		
		if(s1.charAt(i)==' '&&s1.charAt(i+1)!=' ')
		{
			c++;
		}
	}
	System.out.print(c);
	*/
	//wap to print only e in string
	/*
	String s= "javadevelopment";
	for(int i=0;i<=s.length()-1;i++)
			{
		if(s.charAt(i)=='e')
		{
			System.out.print(s.charAt(i)+" ");
		}
			}
			*/
	///wap to print only count e in string
	/*
	String s= "javadevelopment";
	int c=0;
	for(int i=0;i<=s.length()-1;i++)
			{
		if(s.charAt(i)=='e')
		{
			 c++;
		}
			}
	System.out.println(c);
	*/
	///wap to print to find vowels
	/*
	String s = "javadevelopment";
	String s2 = "aeiou";
	for(int i=0;i<=s.length()-1;i++)
	{
		for(int j=0;j<=s2.length()-1;j++)
		{
			if(s.charAt(i)==s2.charAt(j))
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
	}
	*/
	///wap to count vowels in given string 
	/*
	String s = "javadevelopment";
	String s2 = "aeiou";
	int c=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		for(int j=0;j<=s2.length()-1;j++)
		{
			if(s.charAt(i)==s2.charAt(j))
			{
				c++;
			}
		}
	}
	System.out.println(c);
	*/
	//wap to find vowels in string 
	/*
	String s = "javadevelopment";
	int c=0;
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch = s.charAt(i);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			c++;
		}
	}
	System.out.println(c);
	*/
	//wap to reverse of string
	/*
	String s ="java";
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i)+" ");
	}
	*/
	//wap to palindrome of string

	String s ="java";
	String p ="";
	for(int i=s.length()-1;i>=0;i--)
	{
		p=p+s.charAt(i);
	}
	if(s.equals(p))
	{
		System.out.println("palindrome   "+s);
	}
	else {
		System.out.println("not palindrome   "+s);
	}
	

}
}
