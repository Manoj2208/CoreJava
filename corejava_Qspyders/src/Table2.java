import java.util.Scanner;

public class Table2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to print that multiplication table");
		int n=s.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}

}
