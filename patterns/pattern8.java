public class pattern8
{
	public static void main(String args[]){
	/*
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n*2-1;j++){
				if(i+j>=n+1 && j-i<n){
					System.out.print("* ");
				}else System.out.print("  ");
			}
			System.out.println();
		}
	

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/	

	
			
		
		
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n+i;j++){
				if(i+j>n+1){
					System.out.print("* ");
				}else System.out.print("  ");
			}
			System.out.println();
		}
		
	
	}
}

