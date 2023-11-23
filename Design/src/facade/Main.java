package facade;

public class Main {
	public static void main(String[] args) {
//		DBMS db = new DBMS();
//		Cache cache = new Cache();
		Facade facade = new Facade();
		
		String name = "park";
		facade.run(name);
		
//		Row row = cache.get(name);
//		if(row == null ) {
//			row = db.query(name);
//			if(row != null ) {
//				cache.put(row);
//			}
//		}
//		
//		if(row != null) {
//			Message message = new Message(row);
//			
//			System.out.println(message.makeName());
//			System.out.println(message.makeBirthday());
//			System.out.println(message.makeEmail());
//		}else {
//			System.out.println("no data");
//		}
//		
		
	}
}
