import java.util.Scanner;

class Th_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the garden: ");
        int l = sc.nextInt();

        System.out.print("Enter width of the garden: ");
        int w = sc.nextInt();
        System.out.print("Enter width of the vertical pathway: ");
        int vPath = sc.nextInt();

        System.out.print("Enter width of the horizontal pathway: ");
        int hlPath = sc.nextInt();
        int totalArea = l * w;
        int vPathArea = vPath * w;
        int hPathArea = hPath * l;
        int overlapArea = vPath * hPath;
        int pathArea = vPathArea + hPathArea - overlapArea;
        int useArea = totalArea - pathArea;
        System.out.println("used area of the garden: " + useArea );
    }
}