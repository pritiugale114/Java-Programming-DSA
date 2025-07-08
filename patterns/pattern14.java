public class pattern14
{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i>=j){
					float temp=i+j;
					if(temp %2==0){
					System.out.print("1 ");
				}else System.out.print("0 ");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
/* 
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/