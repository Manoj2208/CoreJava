import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0){
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(rev==temp){
			System.out.println("palindrome");
		}
		else System.out.println("not a palindrome");
	}
}
