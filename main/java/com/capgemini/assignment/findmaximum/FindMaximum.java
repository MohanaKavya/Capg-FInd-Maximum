package com.capgemini.assignment.findmaximum;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaximum <E extends Comparable<E>> {
	public static Scanner sc=new Scanner(System.in);
	E max;
	public FindMaximum() {
		
	}
	
	public E printMax(){
		return this.max;
	}
	
	public E findMaximum(E ...values) {
		Arrays.sort(values);
		this.max=values[values.length-1];
		return max;
	}

	public void toPrintMaximum() {
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Test maximum Code");
	}

}
