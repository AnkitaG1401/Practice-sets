package search_sort;

public class BubbleSort {
	
	void sort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				
		}
	}
	
	void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort=new BubbleSort();
		int arr[]= {5,50,1,17,33,24};
		bubbleSort.sort(arr);
		System.out.print("Sorted Array : ");
		bubbleSort.printArray(arr);
	}

}
