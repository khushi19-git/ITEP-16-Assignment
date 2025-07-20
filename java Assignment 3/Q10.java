import java.util.Scanner;
class Ten{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Year");
        int y= sc.nextInt();
        if((y%4==0)&&(y%100!=0)|| (y%400==0)){
            System.out.println("year is leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}