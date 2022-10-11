import java.util.*;
class SumOfN{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=0;i<=n;i++){
			sum=sum+i;
			}
		System.out.println("the sum of 1 to "+n+" is: "+sum);
	}
}