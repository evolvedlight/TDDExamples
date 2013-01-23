import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StackTest {

	private Stack stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new Stack();
	}
	
	@Test
	public void uponCreation_stackWillBeEmpty() throws Exception {
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void afterOnePush_stackIsNotEmpty() throws Exception {
		stack.push(0);
		assertFalse(stack.isEmpty());
		assertEquals(1, stack.getSize());
	}
	
	@Test(expected=Stack.Underflow.class)
	public void afterPoppingEmptyStack_willReturnUnderflow() throws Exception {
		stack.pop();
	}
	
	@Test
	public void afterOnePushAndOnePop_stackWillBeEmpty() throws Exception {
		stack.push(0);
		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void afterPushing_willReturnWhatGotPushed() throws Exception {
		stack.push(0);
		assertEquals(stack.pop(), 0);
	}	
	
	@Test
	public void afterPushing99_willReturn99() throws Exception {
		stack.push(99);
		assertEquals(99, stack.pop());
	}
	
	@Test
	public void afterPushingXandY_willPopYThenX() throws Exception {
		stack.push(99);
		stack.push(88);
		assertEquals(88, stack.pop());
		assertEquals(99, stack.pop());
	}
	
	@Test
	public void afterPushing10Values_willReturnThem() throws Exception {
		for (int x = 0; x<=10; x++) {
			stack.push(x);
		}
		for (int x = 10; x >= 0; x--) {
			assertEquals(x, stack.pop());
		}
	}
}
