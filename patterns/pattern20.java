public class pattern20
{
	public static void main(String args[]){
		
		int n=3;
		char ch='A';
		for(int i=1; i<=n;i++){
			for(int j=1;j<=n+1;j++){
				System.out.print(ch +" ");
				ch++;
				
			}
		    ch='A';
			System.out.println();
		}
	}
}

/*
A B C D
A B C D
A B C D
*/