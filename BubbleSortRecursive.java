import java.util.Arrays;

public class BubbleSortRecursive {

	public static void main(String[] args) {
		
		BubbleSortRecursive test = new BubbleSortRecursive();
		
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		
		int [] ans = test.sort(nums, 0, nums.length-1);
		
		System.out.println(Arrays.toString(ans));
		// TODO Auto-generated method stub

	}
	
	public int[] sort(int[] input, int start, int end) {
		
		int[] copy = input; 
		
		//base case if indexes are equal. i.e. the input is empty in essence
		if (start == end) {
			return copy;
		}
		
		
		//for all elements in the list
		for (int i = 0; i < end; i++) {
			//swap elements if one is bigger than its right neighbor
			if (copy[i] > copy[i+1]) {
				int temp = copy[i]; 
				copy[i] = copy[i+1]; 
				copy[i+1] = temp; 
			}
			
			
		}
		
		//recursively call, ignoring sorted elements (end-1)
		return sort(copy, 0 ,end-1);
		
	}

}
