import java.util.Scanner;

class Sixteen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("The area of circle is "+ area);
    }
}