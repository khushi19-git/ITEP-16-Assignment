import java.util.Scanner;
class F_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks of physics");
        int pmarks=sc.nextInt();
         System.out.print("enter marks of chemistry");
        int cmarks=sc.nextInt();
         System.out.print("enter marks of biology");
        int bmarks=sc.nextInt();
         System.out.print("enter marks of Maths");
        int mathmarks=sc.nextInt();
         System.out.print("enter marks of Computer");
        int commarks=sc.nextInt();
        int t=pmarks+cmarks+bmarks+mathmarks+commarks;
        double per=(t/500.0)*100;
        System.out.println("total percentage="+per);
        if(per >= 90) 
        System.out.println(" Grade A");
         else if(per >= 80)
        System.out.println(" Grade B");
        else if(per >= 70)
        System.out.println(" Grade C");
        else if(per >= 60)
        System.out.println(" Grade D");
        else if(per >= 50) 
        System.out.println(" Grade E");
        else if(per <= 40) 
        System.out.println(" Grade F");
    }
}
