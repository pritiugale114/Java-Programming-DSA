import java.util.*;
class p1
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char word= sc.next().charAt(0);
		if(word>='A' && word<='Z' || word>='a' && word<='z'){
			system.out.println("word is alphabet");
		}else if(word>='0' && word<='9'){
			System.out.println("word is digit");
		}else{
			System.out.println("word is symbol");
		}
	}
}