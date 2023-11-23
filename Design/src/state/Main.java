package state;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 상태를 객체화 한 패턴
		// 조건절을 효과적으로 줄여줌
		
		Player player = new Player();
		
		Scanner sc = new Scanner(System .in);
		
		while(true) {
			System.out.println("플레이어의 상태 :"+ player.getState().getDescription()
						+ "/ 속도 : "+ player.getSpeed() + "km/h");
			
			System.out.println("[1] 제자리 서기 [2] 앉기 [3] 걷기 [4] 뛰기 [5] 종료");
			
			String input = sc.next();
			System.out.println();
			if(input.equals("1")) player.getState().standUp();
			if(input.equals("2")) player.getState().sitDown();
			if(input.equals("3")) player.getState().walk();
			if(input.equals("4")) player.getState().run();
			if(input.equals("5")) break;
		}
		
	}
}
