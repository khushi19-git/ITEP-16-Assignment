import java.util.Scanner;
class NInteen{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);

    }
}