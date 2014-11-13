import java.util.Arrays;

public class QuickSort {
	private int [] input;
	public QuickSort(int [] input) {
		this.input = input.clone();
	}
	public int [] sort(){
		quick_sort(0, this.input.length - 1);
		return this.input;
	}
	
	private void quick_sort(int left, int right){ // put pivot in the right place and 
		//do the same for the left part and right part
		if (left < right){
			int pivot = partition(left, right);
			quick_sort(left, pivot - 1);
			quick_sort(pivot + 1, right);
		}
	}
	private int partition(int left, int right){ // select a pivot index, put 
		//items less than the pivot value before the pivot index, and put items 
		//greater than pivot value after the pivot index
		int pivot =  ((int) (Math.random() * (right - left)) + left);
		int pivot_value = this.input[pivot];
		swap(pivot, right);
		int last_index = left;
		for (int i = left; i < right; i++) {
			if (this.input[i] < pivot_value){
				swap(last_index, i);
				last_index++;
			}
		}
		swap(last_index, right);
		return last_index;
	}
	private void swap(int i, int j){ // swap item i and j in the array
		int tmp = this.input[i];
		this.input[i] = this.input[j];
		this.input[j] = tmp;
	}
	public static void main(String[] args) {
		// input array
		int array[] = {9,1,0,4,2,-1,5,2, 200, 99, 45, -100};
		// quick sort
		QuickSort quicksort = new QuickSort(array);
		
		// outputs
		System.out.println("Unsorted Array -> "+ Arrays.toString(array));
		System.out.println("QuickSort -> "+ Arrays.toString(quicksort.sort())); // output: QuickSort -> [-100, -1, 0, 1, 2, 2, 4, 5, 9, 45, 99, 200]
	}
}
