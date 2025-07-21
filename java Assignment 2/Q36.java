import java.util.Scanner;
class Th_6{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diameter : ");
        double d = sc.nextDouble();

        System.out.print("Enter  height : ");
        double h = sc.nextDouble();
        double r = d / 2;
        double surfaceArea = 2 * 3.14* r * (h + r);
        System.out.printf("The surface area of the cylinder is: %.2f \n", surfaceArea);
    }
}