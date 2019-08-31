package sorting;

public class InsertionSort {

	
	public int[] getSortedArray(int array[]){
		int length = array.length;
		
		for(int i = 0; i < length; i++){
			
			int selectedElement = array[i];
			int j = i;
			
			while(j > 0 && array[j - 1] > selectedElement){
				array[j] = array[j - 1];
				j--;
			}
			
			array[j] = selectedElement;
		}
		
		return array;
	}
}
