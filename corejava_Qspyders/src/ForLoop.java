import java.util.*;
public class ForLoop {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value for n");
		int n=s.nextInt();
		System.out.println("the values from 1 to "+n+" are:");
		for(int i=1;i<=n;i++){
			System.out.println(i);
		}
	}

}
