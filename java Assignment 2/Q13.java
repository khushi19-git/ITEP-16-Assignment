import java.util.Scanner;
class Thirteen{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter area");
        double area =sc.nextDouble();
        System.out.println("enter side 1"); 
        double s1 =sc.nextDouble(); 
        double s2 =(2*area) /s1;
        System.out.println("Length:"+s2);
    }
}