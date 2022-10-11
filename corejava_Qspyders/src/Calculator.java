import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("enter two numbers");
			int a=s.nextInt();
			int b=s.nextInt();
		boolean x=true;
		do{
			System.out.println("the choices are\n1.addition\n2.subtraction\n3.multiplication\n4.divison\n5.exit");
			System.out.println("enter your choice");
		    int ch=s.nextInt();
		   
		switch(ch){
		case 1:System.out.println("addition of two numbers is:"+(a+b));
				break;
		case 2:System.out.println("subtraction of two number is:"+(a-b));
				break;
		case 3:System.out.println("multiplication of two numbers is:"+(a*b));
		        break;
		case 4:System.out.println("divison of two numbers is :"+(a/b));
		        break;
		case 5:x=false;
				break;
		default:System.out.println("invalid choice");
		}}while(x);
	}
	

}
