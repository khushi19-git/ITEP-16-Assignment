import java.util.Scanner;

class T_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  b/w 1 to 5 ");
        int n = sc.nextInt();
        if(n <6 && n>0){
            if(n==1)
            System.out.println("one");
            else if(n==2)
                System.out.println("two");
            else if(n==3)
                System.out.println("three");
            else if(n==4)
                System.out.println("four");
            else
                System.out.println("five");

        }else 
        System.out.println("please Enter b/w 1 to 5 ");
        
    }
    
}
