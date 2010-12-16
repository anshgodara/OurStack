public class DatabaseLogger {
	public void log(String string) {
		try{
			Class.forName("com.foo.Bar");
			//...
		}
		catch (Exception e) {
			throw new RuntimeException("Cannot connect to database");			
		}
	}
}
