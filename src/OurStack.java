import java.util.ArrayList;
import java.util.List;

public class OurStack {
	private List<String> elements = new ArrayList<String>();
	private DatabaseLogger databaseLogger;
	
	public OurStack(DatabaseLogger databaseLogger)
	{
		this.databaseLogger = databaseLogger;
	}
	
	public boolean isEmpty() {
		return elements.size() == 0;
	}

	public void push(String element) {
		log("Pushed:", element);
		this.elements.add(element);
	}

	private void log(String action, String element) {
		databaseLogger.log(action + element);
	}

	public String pop() {
		int position = elements.size() - 1;
		
		String element = elements.get(position);
		elements.remove(position);
		
		log("Popped:", element);
		return element;
	}
}
