import java.util.Arrays;

public class BubbleSort {
	private int [] input;
	public BubbleSort(int [] input){
		this.input = input.clone();
	}
	public int [] sort(){
		if (this.input == null)
			return null;
		for (int i = 0; i < this.input.length; i++) {
			for (int j = i + 1; j < this.input.length; j++) {
				if (this.input[i] > this.input[j]){
					//swap
					swap(i,j);
				}
			}
		}
		return this.input;
	}
	private void swap(int i, int j){
		int tmp = this.input[i];
		this.input[i] = this.input[j];
		this.input[j] = tmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {9,1,0,4,2,-1,5,2, 200, 99, 45, -100};
		BubbleSort bubblesort = new BubbleSort(array);
		
		System.out.println("Unsorted Array -> "+ Arrays.toString(array));
		System.out.println("BubbleSort -> "+ Arrays.toString(bubblesort.sort())); // output: BubbleSort -> [-100, -1, 0, 1, 2, 2, 4, 5, 9, 45, 99, 200]
	}
}
