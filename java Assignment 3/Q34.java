import java.util.Scanner;

class Th_4{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd side: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd side: ");
        int c = sc.nextInt();
        if((a==b)&&(a==c)&&(b==c)) {
            System.out.println("Equilateral Triangle");

        }else
        {
            if((a!=b)&&(b!=c)&&(a!=c)){
                System.out.println("Scalane Triangle");
            }
            else{
                System.out.println("Isoscales Triangle");
            }
        } 
    }
}