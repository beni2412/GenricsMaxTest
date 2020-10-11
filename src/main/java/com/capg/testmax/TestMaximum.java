package com.capg.testmax;

import java.util.ArrayList;
import java.util.Collections;

public class TestMaximum<E extends Comparable<E>>  {
	ArrayList<E> array = new ArrayList<E>();
	public ArrayList<E> addVal(E a, E b, E c, E d){
		array.add(a);
		array.add(b);
		array.add(c);
		array.add(d);
		
		return array;
	}
	public static <E extends Comparable> E maximumInArrayList(ArrayList<E> a)
	{
		Collections.sort(a);
    	return a.get(a.size()-1);
	}
	public static void main(String[] args) {
		System.out.println("Test Maximum");
		
	}

}
