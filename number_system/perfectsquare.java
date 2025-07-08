import java.util.*;
class perfectsquare{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		//int sqrt=0;
	//	int res=0;
		int count=0;
		for(int i =1; i*i<=num; i++)
		{
			count=1;
			temp =i ;
			if(i*i==num){
				count=1;
				System.out.println(num+"perfect square of "+ i);
				break;
			} 
			
		}
		if(count==0){
			System.out.println(num="is not perfect square");

	}


}}

/*
for(int i =1;i*i<num;i++){
if(i*i==num){
	sqrt=i;
	res=i*i;
	break;
}}
if(num==res){
			System.out.println(num="is not perfect square");
}else{
	System.out.println(num+ "is not perfect square");
}
*/