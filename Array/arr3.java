//WAJPT print given elements from array

import java.util.*;
class  arr3
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
		System.out.println("the result is:");
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
			System.out.println(arr[i]);
			}
		}
	}
}