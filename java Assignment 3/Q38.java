import java.util.Scanner;
class Th_8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter day no =");
        int day=sc.nextInt();
        

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("thursday");
        break;
    case 5:
        System.out.println("friday");
        break;
    case 6:
        System.out.println("saturday");
    case 7:
        System.out.println("sunday");
    default:
        System.out.println("Other day");
}
    }
}