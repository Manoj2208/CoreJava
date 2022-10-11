import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to compute factorial");
		int n=s.nextInt();
		int res=fact(n);
		System.out.println("the fact of "+n+" is:"+res);
	}
	public static int fact(int n){
		if(n==0||n==1)
			return 1;
		else return n*fact(n-1);
	}

}
