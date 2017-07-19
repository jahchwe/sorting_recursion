import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Exercise4 test = new Exercise4();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number to count 0s of:");
		
		int input = scanner.nextInt();
		
		System.out.println(test.exercise4(input));
		
		scanner.close();
		// TODO Auto-generated method stub

	}
	
	//count number of 0s in binary representation of number
	public int exercise4(int input) {
		
		//base cases 
		if (input == 0) {
			return 1;
		}
		
		else if (input == 1) {
			return 0; 
		}
		
		//number of zeros is equal to 0s in /2 and %2 due the nature of binary representation.
		//All binary representations can be decomposed using /2 and %2
		return exercise4(input/2) + exercise4(input%2);
		
		
		
	}

}
