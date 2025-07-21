import java.util.Scanner;
class F_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term: ");
        int a = sc.nextInt();

        System.out.println("Enter the common difference: ");
        int d = sc.nextInt();

        System.out.println("Enter the term number: ");
        int n = sc.nextInt();
        int nthTerm = a + (n - 1) * d;
        System.out.println("The " + n + "th term of the A.P. is: " + nthTerm);
    }
}