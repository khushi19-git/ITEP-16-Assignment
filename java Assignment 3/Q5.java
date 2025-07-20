import java.util.Scanner;
class Five{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter age  1 person  :");
        int a1=sc.nextInt();
        System.out.println("Enter age  2 person  :");
        int a2=sc.nextInt();
        System.out.println("Enter age  3 person  :");
        int a3=sc.nextInt();
        if((a1>a2)&&(a1>a3)&&(a2<a3)){
            System.out.println("1st person is oldest");
            System.out.println("2nd person is youngest");
        }else{
            if((age2>age1)&&(age2>age3)&&(age3<age1)){
                System.out.println("2nd person is oldest");
                System.out.println("3rd person is youngest");
            }else{
                if((age1<age3)&&(age2<age3)&&(age1<age2)){
                    System.out.println("3rd person is oldest");
                    System.out.println("1st person is youngest");
                    
                }else
                      {
                          System.out.println("all are in same age");
                    }
                }
            }
        }
    }