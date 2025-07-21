import java.util.Scanner;
class Twenty{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter breath");
        int breadth = sc.nextInt();
        System.out.println("Enter Height");
        int height = sc.nextInt();
        int volume=length*breadth*height;
        System.out.println("Volume of brick"+volume);
    }
}