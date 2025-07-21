import java.util.Scanner;
class First{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Perimeter");
        int p=sc.nextInt();
        System.out.println("Enter length");
        int l=sc.nextInt();
        int b;
        b=((p)/2-l);
        int area=l*b;
        System.out.println("area of rectangle:"+area);
            }
}