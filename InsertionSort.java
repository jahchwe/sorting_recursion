import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		InsertionSort test = new InsertionSort();
		
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		
		int [] ans = test.sort(nums);
		
		System.out.println(Arrays.toString(ans));
		
		// TODO Auto-generated method stub

	}

	public int[] sort(int[] input) {
		
		//create copy of input
		int[] copy = input; 
		
		//for all elements in the list. Start at [1] because [0] is the default sorted part
		for (int i = 1; i < input.length; i++) {
			
			//initialize values
			int value = copy[i];
			int insertindex = i-1; 
			
			//decrement from selected element, evaluating elements on the way down to find insertion point
			while (insertindex >= 0) {
				
				//if location is found, break i.e. the element is less than the value
				if (copy[insertindex] < value) {
					break; 
				}
				
				//else, shift elements to the right. and decrement index
				copy[insertindex+1] = copy[insertindex];
				insertindex--;
			}
			//once index is found, insert value
			copy[insertindex+1] = value; 
			
		}
		
		return copy; 
		
	}
}
