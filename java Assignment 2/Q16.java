import java.util.Scanner;

class Sixteen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int length=sc.nextInt();
        System.out.println("Enter breath");
        int breadth=sc.nextInt();
        
        int area=length*breadth;
        System.out.println("area"+area);
   }
}