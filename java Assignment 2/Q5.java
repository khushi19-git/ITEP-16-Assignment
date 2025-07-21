import java.util.Scanner;
class Fifth{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter cost");
        int c=sc.nextInt();
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("rate");
        int r=sc.nextInt();
        int b;
        int p;
        int area;
        p=c/r;
        b=(p/2)-1;
        area=l*b;
        System.out.println("breath:"+b);
        System.out.println("perimeter:"+p);
        System.out.println("area:"+area);

    }
}