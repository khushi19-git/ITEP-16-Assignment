import java.util.Scanner;
class Th_2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  length of garden: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter length of the swimming pool: ");
        double s2 = sc.nextDouble();
        double area1 = s1 * s1;
        double area2 = s2 * s2;
        double remainingArea = area1 - area2;
        System.out.println("Area of the garden excluding the pool: " + remainingArea + " square meters");
    }
}