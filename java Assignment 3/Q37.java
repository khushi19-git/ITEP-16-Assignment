import java.util.Scanner;
class Th_7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no =");
        int n=sc.nextInt();
        
        if((n%5==0)&&(n%11==0)){
            System.out.println("number is divide by both noumbers  ");

        }else if((n%5==0)||(n%11==0)){
            System.out.println("number divide by only one ");

        }else {
            System.out.println("number is not divide by both the  numbrs ");
        }
    }
}

