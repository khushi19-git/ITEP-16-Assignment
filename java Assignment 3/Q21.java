import java.util.Scanner;
class Tw_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number  =");
        int n1=sc.nextInt();
        System.out.print("enter 2nd Number =");
        int n2=sc.nextInt();
        if(n1>n2){
            System.out.println("numver 1 is greater than number2");

        }else if(n2>n1){
            System.out.println("numver 2 is greater than number1");
            
        }else
        System.out.println("both numberr is equal");
    }
}