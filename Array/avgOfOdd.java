//WAJP to identify the average of odd elements in an array
import java.util.*;
class  avgOfOdd
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
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				sum+=arr[i];
				count++;
			}
		}
		int avg = sum/count;
		System.out.println("average of oddd elements is :"+avg);
	}}