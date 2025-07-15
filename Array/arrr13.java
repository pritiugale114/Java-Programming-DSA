
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