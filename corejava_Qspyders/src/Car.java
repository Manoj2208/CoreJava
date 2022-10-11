
public class Car {
	String color;
	String name;
	double price;
	Engine e;
	
	Car(String c,String n,double p,Engine e){
		this.color=c;
		this.name=n;
		this.price=p;
		this.e=e;
	}
	
	public String toString(){
		return "car color="+color+"\n car brand="+name+"\n car price="+price;
	}

}
