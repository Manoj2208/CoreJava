import java.util.*;
public class Rectangle {
	public static void main(String[] args) {
		System.out.println("enter the length and breadth");
		System.out.println("enter the radius for crcle");
	
		Scanner s=new Scanner(System.in);
		float l=s.nextFloat();
		float b=s.nextFloat();
		float r=s.nextFloat();
		float result=rect(l,b);
		float sum=circle(r);
		System.out.println("area of rectangle="+result);
		System.out.println("area of circle="+sum);
	}
	public static float rect(float a,float b){
		return a*b;
	}
	public static float circle(float r){
		return  (float) (3.142*r*r);
	}
	

}
