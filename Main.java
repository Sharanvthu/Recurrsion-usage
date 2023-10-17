package com.recrsion;

public class Main {
	public static void reduceByOne(int n){
		if(n>=1){
		reduceByOne(n-2);
		System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		reduceByOne(100);

	}

}
