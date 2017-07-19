import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		MergeSort test = new MergeSort();
		
		int[] nums = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		
		int [] ans = test.sort(nums);
		
		System.out.println(Arrays.toString(ans));
		
		// TODO Auto-generated method stub
	
	}
	
	public int[] sort(int[] input) {
		
		//create copy of input
		int[] copy = input; 
		
		//base case is if length of input is 1
		if (copy.length == 1) {
			return copy; 
		}
		
		//find midpoint by dividing length by 2
		int mid = copy.length/2; 
		
		//create two arrays from original split along mid
		int[] left = Arrays.copyOfRange(copy, 0, mid);
		int[] right = Arrays.copyOfRange(copy, mid, copy.length);
		
		//sort left and right sides
		int[] leftsort = sort(left);
		int[] rightsort = sort(right);
		
		//merge left and right sorted sides  (Actual sorting occurs in merge)
		int[] ans = merge(leftsort, rightsort);
		
		return ans; 
		
	}
	
	public int[] merge(int[] left, int[] right) {
		
		//create copy of input 
		int[] ans = Arrays.copyOf(left, left.length + right.length);
		
		//create indicies for ans, left, and right
		int ansind = 0; 
		int leftind = 0; 
		int rightind = 0; 
		
		//while left and right indicies are less than the length of their respective arrays
		while ((leftind < left.length) && (rightind < right.length)) {
			
			//if left side is smaller than corresponding right
			if (left[leftind] < right[rightind]) {
				//put smaller in answer and increase left index
				ans[ansind] = left[leftind];
				ansind++;
				leftind++;
			}
			//if right side is smaller
			else if (left[leftind] > right[rightind]) {
				//add right to ans and increase right index
				ans[ansind] = right[rightind];
				ansind++;
				rightind++;
			}
			
			//if right and left are equal to each other, add both and increase indices
			else {
				ans[ansind] = left[leftind];
				ansind++;
				ans[ansind] = right[rightind];
				ansind++;
				leftind++;
				rightind++;
			}
		}
		
		//if right runs out before left, add the rest of the left
		if ((leftind < left.length) && (rightind == right.length)) {
			for (int i = leftind; i < left.length; i++) {
				ans[ansind] = left[i];
				ansind++;
			}
		}
		
		//if left runs out first, add rest of right
		if ((leftind == left.length) && (rightind < right.length)) {
			for (int i = rightind; i < right.length; i++) {
				ans[ansind] = right[i];
				ansind++;
			}
		}
		
		return ans; 
		
	}

}
