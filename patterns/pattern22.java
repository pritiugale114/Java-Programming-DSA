public class pattern22
{
	public static void main(String args[]){
		
		int n=4;
		int count=1;
		for(int i=1; i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i+j>=n+1){
					System.out.print(count+" ");
					count++;
					
				}else System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*
      1
    2 3
  4 5 6
7 8 9 10

*/