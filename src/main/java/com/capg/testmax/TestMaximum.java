package com.capg.testmax;

public class TestMaximum {
	public int maxOfThree(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}
	
	public float maxOfThree(Float a, Float b, Float c) {
		Float max = a;
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		return max;
	}
	
	public String maxOfThree(String a, String b, String c) {
		String max = a;
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
