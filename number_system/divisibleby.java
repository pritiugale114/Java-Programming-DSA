import java.util.*;
class divisibleby
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		if(num%3==0 && num% 5==0){
			System.out.println("RAJA weds PRITIII");
		}
		else if(num % 3==0){
			System.out.println("RAJA");
		 }else{
			System.out.println("PRITIII");
		   }	
		}
	}
