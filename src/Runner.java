import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Player human = new Player(true);
		Player computer = new Player(false);
		int temp;
		
		Scanner s = new Scanner(System.in);
		System.out.println("please pick a gamemode, normal, crazy, or bad");
		
		
		switch(s.next()){
			case "normal": 
				System.out.println(play(human.normal(),computer.normal(),0));
				break;
			case "crazy": 
				System.out.println(play(human.crazy(),computer.crazy(), 1));
				break;
			case "bad": 
				temp = human.bad(1);
				System.out.println(play(temp, computer.bad(temp),2));
				break;
			case "hidden": 
				temp = human.hidden(1);
				System.out.println(play(temp, computer.hidden(temp),3));
				break;
			default: 
				System.out.println("You did something wrong, please try again");
				break;
		}

	}
	
	private static String play(int p, int c, int g) {
		if(p==-1) 
			return "You input an invalid play, you lose!";
		if(p==c)
			return "its a tie! Congrats, no one accomplished anythhing.";
		
		if(p==c+3||p==c-2||p==c+1||p==c+4) {
			return "Hooray, you won!";
		}
		return "Sorry, you lost";
	}
	
}
