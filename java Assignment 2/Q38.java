import java.util.Scanner;
class Th_8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the volume : ");
        double volume = sc.nextDouble();
        System.out.println("Enter the radius  : ");
        double r = sc.nextDouble();

        double pi = 3.14;
        double h = volume / (pi * r * r);
        double surfaceArea = 2 * pi * r * (h + r);
        System.out.printf("The surface area of the cylinder is:", surfaceArea);

    }
}