package search_sort;

public class BinarySearch {
	
	
	public static int findElement(int arr[],int a) {
		
		int first=0, last=arr.length-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(arr[mid]==a) {
				return mid;
			}
			if(arr[mid]<a) {
				first=mid+1;
			}
			else {
				last=mid-1;
			}	
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		int element=70;
		int arr[]= {10,20,30,40,50};
		int result=	findElement(arr,element);
		if (result==-1) {
			System.out.println("Element "+element+" is not present in the array");
		}
		else {
			System.out.println("Element "+element+" is at index "+result);
		}
		
	}

}
