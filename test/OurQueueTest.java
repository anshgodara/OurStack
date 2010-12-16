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
}
