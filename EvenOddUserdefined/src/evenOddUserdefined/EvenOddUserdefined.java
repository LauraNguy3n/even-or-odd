package evenOddUserdefined;
import java.util.Scanner;
public class EvenOddUserdefined {
	
	static void evenOdd(int n) {
			
		if (n%2==0){
		System.out.println( "The number " + n + " is even." );
		
	    }			
		else {
			
		      System.out.println( "The number " + n + " is odd.");
		}
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Type your number below: ");
	int n = sc.nextInt();
	evenOdd(n);
	
	}

}


/*create a user defined method to determine even or odd number 
		hints:
			1. take a number 'n' as a parameter for the user defined method  
			2. use scanner library to take the number 'n' as user input
			3. call the user defined inside the main method 
		*/

// next question: Find average of three numbers using user defined method. Use user input.



