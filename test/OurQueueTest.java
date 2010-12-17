import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OurQueueTest {

	private OurQueue queue;

	@Before
	public void setup() {
		queue = new OurQueue();
	}

	@Test
	public void testIsEmpty() throws Exception {
		assertTrue(queue.isEmpty());
	}

	@Test
	public void testAddSingleElement() throws Exception {
		queue.push("first");
		assertTrue(!queue.isEmpty());
	}

	@Test
	public void popFirstPushedElement() throws Exception {
		OurQueue queue = new OurQueue();
		queue.push("First");
		queue.push("Second");
		queue.push("Third");
		String firstelement = queue.pop();
		assertEquals("First", firstelement);

	}

	@Test
	public void multiplePushAndPop() throws Exception {
		OurQueue queue = new OurQueue();
		queue.push("First");
		queue.push("Second");
		queue.push("Third");
		queue.pop();
		assertEquals("Second", queue.pop());
		assertEquals("Third", queue.pop());
	}

	@Test
	public void popWithoutAnyElementPresent() throws Exception {
		OurQueue queue = new OurQueue();
		assertEquals(null, queue.pop());
	}

	@Test
	public void checkQueueDoesNotAllowOverflow() {
		int capacity = 5;
		push("first", "second", "third","fourth","fifth");

		push("Sixth");
		assertEquals("Stack Overflowed..", true, queue
				.isCapacityExceeded(capacity));

		queue.pop();
		queue.pop();
		push("foo");
		assertEquals("OurQueue allows insertion when overflowed.Check logic", false, queue
				.isCapacityExceeded(capacity));
	}

	@Test
	public void checkQueueOverflow() {
		push("first", "second", "third");
		int capacity = 4;
		assertEquals("Queue should allow insertion : Check logic", false, queue
				.isCapacityExceeded(capacity));
	}

	private void push(String... elements) {
		for (String element : elements) {
			queue.push(element);
		}
	}

}
