import java.util.*;
class sumoffactor
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		int fact=1;
			for(int i=1;i<=num;i++){
				if(num%i==0){
					System.out.println(i+"is factor of"+num);
				}
			    
			}
		}

	}
