package com.capg.testmax;

import java.util.ArrayList;
import java.util.Collections;

public class TestMaximum<E extends Comparable<E>> {
	E a, b, c, d;
	ArrayList<E> array = new ArrayList<E>();

	public TestMaximum(E a, E b, E c, E d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public ArrayList<E> addVal() {
		array.add(a);
		array.add(b);
		array.add(c);
		array.add(d);

		return array;
	}

	public static <E extends Comparable> E maximumInArrayList(ArrayList<E> a) {
		Collections.sort(a);
		printMaximum(a);
		return a.get(a.size() - 1);
	}

	public static <E> void printMaximum(ArrayList<E> a) {
		System.out.println(a.get(a.size() - 1));
	}

	public static void main(String[] args) {
		System.out.println("Test Maximum");

	}

}
