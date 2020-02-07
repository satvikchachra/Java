public class quickSort {
	
	//low : starting index
	//high : ending index
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {90,20,50,10,40,12,25,38};
		display(arr);
		quickSortRecursive(arr,0,arr.length-1);
	}
	static void quickSortRecursive(int[] arr, int low , int high) {
		if(low < high) {
		int pi = partition(arr,low,high);
		quickSortRecursive(arr,low,pi-1);
		quickSortRecursive(arr,pi+1,high);
		}
	}
	static int partition(int[] arr, int low, int high) {
		System.out.println(low + " " + high);
		int pivot = arr[high];
		int partitionIndex = low, count = 0 ;
		for(int i = low ; i < high; i++) {
			if(arr[i] <= pivot) {
				//swap i'th and partitionIndex'th element
				int temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;
				partitionIndex++;
			}
			System.out.print(count + "		");
			count++;
			display(arr);

		}
		//swap partitionIndex'th and last element which was considered pivot
		int temp = arr[partitionIndex];
		arr[partitionIndex] = arr[high];
		arr[high] = temp;
		
		return partitionIndex;
	}
	static void display(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
