import java.util.ArrayList;
import java.util.List;

public class OurQueue {

	private List<String> queue;

	public OurQueue() {
		queue = new ArrayList<String>();
	}

	public boolean isEmpty() {
		return queue.size() == 0;
	}

	public void push(String element) {
		queue.add(element);
	}

	public String pop() {
		if (!queue.isEmpty()) {
			String firstelement = queue.get(0);
			queue.remove(0);
			return firstelement;
		} else
			return null;
	}

	public boolean isCapacityExceeded(int capacity) {
		return queue.size() > capacity;
	}

}
