import java.util.Scanner;

class Seventeen{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter length");
        int length=sc.nextInt();
       System.out.println("Enter breath"); 
        int breadth=sc.nextInt();
        int perimeter =2*(length+breadth);
        System.out.println("Luci ribbon" +perimeter);
    }
}