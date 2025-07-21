import java.util.Scanner;
class Forty{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  radius : ");
        double r = sc.nextDouble();

        System.out.print("Enter the height : ");
        double h = sc.nextDouble();
        double volume = 3.14 * r * r * h;
        System.out.printf("The volume of the cylinder is: ", volume);
    }
}