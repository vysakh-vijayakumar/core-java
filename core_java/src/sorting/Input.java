package sorting;

public class Input {
	
	
	public static void main(String args[]){
		int array[] = {5, 3, 8, 7, 1, 4, 6};
		//int array[] = {5, 3, 7, 1, 9, 2};
		MergeSort bs = new MergeSort();
		int[] result = new int[array.length];
		bs.getSortedArray(array, result);
		
		System.out.println("Sorted array:");
		for(int i = 0; i < result.length; i++){
			System.out.println(array[i]);
		}
	}
}
