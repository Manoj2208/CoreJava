
public class School {
	private String sname;
	private String pname;
	private int noofstud;
	private String address;
	
	public School(){
		
	}
	public School(String sname,String pname,int noofstud,String address){
		this.sname=sname;
		this.pname=pname;
		this.noofstud=noofstud;
		this.address=address;
	}
	
	public String getsname(){
		return sname;
	}
	public String getpname(){
		return pname;
	}
	public void setpname(String p){
		this.pname=p;
	}
	public int getstudents(){
		return noofstud;
	}
	public void setstudents(int n){
		this.noofstud=n;
	}
	public String getaddress(){
		return address;
	}
	public void display(){
		System.out.println("school name="+getsname());
		System.out.println("principal name="+getpname());
		System.out.println("no of students="+getstudents());
		System.out.println("address="+getaddress());
}
}
