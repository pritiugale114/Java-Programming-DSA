//WAJPT identify the prime numbers present in an array
import java.util.*;
class primeNumber
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
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=2;j<arr[i]/2;j++){
				if(arr[i]%j==0){
					count++;
				}
			}
			if(count==0){
				System.out.println("prime numbers are:"+arr[i]);
		}
	}}
}