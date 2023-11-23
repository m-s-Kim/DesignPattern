package Mediator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		SmartHome home = new SmartHome();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			home.report();
			
			
			
			int i = sc.nextInt();
			if(i==1) home.door.open();
			if(i==2) home.door.close();
			if(i==3) home.window.open();
			if(i==4) home.window.close();
			if(i==5) home.coolAircon.on();
			if(i==6) home.coolAircon.off();
			if(i==7) home.heatBoiler.on();
			if(i==8) home.heatBoiler.off();
			
		}while(true);
		
	}
}
