package com.cg.maxfindproblem;

public class MaxFinder {

	public static void main(String[] args) {
		System.out.println("Welcome to MaxFinder");
	}

	public Integer find_maximum(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public Float find_maximum(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}
}