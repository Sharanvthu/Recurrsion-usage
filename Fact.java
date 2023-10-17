package com.recrsion;

public class Fact {
	static int factorial(int n)
	{
		if(n==0)
		return 1;
		else
		return n*factorial(n-1);
	}
public static void main(String[] args) {
	int n=4;
	int total = 1;
	int	fact=factorial(n);
	System.out.println(fact);
	//==========================================================
	//(Using for loop)
	for(int i=n;i>0;i--)
	{
		 total=total*i;
	}
	System.out.println(total);
}
}
