import java.util.Scanner;
class twelve{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter hyotheneous");
        double hypo = sc.nextDouble();
        System.out.println("enter side1");
        double side1 =sc.nextDouble();
        double side2 = Math.sqrt(hypo*hypo- side1 *side1);
        double area =0.5*side1*side2;
        System.out.println("Length ="+side2);
        System.out.println("Area of the triangle="+area);
    }
}