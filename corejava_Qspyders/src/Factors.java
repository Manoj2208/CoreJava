import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		System.out.println("the factor of a "+n+" is:");
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
	}

}
