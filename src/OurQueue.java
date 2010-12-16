import java.util.ArrayList;
import java.util.List;


public class OurQueue {

	private List<String> queue ;
	
	public OurQueue()
	{
		queue = new ArrayList<String>();
	}
	
	public boolean isEmpty() {
		return queue.size() == 0;
	}

	public void add(String element) {
		queue.add(element);
	}

}
