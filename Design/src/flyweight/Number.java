package flyweight;

import java.util.ArrayList;

public class Number {
	private ArrayList<Digit> digitList = new ArrayList<Digit>();

	public Number(int number) {
		String strNum = Integer.toString(number);
		int len = strNum.length();
		
		DigitFactory digitFactory = new DigitFactory();
		for(int i = 0; i < len; i++) {
			int n = Character.getNumericValue(strNum.charAt(i));
			Digit digit = digitFactory.getDigit(n);
			digitList.add(digit);
		}
	}
	
	public void print(int x, int y) {
		for(int i = 0; i < digitList.size(); i++) {
			Digit digit = digitList.get(i);
			digit.print(x+(i*8), y);
		}
	}
	
	

}
