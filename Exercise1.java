import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two strings to check if they are opposites of each other.");
		System.out.println("First string:");
		
		String a = scanner.nextLine();
		
		System.out.println("Second string:");
		String b = scanner.nextLine();
		
		scanner.close();
		
		Exercise1 test = new Exercise1();
		
		System.out.println(test.exercise1(a, b));
		
		// TODO Auto-generated method stub

	}
	
	//check if word is reverse of another
	public int exercise1(String a, String b) { //tested
		
		//declare and initiate blank string
		String rvsed = "";
		String noSpaces = "";
		
		//iterate backwards through string, removing spaces as necessary
		for (int i = a.length()-1; i>=0; i--) {
			//ignore blanks
			if (a.charAt(i) == ' ') {
				continue;
			}
			//if not blank, add character to blank string 
			else {
				rvsed += a.charAt(i);
			}
		}
		
		//remove spaces in other
		for (int i = 0; i < b.length(); i++) {
			//ignore blanks
			if (b.charAt(i) == ' ') {
				continue;
			}
			//if not blank, add character to blank string 
			else {
				noSpaces += b.charAt(i);
			}
		}
		
		//use equalsIgnoreCase to disregard case in comparison. 
		if (rvsed.equalsIgnoreCase(noSpaces)) {
			return 1;
		}
		
		else {
			return 0; 
		}
			
	}

}
