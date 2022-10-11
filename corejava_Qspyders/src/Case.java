import java.util.*;
public class Case {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your choice");
		int ch=s.nextInt();
		switch(ch){
		case 1:System.out.println("case 2 also executes");
				break;
		case 2:System.out.println("good morning");
				break;
		case 3:System.out.println("good evening");
		        break;
		case 4:System.out.println("switch case of 4");
		        break;
		default:System.out.println("thank you!");
		}
	}
	

}
