//printing elements of array.
public class arr1
{
	public static void main(String args[]){
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println("the length of array is :"+arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

/*
the length of array is :5
10
20
30
40
50
*/