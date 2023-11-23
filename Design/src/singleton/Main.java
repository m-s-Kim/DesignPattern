package singleton;

public class Main {
	public static void main(String[] args) {
//		King king = king.getInstance();
//		King king = new King();
		
		
		King king = King.getInstance();
		king.say();
		
		King king2 = King.getInstance();
		
		if(king.hashCode() == king2.hashCode()) {
			System.out.println(king.hashCode());
			System.out.println(king2.hashCode());
			System.out.println("ddd");
		}else {
			System.out.println("false");
		}
		
	}
}
