import java.util.Scanner;
class binarysearch{

	public static void binsearch(int arr[], int first, int last, int search){
		int mid = (first+last)/2;
		while(first <= last){
			if(arr[mid]<search){
				first = mid+1;
			}
			else if (arr[mid] == search) {
				System.out.println("Element found at index: "+mid);
				break;
			}
			else{
				last = mid-1;
			}
			mid = (first+last)/2;
		}
			if(first>last){														/*NOT RIGHT PROGRAM*/
				System.out.println("Element not found");
			}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

    	System.out.print("Enter number of elements: ");
       	int n= sc.nextInt();

       	int arr[]= new int[n];
		for(int i=0;i<n;i++){
		System.out.print("Enter "+i+" element: ");
		arr[i] = sc.nextInt();
		}
		int last = n-1;

		System.out.print("Enter the element you want to search: ");
		int search = sc.nextInt();	
		binsearch(arr,0,last,search);

		}
}