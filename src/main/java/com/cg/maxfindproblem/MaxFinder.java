package com.cg.maxfindproblem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class MaxFinder<E extends Comparable<E>> {
	ArrayList<E> arr = new ArrayList<>();

	public ArrayList<E> add(E a, E b, E c)
	{
		arr.add(a);
		arr.add(b);
		arr.add(c);
		return arr;
	}
	
	public <E extends Comparable<E>> E find_maximum(ArrayList<E> arr) {
		Collections.sort(arr);
		printMax(arr);
		return arr.get(arr.size()-1);
	}
	
	public void printMax(ArrayList<E> arr2) {
		
		System.out.println(arr2.get(arr2.size()-1));
	}

	public static void main(String[] args) {
		System.out.println("Max Finder");	
	}


//		public <E extends Comparable<E>> E find_maximum()
//		{
//			return (E) find_maximum(value1,value2,value3);
//		}

//	public Integer find_maximum(Integer a, Integer b, Integer c) {
//		Integer max = a;
//		if (b.compareTo(max) > 0)
//			max = b;
//		if (c.compareTo(max) > 0)
//			max = c;
//		return max;
//	}
//
//	public Float find_maximum(Float a, Float b, Float c) {
//		Float max = a;
//		if (b.compareTo(max) > 0)
//			max = b;
//		if (c.compareTo(max) > 0)
//			max = c;
//		return max;
//	}
//
//	public String find_maximum(String a, String b, String c) {
//		String max = new String(a);
//		if (b.compareTo(max) > 0)
//			max = new String(b);
//		if (c.compareTo(max) > 0)
//			max = new String(c);
//		return max;
//	}
}