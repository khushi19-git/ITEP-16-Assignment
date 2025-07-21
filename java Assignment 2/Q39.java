import java.util.Scanner;
class Th_9{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diameter : ");
        double diameter = sc.nextDouble();

        System.out.print("Enter the height : ");
        double height = sc.nextDouble();
        double radius = diameter / 2;
        double surfaceArea = 2 * 3.14 * radius * (height + radius);
        System.out.printf("The surface area of the cylinder is: ", surfaceArea);
    }
}