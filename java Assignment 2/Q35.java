import java.util.Scanner;

class Th_5.java{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double r = sc.nextDouble();

        System.out.println("Enter the height : ");
        double h= sc.nextDouble();
        double pi = 3.1416;
        double surfaceArea = 2 * pi * r * (r + h);
        System.out.printf("The total surface area of the cylinder :"+  surfaceArea);
    }
}