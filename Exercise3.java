
public class Exercise3 {

	public static void main(String[] args) {
		
		Integer[] ints = {1,5,4,7,3,5,6,2,12,3,10};
		
		Exercise3 test = new Exercise3();
		
		System.out.println(test.exercise3(ints, 0, ints.length-1));
		
		// TODO Auto-generated method stub

	}
	
	//adjusted from slides
	//find maximum using binary recursion
	public int exercise3(Integer[] ints, int start, int end) {
		
		//base case, when range contains only 1 element
		if (start == end) {
			return ints[start];
		}
		
		//midpoint calculation
		int mid = (start+end)/2; 
		
		//binary recursive calls 
		int max1 = exercise3(ints, start, mid);
		int max2 = exercise3(ints, mid+1, end);
		
		//evaluate greater than and return the larger
		if (max1>max2) {
			return max1;
		}
		
		else {
			return max2;
		}
	}

}
