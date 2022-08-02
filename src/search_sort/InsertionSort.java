package search_sort;

public class InsertionSort {
	
	void sort(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			
			arr[j+1]=key;
		}
	}

	void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		InsertionSort insertionSort=new InsertionSort();
		int arr[]= {30,5,10,25,60,20,50,100,90};
		insertionSort.sort(arr);
		System.out.print("Sorted Array : ");
		insertionSort.printArray(arr);
	}

}
