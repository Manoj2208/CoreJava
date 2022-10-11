import java.util.Scanner;
public class Swap2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two numbers to swap");
		int a=s.nextInt();
		int b=s.nextInt();
		/*a^=b;
		b^=a;
		a^=b;*/
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swapped two numbers are:"+"a="+a+" b="+b);
	}

}
