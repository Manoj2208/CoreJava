
public class CarDriver {
	public static void main(String[] args) {
		Car c=new Car("white","Audi",600000.34,new Engine(123,7859));
		System.out.println(c);
		System.out.println(c.e.cc);
		System.out.println(c.e.regno);
	}
}
