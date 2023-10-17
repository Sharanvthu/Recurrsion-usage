package com.recrsion;

public class Find {
	static int searchNumber(int[] a,int l,int r,int x) 
	{
		if(r<l)
			return -1;
		if(a[l]==x)
			return l;
		if(a[r]==x)
			return r;
		return searchNumber(a, l+1, r-1, x);
	}

	public static void main(String[] args) {
		int[] a={10,20,30,40,50,60,70,80};
		int x=80;
		
			int index=searchNumber(a, 0, a.length-1, x);
		if(index!=-1)
			System.out.println("element "+x+" is present at index "+index);
		else
			System.out.println("element "+x+" is not present in array");
		 
		//=================================================================================	
		//(Using for loop)
		int j=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==x)
				j=i;
		}
		if(j!=-1)
		{
			System.out.println("The index of element is "+j);
		}
		else
			System.out.println("the element is not present ");
	}
}
