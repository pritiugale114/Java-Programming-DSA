import java.util.*;
class arr6
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

	}
}