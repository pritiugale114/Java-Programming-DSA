public class pattern26
{
	public static void main(String args[]){
		int n=4;
		for(int i=1;i<=n;i++){
			char ch='A';
		int count=1;
			for(int j=1;j<=n/2 ;j++){
				System.out.print(ch++ +" "+ count++ +" ");
			}
          System.out.println();
		}
	}
}

/*
A 1 B 2
A 1 B 2
A 1 B 2
A 1 B 2
*/