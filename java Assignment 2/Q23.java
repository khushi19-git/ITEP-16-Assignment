import java.util.Scanner; 
class Tw_3{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length");
        int l=sc.nextInt();
        System.out.println("Enter breath");
        int b= sc.nextInt();
        System.out.println("Enter height");
        int h= sc.nextInt();
        System.out.println("Enter side");
        int Side= sc.nextInt();
        int length =l/Side;
        int breadth =b/Side;
        int height =h/Side;
        int totalBox=length*breadth*height;
        System.out.println("toatal"+ totalBox);
    }
}