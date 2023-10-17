package com.recrsion;

public class ExampleOnRecurse {
	static int count=0;
	static int total=0;
	static int v=0;
	static int u=-1;
	static int print()
	{
		count++;
		if(count<=10){
			System.out.println("hello ");
		
		print();
		
	}
		return count-1;}
	static void even(int n)
	{
		
		if(v<n)
		{
			 v +=2;
			 System.out.print(v+" ");
			 total+=v;
			 even(n);
			 
		}
		
	}
	static void odd(int n)
	{
		if(u<n)
		{
			u +=2;
			System.out.print(u+" ");
			total+=u;
			odd(n);
		}
		
	}

	public static void main(String[] args)
	{
		
		int n=100;
		int c=print();
		System.out.println("total "+c+" times hello printed");
		odd(n);
		System.out.println();
		System.out.println(total);
		System.out.println();
		total=0;
		even(n);
		System.out.println();
		System.out.println(total);
		
	}

}
