import java.util.Scanner;
class Fourteen{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Diagonal=");
        int diagonal = sc.nextInt();
        System.out.println("Enter side1");
        int  h1 =sc.nextInt(); 
        System.out.println("Enter side2");
        int h2 =sc.nextInt();
        int area =diagonal*(h1 + h2)/2;
        System.out.println("Area"+area);
    }
}