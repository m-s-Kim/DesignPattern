package visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemList implements Unit {
	private ArrayList<Unit> list = new ArrayList<Unit>();
	
	public void add(Unit unit) {
		list.add(unit);
	}
	
	@Override
	public void accept(Visitor visitor) {
		Iterator<Unit> it = list.iterator();
		
		while(it.hasNext()) {
			Unit unit = it.next();
			visitor.visit(unit);
		}
	}
	

}
