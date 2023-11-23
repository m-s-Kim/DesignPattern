package iterator;

public class main {
	public static void main(String[] args) {
		Item[] items = {
				new Item("1",2),
				new Item("2",2),
				new Item("3",2),
				new Item("14",2),
				new Item("15",2),
				
		};
		
		Array array = new Array(items);
		Iterator it = array.iterator();
		while(it.next()) {
			Item item = (Item)it.current();
			System.out.println(item);
		}
	}
}
