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
	
	@Test
	public void test2_1() {
		MaxFinder maxfinder=new MaxFinder();
		assertEquals((Float)3.0F,(Float)maxfinder.find_maximum(3.0F, 2.0F, 1.0F));
	}
	
	@Test
	public void test2_2() {
		MaxFinder maxfinder=new MaxFinder();
		assertEquals((Float)3F,(Float)maxfinder.find_maximum(2.0F, 3.0F, 1F));
	}
	@Test
	public void test2_3() {
		MaxFinder maxfinder=new MaxFinder();
		assertEquals((Float)3F,(Float)maxfinder.find_maximum(1F, 2F, 3F));
	}
}
