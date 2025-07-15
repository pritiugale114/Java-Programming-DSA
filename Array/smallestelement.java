//WAJPT identify the smalles element  in an array

import java.util.*;
class smallestelement
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
	int small=arr[0];
	for(int i=1;i<arr.length;i++){
		if(arr[i]<small){
			small=arr[i];
		}
	}
	System.out.println("smallest element from array is "+small);
	}}