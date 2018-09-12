import java.util.Scanner;

public class Player {
	boolean player;
	Scanner s = new Scanner(System.in);
	
	Player(boolean p){
		player = p;
		
		
	}
	
	public int normal() { //plays a normal game of rock paper scissors
		if(player) {
			System.out.println("type r for rock, p for paper, or s for scissors");
			switch(s.next()) {
			case "r": return 0;
			case "p": return 1;
			case "s": return 2;
			default: return -1;
			}
		}else {
			return (int)(Math.random()*3);
		}
	}
	
	public int crazy() {
		if(player) {
			System.out.println("type r for rock, p for paper, sc for scissors, l for lizard, or sp for spock");
			switch(s.next()) {
			case "r": return 0;
			case "p": return 1;
			case "sc": return 2;
			case "l": return 3;
			case "sp": return 4;
			default: return -1;
			}
		}else {
			return (int)(Math.random()*5);
		}
	}
	
	public int bad(int x) {
		if(player) {
			System.out.println("type r for rock, p for paper, or s for scissors");
			switch(s.next()) {
			case "r": return 0;
			case "p": return 1;
			case "s": return 2;
			default: return -1;
			}
		}else {
			if(x==2) {
				return 0;
			}
			return x+1;
		}
	}
	
	public int hidden(int x) {
		if(player) {
			System.out.println("type r for rock, p for paper, or s for scissors");
			switch(s.next()) {
			case "r": return 0;
			case "p": return 1;
			case "s": return 2;
			default: return -1;
			}
		}else {
			if(x==0) {
				return 2;
			}
			return x-1;
		}
	}
}



