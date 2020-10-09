package com.capgemini.assignment.findmaximum;

import java.util.Scanner;

public class FindMaximum {
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Test Maximum");
		 System.out.println("Enter three variables");
	        float num1 = sc.nextFloat();
	        float num2 = sc.nextFloat();
	        float num3 = sc.nextFloat();
	        System.out.println("Maximum number is "+findMaximum(num1 , num2 , num3));
	}

	static Float findMaximum(Float x, Float y, Float z) {
		float max = 0;
		if(x.compareTo(y)>0 && x.compareTo(z)>0) {
			max=x;
		}else if(z.compareTo(y)>0 && z.compareTo(x)>0) {
			max=z;
		} else {
			max=y;
		}
		return max;
	}

}
