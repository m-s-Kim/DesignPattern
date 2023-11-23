package interpreter;

public class LoopCommandExpression extends CommandExpression  {
	private int count;
	private CommandListExpression expression;
	
	public LoopCommandExpression(String keyword) {
		super(keyword);
	}

	@Override
	public boolean parse(Context context) {
		if(!checkValidKeyword(keyword)) return false;
		
		String countKeyWord = context.readNextKeyword();
		if(countKeyWord == null ) return false;
		
		
		try {
			count = Integer.parseInt(countKeyWord);
			expression = new CommandListExpression();
			if(context.readNextKeyword() == null) return false;
			return expression.parse(context);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean run() {
		for(int i =0 ; i< count; i++) {
			if(!expression.run()) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkValidKeyword(String keyword) {
		return keyword.equals("LOOP");
	}

	@Override
	public String toString() {
		return "Loop(" + count + ")" + expression;
	}
	
	
	

}
