import java.util.Scanner;
class Ni_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
         System.out.print("enter 1 number =");
        int n1 =sc.nextInt();
        System.out.print("enter 2 number =");
        int n2 =sc.nextInt();
        if(n1==n2){
            System.out.println("enter different number ");

        }else {
            n1=n1+n2;
            n2=n1-n2;
            n1=n1-n2;
            System.out.println("number 1="+n1+"number 2 ="+n2);

        }
    }
}