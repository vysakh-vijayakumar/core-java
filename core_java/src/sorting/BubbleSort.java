package sorting;

/*
 * Class implementing Bubble Sort 
 */ 
public class BubbleSort {

	public int[] getSortedArray(int array[]){
		
		int length = array.length;
		Boolean swaped = false;
		
		for(int i = 0; i < length; i++){
			for(int j = 0; j < length - i - 1; j++){
				if(array[j] > array[j+1]){
					swap(array, j, j+1);
					swaped = true;
				}
			}
			
			if(!swaped){
				return array;
			}
		}
		
		return array;
	}
	
	public void swap(int array[], int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
