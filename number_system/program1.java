import java.util.*;
class program1
{
	public static void main(String args[]){
	Scanner sc =  new Scanner(System.in);
	System.out.print("enter number:");
    int num = sc.nextInt();
	int temp = num;
	int sum =0;
	int rem = 0;
	while(num!=0){
	 rem = num %10;
	 int fact=1;
	 for (int i = 1; i <=rem ;i++ )
	 {
		 fact = fact*i;
	 }
	 num= num /10;
	 sum = sum +fact;
	}
  if (temp==sum)
  {
	  System.out.println(temp +"number is strong number. ");
  }else{
	 System.out. println(temp +" num is not strong number");
  }
   
	}
}