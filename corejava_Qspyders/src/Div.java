import java.util.Scanner;
class Div{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        if(a%3==0&&a%5==0){
            System.out.println("divisible ");
        }
        else System.out.println("not divisible");

    }
}