import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OurQueueTest {
	
	private OurQueue queue;
	
	@Before
	public void setup()
	{
		queue = new OurQueue();
	}
	
	@Test
	public void testIsEmpty() throws Exception {
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void testAddSingleElement() throws Exception {
		queue.add("first");
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

}
