public class pattern5
{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i<=j){
					System.out.print("* ");
				}else System.out.print("  ");
			}System.out.println();
		}
	}
}
//psvm after throw exception
//thread.sleep(300) after if condition
//what is we use just i>j in triangle printing ...
//or second for loop starts with j=2;