import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		QuickSort test = new QuickSort();
		
		int[] nums = {4, 5, 3, 63, 7, 9, 10, 43, 28, 43, 85, 20, 19, 3, 5, 10, 11, 9, 24, 29, 30};
		
		int [] ans = test.sort(nums);
		
		System.out.println(Arrays.toString(ans));
		// TODO Auto-generated method stub

	}
	
	public int[] sort(int[] elements) {
		
		quickSort(elements, 0, elements.length-1);
		
		return elements; 
		
	}
	
	public void quickSort(int[] elements, int low, int high) {
		
		//base case if input is empty or only 1 element
		if (elements.length == 0 || elements.length == 1) {
			return; 
		}
		
		//initialize low and high indicies to input
		int lowind = low; 
		int highind = high; 
		
		//identify pivot. Not just (high-low)/2 because it has to be in reference to where you are starting (i.e. low)
		int pivot = elements[low + (high - low)/2];
		
		//while the two indexes have not crossed each other. 
		while (lowind <= highind) {
			
			//while the element is less than the pivot.
			//remember that we are looking for things that are larger than pivot so they can go on other side
			while (elements[lowind] < pivot) {
				lowind++;
			}
			
			//same with other side, looking for stuff that is smaller
			while (elements[highind] > pivot) {
				highind--; 
			}
			
			//if they have not crossed, switch the elements found. 
			//if we switched even if they crossed, we would be working backwards. 
			if (lowind <= highind) {
				
				int temp = elements[lowind];
				elements[lowind] = elements[highind];
				elements[highind] = temp; 
				//increase indexes because their elements have been evaluated 
				lowind++;
				highind--;
			}
		}
		
		//if there is more space on the right to be evaluated
		//remember that this is after the two indexes have crossed so the array looks like this
		//{low, ......, highind, lowind, ......, high);
		//thus, if there is still space, that is lowind is not the same or greater than high, recursively call right
		if (lowind < high) {
			quickSort(elements, lowind, high);
		}
		
		//same idea but with the left. 
		if (highind > low) {
			quickSort(elements, low, highind);
		}
 		
	
	}

}
