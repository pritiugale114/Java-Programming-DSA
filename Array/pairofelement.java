//WAJPT identify pair of elements is equals to the given number
import java.util.*;
class pairofelement
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	System.out.println("enter the elements of array:");
	int[] arr= new int[n];
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the element to compare:");
	int element=sc.nextInt();
	int sum=0;
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(element == (arr[i]+arr[j])){
				System.out.println("pair of element is "+arr[i]+" and "+arr[j]);

			}
		}
	}
	}}
	