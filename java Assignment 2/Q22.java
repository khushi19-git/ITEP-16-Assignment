import java.util.Scanner;
class Tw_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l = sc.nextInt();
        System.out.println("Enter breath");
        int b= sc.nextInt();
        System.out.println("Enter deep");
        int dep= sc.nextInt();
        int volume= l* b*dep;
        System.out.println("Capacity of the pond"+volume);
    }
}