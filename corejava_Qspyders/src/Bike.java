
public class Bike extends Vehicle {
	public int  getwheels(){
		return 2;
		
	}
	public static void main(String[] args) {
		Vehicle v =new Bike();
		System.out.println(v.getwheels());
	}

}
