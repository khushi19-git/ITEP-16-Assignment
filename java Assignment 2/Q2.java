import java.util.Scanner;
class Second{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter area");
        int a=sc.nextInt();
        System.out.println("Enter breadth");
        int b=sc.nextInt();
        int l;
        l=a/b;
        int p=2*(l+b);
        System.out.println("length:"+l);
        System.out.println("perimeter:"+p);
    
        }
}