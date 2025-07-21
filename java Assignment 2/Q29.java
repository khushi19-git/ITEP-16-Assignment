import java.util.Scanner;

class Tw_9{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter floor length : ");
        int l = sc.nextInt();

        System.out.print("Enter floor width : ");
        int w = sc.nextInt();
        System.out.print("Enter tile side : ");
        int s = sc.nextInt();
        int area1 = l* w;
        int area2 = s * s;
        int num = area1 / area2;

        System.out.println("Number of tiles : " + num);
    }
}