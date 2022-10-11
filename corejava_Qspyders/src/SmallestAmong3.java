import java.util.Scanner;
public class SmallestAmong3 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=s.nextInt();
		System.out.println("enter 2nd number");
		int b=s.nextInt();
		System.out.println("enter 3rd number");
		int c=s.nextInt();
		int result;
		if(a<b&&a<c){
			result=a;
		}
		else if(b<a&&b<c){
			result=b;
		}else result=c;
		System.out.println(result+" "+"is smaller");

}
}