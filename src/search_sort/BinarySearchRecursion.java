package search_sort;

public class BinarySearchRecursion {
	
	public static int findIndex(int arr[],int first,int last,int a){
		while(first<=last) {
			int mid=(first+last)/2;
			if(arr[mid]==a)
				return mid;
			if(arr[mid]>a)
				return findIndex(arr, first , mid-1, a);

			return findIndex(arr, mid+1, last, a);
		}
		return -1;
	}

	public static void main(String[] args) {

		int element=55;
		int arr[]={10,20,30,40,50,60};
		int last=arr.length-1;
		int result = findIndex(arr,0,last,element);
		if(result==-1)
			System.out.println("Element "+element+" is not present in the array");
		else
			System.out.println("Element "+element+" is present at index "+result);
	}

}
