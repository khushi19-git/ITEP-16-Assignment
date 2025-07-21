import java.util.Scanner;
class Th_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter surface area of the cylinder  ");
        double surfaceArea = sc.nextDouble();

        System.out.print("Enter height of the cylinder ");
        double height = sc.nextDouble();
        double pi = 3.14;
        double a = 1;
        double b = height;
        double c = -surfaceArea / (2 * pi);
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real solution. Please check the inputs.");
        } else {
            double r = (-b + Math.sqrt(discriminant)) / (2 * a);

            double diameter = 2 * r;

            System.out.printf("The diameter of the cylinder is: %.2f cm\n", diameter);
        }
    }
}