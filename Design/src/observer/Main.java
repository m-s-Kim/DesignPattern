package observer;

public class Main {
	public static void main(String[] args) {
		FairDiceGame diceGame = new FairDiceGame();
		
		Player player1 = new EvenBettingPlayer("멍군");
		Player player2 = new OddBettingPlayer("삽살개");
		Player player3 = new EvenBettingPlayer("진돗개");
		
		diceGame.addPlayer(player1);
		diceGame.addPlayer(player2);
		diceGame.addPlayer(player3);
		
		for(int i = 0; i < 3 ; i++) {
			diceGame.play();
			System.out.println();
		}
		
		
	}
}
