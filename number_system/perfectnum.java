import java.util.*;
class perfectnum
{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;

		for(int i=1;i<num;i++){
			if(num%i==0){
				sum= sum+i;
			}
		}
		System.out.println("sum of factor is :"+sum);
	}
}