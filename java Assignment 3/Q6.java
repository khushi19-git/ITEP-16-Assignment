import java.util.Scanner;
class Six{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter number");
        int n = sc.nextInt();
        int abs= Math.abs(n);     // abs= +ve values;
        if(n<0)
        {
            System.out.println(" abs" + abs);
        }else
        {
            System.out.println("Number is already abs");
        }
    
}
}