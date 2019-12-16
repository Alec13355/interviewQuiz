import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class rotateTests {

	@Test public void test1() {
		rotate test = new rotate();
		int[] nums = new int[] {1,2,3,4,5,6,7};
		int k = 3;
		
		int[] result = test.rotateClass(nums, k);
		
		assertEquals(new int[] {5,6,7,1,2,3,4}, result);
	}
	
	@Test public void test2() {
		rotate test = new rotate();
		int[] nums = new int[] {0, 1};
		int k = 1;
		
		int[] result = test.rotateClass(nums, k);
		
		assertEquals(new int[] {1, 0}, result);
	}
	
	@Test public void test3() {
		rotate test = new rotate();
		int[] nums = null;
		int k = 1;
		
		int[] result = test.rotateClass(nums, k);
		
		assertEquals(null, result);
	}
	
	@Test public void test4() {
		rotate test = new rotate();
		int[] nums = new int[] {0, 1};
		int k = 0;
		
		int[] result = test.rotateClass(nums, k);
		
		assertEquals(new int[] {0, 1}, result);
	}
	
	@Test public void test5() {
		rotate test = new rotate();
		int[] nums = new int[] {0};
		int k = 99;
		
		int[] result = test.rotateClass(nums, k);
		
		assertEquals(new int[] {0}, result);
	}
}
