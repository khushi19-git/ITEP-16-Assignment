import java.util.Scanner;
class Eight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter area");
        double a = sc.nextDouble();
        System.out.println("enter height");
        double h = sc.nextDouble();
        double t_area = a * 10000;
        double b;
        b= (t_area*2)/h;
        System.out.println("base="+b);
    }
}