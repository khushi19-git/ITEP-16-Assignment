import java.util.Scanner;
class Th_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int quo = n/2;
        int mul = quo*2;

        if (n==mul) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }

    }
}