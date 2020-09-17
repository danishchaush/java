package com.org.java;

public class arrayscls {

	public static void main(String[] args) {
		
		//array program
		//sum of array
		/*
		int a[] = {10,10,10};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		*/
		//avg of array
		/*
		int a[] = {10,10,10};
		int sum=0,avg;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(avg=sum/a.length);
		*/
		//rever of array
		/*
		int a[] = {10,20,30};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		*/
		//largest in array
		/*
		int a[] = {5,25,10,9,90};
		int l=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>l)
			{
				l=a[i];
			}
		}
		System.out.println(l);
		*/
		//smallest in array
		/*
		int a[] = {10,33,20,30};
		int s=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<l)
			{
				s=a[i];
			}
		}
		System.out.println(l);
		*/
		//acending or incresing order
		/*
		int a[] = {0,14,1,15,3,16,18,4};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
				 int temp =a[j];
				 a[j] = a[j+1];
				 a[j+1]=temp;
				}
				
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		*/
		//decending or decresing ordeer
		/*
		int a[] = {0,14,1,15,3,16,18,4};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
				 int temp =a[j];
				 a[j] = a[j+1];
				 a[j+1]=temp;
				}
				
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		*/
		///max of two number
		/*
		int a[] = {10,20,4,2};
		int max1=a[0];
		int max2=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(max1<a[i])
			{
				max2=max1;
				max1=a[i];
			}
			else if(max2<a[i])
			{
				max2=a[i];
			}
		}
		System.out.println(max1+" max1");
		System.out.println(max2+" max2");
		*/
		//SAM OF TWO numbers
		/*
		int a[] = {10,20,4,2};
		int sam1=a[0];
		int sam2=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(sam1>a[i])
			{
				sam2=sam1;
				sam1=a[i];
			}
			else if(sam2<a[i])
			{
				sam2=a[i];
			}
		}
		System.out.println(sam1+" sam1");
		System.out.println(sam2+" sam2");
		*/
		///find duplicate number
		/*
		int a[] = {20,50,30,10,10,20,70,50};
		int b[]= new int[a.length];
		int k=0;
		for (int i = 0; i <=a.length-1; i++) {
			
			for (int j =i+1; j<a.length; j++) {
				
				if(a[i]==a[j])
				{
					b[k]=a[i];
					k++;
					
				}
			}
			
		}
		for(int s=0;s<=b.length-1;s++)
		{
			if(b[s]!=0)
			{
			System.out.println(b[s]);
			}
		}
		*/
		///wap to find count array
		/*
		int a[] = {20,50,30,10,9,20,70,50};
		int c=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!=0)
			{
				c++;
			}
		}
		System.out.println(c);
		*/
		///wap to merge an array
		/*
		int a[]= {10,20,30};
		int b[] = {1,2,3};
		int c[] = new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
		for(int j=0;j<=b.length-1;j++)
		{
			c[a.length+j]=b[j];
		}
		for(int i=0;i<=c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		*/
		///wap to insert an element in array by position by value
		/*int a[] = {10,20,40,50};
		int pos =3;
		int e = 30;
		for(int i=a.length-1;i>=pos-1;i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=e;
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]);
		}
		*/
		///wap to insert an element by value 
		int a[] = {10,20,40,50};
		int e = 30;
		for(int i=0;i<=a.length-1;i++)
		{
			if(i==2)
			{
				a[i]=e;
			}
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]);
		}
	
	}
	
}
