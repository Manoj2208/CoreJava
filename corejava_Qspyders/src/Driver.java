import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your choices\n1.addition\n2.subtraction\n3.multiplication\n4.divison");
		int ch=s.nextInt();
		System.out.println("enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		switch(ch){
			case 1:Calculator1.add(a,b);
				break;
			case 2:Calculator1.sub(a, b);
				break;
			case 3:Calculator1.mul(a, b);
				break;
			case 4:Calculator1.div(a,b);
				break;
			default:System.out.println("invalid choice");
					
		}
		
	}
}
