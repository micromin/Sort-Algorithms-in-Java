import java.util.Arrays;

public class BubbleSort {
	private int [] input;
	public BubbleSort(int [] input){
		// copying the input into a new array
		this.input = input.clone();
	}
	public int [] sort(){
		if (this.input == null) // empty array
			return null;
		// two loops for comparing all items with each other
		for (int i = 0; i < this.input.length; i++) {
			for (int j = i + 1; j < this.input.length; j++) {
				if (this.input[i] > this.input[j]){
					//swap items
					swap(i,j);
				}
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
		// bubble sort
		BubbleSort bubblesort = new BubbleSort(array);
		
		// outputs
		System.out.println("Unsorted Array -> "+ Arrays.toString(array));
		System.out.println("BubbleSort -> "+ Arrays.toString(bubblesort.sort())); // output: BubbleSort -> [-100, -1, 0, 1, 2, 2, 4, 5, 9, 45, 99, 200]
	}
}
