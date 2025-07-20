import java.util.Scanner;
class Twelve{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter four digit");
        int n= sc.nextInt();
        int rev=0;
        if(n>=1000&&n<=9999){
            while (n>0){
                int d=n%10;
                rev=rev*10+d;
                n=n/10;
            }System.out.println("reverse"+rev);
        }else{
            System.out.println("enter 4 digit");
        }
    }
      
}