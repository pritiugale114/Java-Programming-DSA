//WAJPT reverse the each element of an array
import java.util.*;
import java.util.Arrays;
class reverseeachelement
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
	int[] arr2=new int[n];
	for(int i=0;i<arr2.length;i++){
		arr2[i]=arr[i];
	}


     for(int i=0;i<arr.length;i++){
	int num=arr[i];
	int rev=0;
	
		 	while(num !=0){
			int rem=num %10;
			rev = rev*10+rem;
			num = num/10;
		}
		arr2[i]=rev;
		}
		/*for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}*/
		System.out.println(Arrays.toString(arr2)); // to print array using inbuilt function 
	}
	}