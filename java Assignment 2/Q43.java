import java.util.Scanner;
class F_3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height : ");
        double h = sc.nextDouble();

        System.out.print("Enter the slant height : ");
        double s = sc.nextDouble();

        System.out.print("Enter the polishing rate : ");
        double rate = sc.nextDouble();
        double r = Math.sqrt(s * s - h * h);
        double area = 3.14 * r * r;
        double cost = area * rate;
        System.out.printf("The radius of the base is: %.2f "+ r);
        System.out.printf("The base area is: %.2f ", area);
        System.out.printf("The cost of polishing the base is: ₹%.2f"+ cost);
    }
}