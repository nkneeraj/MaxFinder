package maxfindproblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.maxfindproblem.MaxFinder;

public class MaxFinderTest {

	@Test
	public void test1_1() {
		MaxFinder maxfinder=new MaxFinder();
		assertEquals((Integer)3,(Integer)maxfinder.find_maximum(3, 2, 1));
	}
	
	@Test
	public void test1_2() {
		MaxFinder maxfinder=new MaxFinder();
		assertEquals((Integer)3,(Integer)maxfinder.find_maximum(2, 3, 1));
	}
	@Test
	public void test1_3() {
		MaxFinder maxfinder=new MaxFinder();
		assertEquals((Integer)3,(Integer)maxfinder.find_maximum(1, 2, 3));
	}
}
