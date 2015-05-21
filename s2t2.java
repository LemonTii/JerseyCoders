import java.util.Random;
import java.util.Scanner;

public class s2t2 {

	public static void main(String[] args){
		
		Random rand = new Random();
		
		int correct = 0;
		
	    int num = rand.nextInt(100);
	    System.out.println(num);
	    
	    while (correct < 1) {
		
	    	System.out.println("Guess a number between 1-100");
		
	    	Scanner in = new Scanner(System.in);
	    	String consoleInput = in.nextLine();
	    	int guess = Integer.parseInt(consoleInput);
        
	    	if(guess == num) {
        	
	    		System.out.println("Correct!");
	    		correct = 1;
	    	}
        
	    	else if(guess < num) {
        	
	    		System.out.println("Wrong. The number is higher than your guess");
        	
	    	}
	    	
	    	else if(guess > num) {
        	
	    		System.out.println("Wrong. The number is lower than your guess");
        	
	    	}
        
	    	else if(guess > 100) {
        	
	    		System.out.println("This is not a valid answer");
        	
	    	}
        
	    	else if(guess < 1) {
        	
	    		System.out.println("This is not a valid answer");
	    	}
        
	    	else {
        	
	    		System.out.println("This is not a valid answer");
        	
	    	}
	    }
	}
}
