//WAJPT reverse of an array

import java.util.*;
class arrr12
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
	int n=sc.nextInt();
	System.out.println("enter the elements of array:");
	int[] arr= new int[n];
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
	int start=0;
	int end=arr.length-1;
	while(start<end){
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	System.out.println("reverse array is :");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	}
}