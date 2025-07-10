public class pattern15
{
	public static void main(String args[])
	{
	//suitable for all numbers 	
	  int n=3;
	  for(int i=1;i<=n*2-1;i++){
		for(int j=1;j<=n*2-1;j++){
			if(i+j==n+1 || j-i==n-1|| i-j==n-1 || i+j==n*3-1){
				System.out.print("* ");
			}else System.out.print("  ");
		}
		System.out.println();
	  }
	}
}
/* 
only for 7.

 int n=7;
	  for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i+j==n-2 || j-i==n-4 || i-j==n-4 || i+j==n+4){
				System.out.print("* ");
			}else System.out.print("  ");
		}
		System.out.println();
	  }


            *
          *   *
        *       *
      *           *
    *               *
  *                   *
*                       *
  *                   *
    *               *
      *           *
        *       *
          *   *
            *
/*/