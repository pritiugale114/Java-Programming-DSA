public class pattern15
{
	public static void main(String args[])
	{ int n=7;/
	  for(int i=1;i<=n;ui++){
		for(int j=1;j<=n;j++){
			if(i+j==n-2 || j-i==n-4 || i-j==n-4 || i+j==n+4){
				System.out.print("* ");
			}else System.out.print("  ");
		}
		System.out.println();
	  }
	}
}
/* 
      *
    *   *
  *       *
*           *
  *       *
    *   *
      *
/*/