import java.util.Arrays;

public class InsertionSort {
	private int [] input;
	public InsertionSort(int [] input) {
		// copying the input into a new array
		this.input = input.clone();
	}
	public int [] sort(){
		// a loop for finding a small item and then swapping it with other bigger items
		for (int i = 1; i < this.input.length; i++) {
			int j = i;
			while (j > 0 && this.input[j] < this.input[j - 1]){
				//swap item j-1 and j
				swap(j - 1,j);
				j--;
			}
		}
		return this.input;
	}
	private void swap(int i, int j){ // swap item i and j in the array
		int tmp = this.input[i];
		this.input[i] = this.input[j];
		this.input[j] = tmp;
	}
	public static void main(String[] args) {
		// input array
		int array[] = {9,1,0,4,2,-1,5,2, 200, 99, 45, -100};
		// insertion sort
		InsertionSort insertionsort = new InsertionSort(array);
		
		// outputs 
		System.out.println("Unsorted Array -> "+ Arrays.toString(array));
		System.out.println("InsertionSort -> "+ Arrays.toString(insertionsort.sort())); // output: InsertionSort -> [-100, -1, 0, 1, 2, 2, 4, 5, 9, 45, 99, 200]
	}
}
