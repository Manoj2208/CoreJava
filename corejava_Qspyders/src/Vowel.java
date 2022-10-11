import java.util.*;
public class Vowel {
	public static void main(String[] args) {
		System.out.println("ENTER A CHARCATER TO CHECK WHETHER VOWEL OR CONONANT");
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println(ch+" "+"is vowel");
			
		}
		else System.out.println(ch+" "+" is consonant");
		
	}

}
