package interpreter;

public class Main {
	public static void main(String[] args) {
		String script = "BEGIN FRONT LOOP 3 LOOP 2 RIGHT FRONT END LOOP 3 LEFT END BACK RIGHT END BACK END";
		
		Context context = new Context(script);
		
		Expression expression = new BeginExpression();
		if(expression.parse(context)) {
			System.out.println(expression);
			expression.run();
		}
		
		
		
		
		
		/*
		 * while(true) { String keyword = context.getCurrentKeyword(); if(keyword ==
		 * null) break;
		 * 
		 * System.out.println(keyword); context.readNextKeyword(); }
		 */
	}
}
