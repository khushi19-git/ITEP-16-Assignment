import java.util.Scanner;

class Th_1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter : ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        double area = side * side;
        System.out.println("Side of the square: " + side + " m");
        System.out.println("Area of the square: " + area + " square meters");

        sc.close();
    }
}