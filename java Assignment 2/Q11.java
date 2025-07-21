import java.util.Scanner ;
class Eleventh{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter base");
        double b=sc.nextDouble();
        System.out.println("enter height");
        double h=sc.nextDouble();
        System.out.println("enter area:");
        double  area =sc.nextDouble();
        double x ;
        double  xS =(area * 2)/40;
        x=Math.sqrt(xS);
        b =b*x;
        h=h*x;
        System.out.println("base ="+b);
        System.out.println("height ="+h);
            }
}