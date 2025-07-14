//WAJPT identify sum of elements present in an array.
import java.util.*;
class  arr5
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many elements do you want to enter:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		System.out.println("sum of elements is :"+sum);

	}}
