
//WAJPT for array palindrom
import java.util.*;
class palindrome
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

	//logic to reverse array & store in another array object
	int[] arr1=new int[arr.length];
	int j=0;
	for(int i=arr.length-1;i>=0;i--){
		arr1[j]=arr[i];
		j++;
	}

	System.out.println("the result:");
	for(int i=0;i<arr1.length;i++){
		System.out.println(arr1[i]);
	}
	}}