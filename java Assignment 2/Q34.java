import java.util.Scanner;

class Th_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base 1 of the trapezoid: ");
        double base1 = sc.nextDouble();
        System.out.print("Enter base 2 of the trapezoid: ");
        double base2 = sc.nextDouble();
        System.out.print("Enter original height: ");
        double height = sc.nextDouble();
        System.out.print("Enter width of the walkways: ");
        double walkway = sc.nextDouble();
        double newHeight = height + walkway;
        double area = 0.5 * (base1 + base2) * newHeight;
        System.out.println("Total area of the wooded area after adding the walkway: " + area );
    }
}