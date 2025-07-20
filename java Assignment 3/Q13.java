import java.util.Scanner;
class Thirteen{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int day = sc.nextInt();
        if(day>=1&&day<=7){
            if(day==1)
              System.out.println("MOnday");
            else if(day==2)
              System.out.println("Tuesday");
            else if(day==3)
              System.out.println("Wednesday");
            else if(day==4)
              System.out.println("THursday");
            else if(day==5)
              System.out.println("Friday");
            else if(day==6)
              System.out.println("Saturday");
            else if(day==7)
              System.out.println("SUNDAY");
        }else{
            System.out.println("enter between 1 to 7");
        }
    }
}