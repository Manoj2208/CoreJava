import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int flag=0;
		System.out.println("enter no of elements in array");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++ ){
			arr[i]=s.nextInt();
		}
		System.out.println("enter element to search");
		int key=s.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				System.out.println("element found at :"+i);
				flag=1;
				break;
			}
			 
			
		}
		if(flag==0){ System.out.println("key not found");}
		
	}

}
