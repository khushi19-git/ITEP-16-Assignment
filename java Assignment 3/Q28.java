import java.util.Scanner;
class T_8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number  =");
         int num1=sc.nextInt();
         System.out.print("enter a number  =");
         int num2=sc.nextInt();
        System.out.print("enter a number (1-addition)(2-subtraction)(3-multipication)(4-divide) =");
         int num=sc.nextInt();

        switch(num){
              case 1:
        System.out.println("addition="+(num1+num2));
        break;
    case 2:
        System.out.println("subtraction="+(num1-num2));
        break;
    case 3:
       System.out.println("multiplication="+(num1*num2));
        break;
    case 4:
       System.out.println("divide="+(num1/num2));
        break;
   
    default:
        System.out.println("invalid nnuber");
}
    }
}
    