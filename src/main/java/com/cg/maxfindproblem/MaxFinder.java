package com.cg.maxfindproblem;

public class MaxFinder<E extends Comparable<E>> {
	E X;
	E Y;
	E Z;

	MaxFinder(E value1, E value2, E value3) {
		this.X = value1;
		this.Y = value2;
		this.Z = value3;
	}

	public static <E extends Comparable<E>> E find_maximum(E a, E b, E c) {
		E max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}
	
	public <E extends Comparable<E>> E find_maximum() {
		return (E) find_maximum(X, Y, Z);
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