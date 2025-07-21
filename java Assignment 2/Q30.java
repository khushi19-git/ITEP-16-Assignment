import java.util.Scanner;

class Thirty{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter floor length : ");
        int l1 = sc.nextInt();
        System.out.print("Enter floor width : ");
        int w1 = sc.nextInt();
        System.out.print("Enter tile length : ");
        int l2 = sc.nextInt();
         System.out.print("Enter tile width : ");
        int w2 = sc.nextInt();
        int area1 = l1 * w1;
        int area2 = l2 * w2;
        int totalTiles = area1 / area2;

        System.out.println("Number of tiles required: " + totalTiles);
    }
}