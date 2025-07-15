//WAJPT identify the sum of each element factorial present in an array
import java.util.*;
class factorialOfArray
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array:");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
	      int fact=1;
			for(int j=1;j<=arr[i];j++){
				fact=fact*j;
			}
		 sum=sum+fact;
		}
		System.out.println("Sum is :"+sum);
	}}

	//issuueee