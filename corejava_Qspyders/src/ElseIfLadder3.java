import java.util.Scanner;
public class ElseIfLadder3 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>='a'&&ch<='z'){
			System.out.println(ch+" is alphabet");
		}
		else if(ch>='A'&&ch<='Z'){
			System.out.println(ch+"is uppercase alphabet");
		}
		else if(ch>='0'&&ch<='9'){
			System.out.println(ch+"is digit");
		}
		else{
			System.out.println(ch+"is special character");
		}
		
	}

}
