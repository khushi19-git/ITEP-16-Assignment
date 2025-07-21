import java.util.Scanner;
class nine{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side :");
    double s = sc.nextDouble();
    double area = (Math.sqrt(3)/4)*s*s;
    System.out.println("area="+area);
}}