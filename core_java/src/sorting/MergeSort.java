package sorting;

public class MergeSort {
	
	public void getSortedArray(int[] array, int[] result){
		mergeSort(array, result, 0, array.length - 1);
	}
	
	public void mergeSort(int[] array, int result[], int left, int right){
		
		if(right > left){
			//int result[] = new int[right - left + 1];
			int mid = (left + right) / 2;
			mergeSort(array, result, left, mid);
			mergeSort(array, result, mid+1, right);
			System.out.println("First half left : " + left + " mid : " + mid);
			print(result, left, mid);
			System.out.println("Second half mid+1 : "+ (mid+1) + " right : "+ right);
			print(result, mid + 1, right);
			merge(array, result, left, mid, (mid + 1), right);
		}
	}
	
	void print(int[] array, int left, int right)
	{
		for(int i = left; i <= right; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	
	public void merge(int[] array, int result[], int left1, int right1, int left2, int right2){
		
		//int result[] = new int[(right1 - left1 + 1)+(right2 - left2 + 1)];
		int pos = left1;
		
		int first, second;
		
		first = left1;
		second = left2;
		
		while((first <= right1) && (second <= right2)){
			if(array[first] < array[second]){
				result[pos++] = array[first++];
			}
			else{
				result[pos++] = array[second++];
			}
		}
	
		while(first <= right1){
			result[pos++] = array[first++];
		}
		
		while(second <= right2){
			result[pos++] = array[second++];
		}
		
		for(int j = left1; j <= right2; j++){
			array[j] = result[j];
		}
		
//		System.out.println("After merging");
//		print(result, 0, result.length - 1);
	}
}
