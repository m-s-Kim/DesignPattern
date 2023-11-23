package facade;
import java.util.HashMap;

public class DBMS {
	private HashMap<String, Row> db = new HashMap<String, Row>();
	
	public DBMS() {
		db.put("jane", new Row("jane","1991","abc@co.kr"));
		db.put("test", new Row("test","1923","test@co.kr"));
		db.put("park", new Row("park","2002","park@co.kr"));
	}
	
	
	public Row query(String name) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return db.get(name.toLowerCase());
		
	}
	
	
	

}
