import java.util.Scanner;
class Sixth{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter s1");
        int a=sc.nextInt();
        System.out.println("enter s2");
        int b=sc.nextInt();
        System.out.println("enter perimeter");
        int p=sc.nextInt();
        /*heron's formula
        
            semi perimeter=(a+b+c)/2;
            area =squarroot s(s-a)(s-b)(s-c);
        */
       float  c = (a+b)-p;
       float s = (a+b+c)/2;
       float area =(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("area of triangle"+area);


    }
}