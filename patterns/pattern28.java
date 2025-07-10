public class pattern28
{
	public static void main(String args[]){
		int n=4;
		char ch='A';
		int count=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n ;j++){
			   if(i % 2==0){
				System.out.print(count++ +" ");
			   }else System.out.print(ch++ +" ");
			}
          System.out.println();
		}
	}
}

/*
A B C D
1 2 3 4
E F G H
5 6 7 8
*/