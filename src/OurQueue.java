import java.util.ArrayList;
import java.util.List;


public class OurQueue {
	
	private List<String> elements = new ArrayList<String>();


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
	
	public void push(String element){
		this.elements.add(element);
	}

	public String pop() {
		if(!elements.isEmpty()){
			String firstelement = elements.get(0);
			elements.remove(0);
			return firstelement;
		} else
			return null;
	}

}
