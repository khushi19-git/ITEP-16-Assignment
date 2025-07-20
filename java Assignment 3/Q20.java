import java.util.Scanner;

class Twenty{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        
    }
}