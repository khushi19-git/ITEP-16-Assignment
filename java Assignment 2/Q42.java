import java.util.Scanner;
class F_2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter : ");
        double d = sc.nextDouble();

        System.out.print("Enter the height : ");
        double h = sc.nextDouble();
        double r = d /2;
        double volume = 3.14 * r * r * h;
        System.out.printf("The volume of the cylinder is: %.2f ", volume);
    }
}