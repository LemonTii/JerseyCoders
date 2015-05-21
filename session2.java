

import java.util.Scanner;

public class session2 {
	
	public static void main(String[] args){
		
		String iceCream = "";
	
		System.out.println("What is your favourite colour?");
		
		Scanner in = new Scanner(System.in);
        String consoleInput = in.nextLine();
        iceCream = consoleInput;
        iceCream = iceCream.toLowerCase();
        
        //System.out.println(iceCream);
        
        switch (iceCream) {
        	case "blue":
        		System.out.println("Nobody Cares");
        		break;
        	case "green":
        		System.out.println("Good");
        		break;
        	case "yellow":
        		System.out.println("Yummy My Fav");
        		break;
        	case "red":
        		System.out.println("Cool");
        }

	}
	
}
