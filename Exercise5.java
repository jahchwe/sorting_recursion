import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Exercise5 test = new Exercise5();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter string to evaluate if palindrome:");
		
		String input = scanner.nextLine();
		
		System.out.println(test.exercise5(input));
		
		scanner.close();
		
		// TODO Auto-generated method stub

	}
	
	//check if palindrome
	public Boolean exercise5(String input) {
		
		//base case is if input is one or zero letters long, depending on whether total length is even or odd
		if (input.length() == 1 || input.length() == 0) {
			return true;
		}
		
		//check if first and last character are the same 
		if (input.charAt(0) == input.charAt(input.length()-1)) {
			//if so, recursively call same string without first and last elements 
			return exercise5(input.substring(1, input.length()-1));
			
		}
		//if at any point first and last do not match, return false; 
		else {
			return false; 
		}
		
		
		
	}

}
