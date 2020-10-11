package com.capg.testmax;

public class TestMaximum <E extends Comparable<E>> {
	E i1,i2,i3;
	
	public TestMaximum(E i1,E i2,E i3) {
		this.i1 = i1;
		this.i2 = i2;
		this.i3 = i3;
	}
	public static <E extends Comparable<E>> E maxOfThree(E a, E b, E c){
		E max = a;
		if(b.compareTo(max) > 0) {
			max = b;
		}
		if(c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}
	public <E extends Comparable<E>> E maxOfThree() {
		return (E) maxOfThree(i1,i2,i3);
		
	}
	public static void main(String[] args) {
		System.out.println("Test Maximum");
		
	}

}
