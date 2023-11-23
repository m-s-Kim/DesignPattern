package Memento;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// 객체를 상태를 기억해두었다가 객체의 상태를 기억해둔 상태로 되돌림
		// 객체의 상태에 대한 기억은 다른 객체에서도 읽기 전용으로 접근
		// 객체의 상태에 대한 기억에 대한 생성은 오직 해당 객체만 생성 가능
		
        Walker walker = new Walker(0, 0, 10, 10);
        String[] actions = {"UP", "RIGHT", "DOWN", "LEFT"};
        Random random = new Random();
        double minDistance = Double.MAX_VALUE;
        Walker.Memento memento = null;

        while (true) {
            String action = actions[random.nextInt(4)];
            double distance = walker.move(action);

            System.out.println(action + " " + distance);

            if (distance == 0.0) {
                break;
            }

            if (minDistance > distance) {
                minDistance = distance;
                memento = walker.createMemento();
            } else {
                if (memento != null) {
                    walker.restoreMemento(memento);
                }
            }
        }

        // Print the entire path after the walker has finished moving
        System.out.println("Walker's path: " + walker.getPath());

	}
}
