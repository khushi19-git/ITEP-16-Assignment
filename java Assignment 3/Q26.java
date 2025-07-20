import java.util.Scanner;

class T_6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num");
        int n=sc.nextInt();
        switch(n%2){
            case 0:
                System.out.println("even number");
                break;
            case 1:
                System.out.println("odd number");
                break;
            default:
                System.out.println("invalid number");

        }
    }                
        }