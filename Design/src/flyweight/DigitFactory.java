package flyweight;

public class DigitFactory {
	private Digit[] pool = new Digit[] {
			null,null,null,null,null,null,null,null,null,null
	};
	
	public Digit getDigit(int n) {
		if(pool[n] != null) {
			return pool[n];
		}else {
			String fileName = String.format("C:/Tools/workspace/Design/src/flyweight/%d.txt",n);
			Digit digit = new Digit(fileName);
			pool[n] = digit;
			return digit;
			///Design/src/flyweight/
			//C:/Tools/workspace/Design/src/flyweight
			//./data/
		}
	}

}
