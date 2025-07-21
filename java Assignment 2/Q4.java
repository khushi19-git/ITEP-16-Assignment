import java.util.Scanner;
class Fourth{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter breath");
        int b=sc.nextInt();
        int area = l*b;
        System.out.println("area of tiles:"+area);
        System.out.println("rate:");
        float r=sc.nextFloat();
        float cost=area*r;
        System.out.println("cost of tiling:"+cost);
    }
}