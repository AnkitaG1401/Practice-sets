package search_sort;

public class LinearSearch {
	
	
	public static int findElement(int arr[],int a) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a)
				return i;
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int element= 40;
		int arr[]= {10,20,30,40,50,60};
		System.out.println("Index position of "+element+" is "+findElement(arr,element));
	}

}
