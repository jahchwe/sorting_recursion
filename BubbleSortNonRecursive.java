import java.util.Arrays;

public class BubbleSortNonRecursive {
	
	public static void main(String[] args) {
		
		BubbleSortNonRecursive test = new BubbleSortNonRecursive();
		
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		
		int [] ans = test.sort(nums);
		
		System.out.println(Arrays.toString(ans));

		
		// TODO Auto-generated method stub

	}
	
	public int[] sort(int[] input) {
		
		//create copy of input 
		int[] copy = Arrays.copyOf(input, input.length);
		
		//for all elements in the array
		for (int i = 0; i< copy.length-1; i++) {
			//for all unsorted elements
			for (int j = 0; j< copy.length-1-i; j++) {
				if (copy[j] > copy[j+1]) {
					//swap if element is greater than its neighbor
					int temp = copy[j];
					copy[j] = copy[j+1];
					copy[j+1] = temp;
				}
			}
		}
		
		return copy; 
		
	}

}
