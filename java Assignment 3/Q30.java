import java.util.Scanner;
class Thirty{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter year =");
        int year=sc.nextInt();
        if(year%4==0&&year%100!=100){
            System.out.println("its leap year");

        }else if(year%400==0){
           System.out.println("its leap century"); 
        }
    }
}