public class pattern23
{
	public static void main(String args[]){
		
		int n=4;
		char ch='A';
		for(int i=1; i<=n;i++){
			for(int j=1;j<=n*2-1;j++){
				if(i+j>=n+1 && j-i<=n-1){
					System.out.print(ch+" ");
					ch++;
					
				}else System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*
      A
    B C D
  E F G H I
J K L M N O P

*/