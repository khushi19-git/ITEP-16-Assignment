import java.util.Scanner;
class T_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st Number  ");
        int n1=sc.nextInt();
        System.out.print("enter 2nd Number ");
        int n2=sc.nextInt();
        System.out.print("enter 3rdd Number ");
        int n3=sc.nextInt();
        if(n1>n2 &&n1>n3){
            System.out.println("number 1 is greater");

        }else if(n2>n1 && n2>n3){
            System.out.println("numver 2 is greater");
            
        }else if(n3>n1 && n3>n2){
             System.out.println("numver 3 is greater ");
        }else 
        System.out.println("All three numberr is equal");
    }
}