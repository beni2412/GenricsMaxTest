package com.capg.testmax;

public class TestMaximum {
	public static <E extends Comparable> E maxOfThree(E a,E b,E c)
	{
		E max = a;
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Test Maximum");

	}
}
