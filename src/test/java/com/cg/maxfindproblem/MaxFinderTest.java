package com.cg.maxfindproblem;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.cg.maxfindproblem.MaxFinder;

import junit.framework.Assert;

public class MaxFinderTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void Test4_1() {
		MaxFinder maxfinder = new MaxFinder();
		ArrayList<Integer> arr = new ArrayList<>();
		arr = maxfinder.add(1,2,3,4);
		Integer max = (Integer)maxfinder.find_maximum(arr);
		Assert.assertEquals((Integer)4, max);
	}

//	@Test
//	public void test1_1() {
//		MaxFinder maxfinder = new MaxFinder(3, 2, 1);
//		assertEquals((Integer) 3, (Integer) maxfinder.find_maximum());
//	}
//
//	@Test
//	public void test1_2() {
//		MaxFinder maxfinder = new MaxFinder(2,3,1);
//		assertEquals((Integer) 3, (Integer) maxfinder.find_maximum());
//	}
//
//	@Test
//	public void test1_3() {
//		MaxFinder maxfinder = new MaxFinder(1, 2, 3);
//		assertEquals((Integer) 3, (Integer) maxfinder.find_maximum());
//	}
//
//	@Test
//	public void test2_1() {
//		MaxFinder maxfinder = new MaxFinder(3.0F, 2.0F, 1.0F);
//		assertEquals((Float) 3.0F, (Float) maxfinder.find_maximum());
//	}
//
//	@Test
//	public void test2_2() {
//		MaxFinder maxfinder = new MaxFinder(2.0F, 3.0F, 1F);
//		assertEquals((Float) 3F, (Float) maxfinder.find_maximum());
//	}
//
//	@Test
//	public void test2_3() {
//		MaxFinder maxfinder = new MaxFinder(1F, 2F, 3F);
//		assertEquals((Float) 3F, (Float) maxfinder.find_maximum());
//	}
//
//	@Test
//	public void test3_1() {
//		MaxFinder maxfinder = new MaxFinder("def", "bcd", "abc");
//		assertEquals("def", maxfinder.find_maximum());
//	}
//
//	@Test
//	public void test3_2() {
//		MaxFinder maxfinder = new MaxFinder("abc", "def", "bcd");
//		assertEquals("def", maxfinder.find_maximum());
//	}
//
//	@Test
//	public void test3_3() {
//		MaxFinder maxfinder = new MaxFinder("abc", "bcd", "def");
//		assertEquals("def", maxfinder.find_maximum());}
//	

}
