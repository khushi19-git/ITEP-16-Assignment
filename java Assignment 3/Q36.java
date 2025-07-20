import java.util.Scanner;

class Th_6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter 1st angle: ");
        int a1 = sc.nextInt();
      
        System.out.print("Enter 2nd angle: ");
        int a2 = sc.nextInt();
       
        System.out.print("Enter 3rd angle: ");
        int a3 = sc.nextInt();
      
        int tri = a1+a2+a3;
        if(tri==180){ 

            System.out.println("its triangle ");
       
        } else {

            System.out.println("its not triangle ");
        }

    }
}