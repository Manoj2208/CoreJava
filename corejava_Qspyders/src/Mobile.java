
public class Mobile {
	String ram;
	String rom;
	SmartWatch s;
	
	Mobile(){
		
	}
	Mobile(String ram,String rom){
		this.ram=ram;
		this.rom=rom;
		this.s=s;
	}
	
	public void connectwatch(SmartWatch s){
		if(this.s==null){
			this.s=s;
			System.out.println("Connecting smartwatch to your device");
			
		}
		else{
			System.out.println("already connected yaar!!");
		}
	}
	public void disconnectwatch(){
		if(this.s==null){
			System.out.println("no watch is connected");
		}
		else{
			this.s=null;
			System.out.println("smartwatch gets disconnected");
		}
	}
	public void details(){
		if(this.s==null){
			System.out.println("no watch is connected to display yaar");
		}
		else{
		System.out.println("mobile ram:"+ram);
		System.out.println("mobile rom:"+rom);
		System.out.println("watch brand"+s.brand);
		System.out.println("watch color:"+s.color);
		System.out.println("watch price:"+s.price);
		
	}}

}
