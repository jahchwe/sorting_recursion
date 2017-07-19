import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Exercise2 test = new Exercise2();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter string of strings to identify shortest string in sets of three: (Number of strings must be multiple of three) ");
		String input = scanner.nextLine();
		
		scanner.close();
		
		System.out.println(test.exercise2(input));
		// TODO Auto-generated method stub

	}
	
	//finding shortest string in set of three
	public String exercise2(String input) {
		
		//declare and initialize blank string
		String ans = "";
		
		//split input into strings based on spaces
		String[] split = input.split(" ");
		
		//for each set of three
		for (int i = 3; i<=split.length; i+=3) {
			//find the minimum. initialize min and ind to be first in the set of three
			int min = split[i-3].length();
			int ind = i-3; 
			
			//find min
			for (int j = i-3; j<i; j++) {
				if (split[j].length()<min) {
					min = split[j].length();
					ind = j;
				}
				
			}
			
			//use multiple strings since concat makes a new string, strings immutable 
			String temp = ans.concat(split[ind]);
			String temp1 = temp.concat(" ");
			ans = temp1; 
			
		}
		
		return ans; 
	}

}
