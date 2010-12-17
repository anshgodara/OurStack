import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class OurStackTest {
	private OurStack stack;
	private DatabaseLogger databaseLogger;

	@Before
	public void setup() {
		databaseLogger = Mockito.mock(DatabaseLogger.class);
		stack = new OurStack(databaseLogger);
	}
	
	@Test
	public void stackIsEmptyWhenInitialized() throws Exception {
		assertTrue(stack.isEmpty());
	}

	@Test
	public void popLastPushedElement() throws Exception {
		push("first");
		assertEquals("first", stack.pop());
	}

	@Test
	public void stackIsNotEmptyWhenAnElementIsAdded() throws Exception {
		push("first");
		assertFalse(stack.isEmpty());
	}

	@Test
	public void checkMultiplePops() throws Exception {
		push("first", "second");

		assertEquals("second", stack.pop());
		assertEquals("first", stack.pop());
	}

	@Test
	public void checkDuplicateElementSupport() throws Exception {
		push("first", "second", "first");
		stack.pop();
		assertEquals("second", stack.pop());
		assertEquals("first", stack.pop());
	}
	
	@Test
	public void checkPeekReturnsNullFromEmptyStack() throws Exception {
		String element = stack.peek();
		assertNull(element);
	}
	
	@Test
	public void checkPeekReturnsTopElement() throws Exception {
		push("first");
		assertEquals("first", stack.peek());
	}
	
	@Test
	public void checkPeekDoesNotReduceStackSize() throws Exception {
		assertEquals(true, stack.isEmpty());
		push("first");
		assertEquals(false, stack.isEmpty());
		stack.peek();
		assertEquals(false, stack.isEmpty());
	}
	
	@Test
	public void checkIfPushCallsDatabaseLogger() throws Exception {
		push("first");
		Mockito.verify(databaseLogger).log("Pushed:first");
	}
	
	private void push(String... elements) {
		for (String element : elements) {
			stack.push(element);
		}
	}
}
