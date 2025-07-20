import java.util.Scanner;

 class Th_2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number: ");
        double number = sc.nextDouble();
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero");
    }
}
}