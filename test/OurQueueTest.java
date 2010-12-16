import static org.junit.Assert.*;

import org.junit.Test;



public class OurQueueTest {
	@Test
	public void isEmpty() throws Exception {
		OurQueue queue = new OurQueue();
		assertTrue(queue.isEmpty());
	}
}
