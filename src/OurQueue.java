import java.util.ArrayList;
import java.util.List;


public class OurQueue {
	
	private List<String> elements = new ArrayList<String>();


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
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
