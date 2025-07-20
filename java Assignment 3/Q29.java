import java.util.Scanner;
 class T_9 {
    public static void main(String args[]){
         Scanner sc  = new Scanner(System.in);

        System.out.println("Enter four no. to check lowest");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int small = n1;

        if(n2<small)
        small = n2;
               
        if(n3<small)
        small = n3;
               
        if(n4<small)
        small = n3;

        System.out.println("the lowest no. is "+ small); 
        
        
        
        }
    
}
