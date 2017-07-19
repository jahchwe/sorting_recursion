import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		SelectionSort test = new SelectionSort();
		
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		
		int [] ans = test.sort(nums);
		
		System.out.println(Arrays.toString(ans));
		// TODO Auto-generated method stub

	}
	
	public int[] sort(int[] input) {
		
		int[] copy = input; 
		
		//for all elements in the list
		for (int i = 0; i < copy.length; i++) {
			
			System.out.println(Arrays.toString(copy));
			
			//default smallest to copy[i], or the element you will be comparing to the others
			int smallest = copy[i]; 
			int index = i; 
			
			//compare selected element to all other unsorted elements .
			//j = i to exclude all sorted elements
			for (int j = i; j <copy.length; j++) {
				//if smaller element found, record details
				if (copy[j] < smallest) {
					smallest = copy[j];
					index = j; 
				}
			}
			
			//swap selected element with smallest 
			int temp = copy[index];
			copy[index] = copy[i];
			copy[i] = temp;
			
		}
		
		return copy; 
		
	}

}
