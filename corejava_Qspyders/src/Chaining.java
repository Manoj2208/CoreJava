
public class Chaining {
	int id;
	String name;
	String branch;
	public Chaining(){
		
	}
	
	public Chaining(int id){
		this.id=id;
	}
	public Chaining(int id,String name){
		this(id);
		this.name=name;
	}
	public Chaining(int id,String name,String branch){
		this(id,name);
		this.branch=branch;
	}
	public void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(branch);
	}

}
