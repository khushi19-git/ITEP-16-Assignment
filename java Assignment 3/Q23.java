import java.util.Scanner;

class T_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number: ");
        int n= sc.nextInt();
if ((n/2) * 2 == n) {
    System.out.println(n+ " is Even.");
} else {
    System.out.println(n+ " is Odd.");
}
    }
}
