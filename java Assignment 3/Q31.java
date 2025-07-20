import java.util.Scanner;
class Th_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice ('c' for F to C, 'f' for C to F): ");
        char choice = sc.next().toLowerCase().charAt(0);

        switch (choice) {
            case 'c':
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;

            case 'f':
            
                System.out.print("Enter temperature in Celsius: ");
                double cel = sc.nextDouble();
                double fah = (cel * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fah);
                break;

            default:
                System.out.println("Invalid choice! Enter 'c' or 'f'.");
        }

    
    }
}