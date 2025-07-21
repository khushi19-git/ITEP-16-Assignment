import java.util.Scanner;
class Seven{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter base:");
    int b=sc.nextInt();
    System.out.println("enter area:");
    int a=sc.nextInt();
    int h= (a*2)/b;
    System.out.println("height"+h);
    
    }
}