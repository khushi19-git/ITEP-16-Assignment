import java.util.Scanner;
class Fourteen{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
       // System.out.println("Enter number");
      //  int n= sc.nextInt();
        System.out.println("Enter percentage");
        int n = sc.nextInt();
        if(n > 90){
          System.out.println("grade 'A' ");
        }else if(n>80&&n<=90){
            System.out.println("grade 'B'");
        }else if(n>60&&n<=80){
            System.out.println("grade 'C'");
        }else{
            System.out.println("YOU get 'D'");
        }
    }
}