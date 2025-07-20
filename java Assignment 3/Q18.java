import java.util.Scanner;
class Eighteen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.print("enter the toal number student get =");
        int t_no=sc.nextInt();
        double p=(t_no/500.0)*100;
        System.out.println("percentage of student ="+p);
    }
}