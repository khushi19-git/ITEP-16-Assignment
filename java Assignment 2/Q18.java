import java.util.Scanner;
class Eighteen{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Length");
        int l= sc.nextInt();
        System.out.println("Enter Breath");
        int b= sc.nextInt();
        System.out.println("Enter Round"); 
        int rounds = sc.nextInt();
        int p=2*(l+b);
        int total =p*rounds;
        double dis= total/1000.0;
        System.out.println("Ron jog" +dis);
    }
}