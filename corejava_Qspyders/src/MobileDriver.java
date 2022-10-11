import java.util.*;
public class MobileDriver {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the ram");
		String ram=s.next();
		System.out.println("enter the rom");
		String rom=s.next();
		Mobile m=new Mobile(ram,rom);
		boolean x=true;

		while(x){
		System.out.println("enter your choice");
		
		
		System.out.println("1.connect watch\n2.disconnect watch\n3.show details\n4.exit");
		int ch=s.nextInt();
		
			
		
		switch(ch){
		case 1:
				System.out.println("enter the watch brand");
				String b=s.next();
				System.out.println("enter the watch color");
				String c=s.next();
				System.out.println("enter the watch price");
				double d=s.nextDouble();
				m.connectwatch(new SmartWatch(b,c,d));
				break;
		
		case 2:
				m.disconnectwatch();
				System.out.println("disconnected");
				break;
		case 3:m.details();
				break;
		case 4:x=false;
				break;
				
		
	}
		}
}
}
