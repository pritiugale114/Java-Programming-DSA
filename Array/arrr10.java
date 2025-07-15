//WAJPT identify the number of positive and negative elements from and array.
import java.util.*;
class arrr10
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
		int p=0;
		int nv=0;
		for(int i=0;i<n;i++){
			if(arr[i]>0){
				p++;
			}else if(arr[i]<0){
				nv++;
			}else{}
		}
		System.out.println("positive elements are:"+p);
			System.out.println("negative numbers are:"+nv);
	}}