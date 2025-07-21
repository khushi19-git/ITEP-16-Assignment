import java.util.Scanner;

class Tw_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter break leangth");
        int bL=sc.nextInt();
        System.out.println("Enter break breath");
        int bB=sc.nextInt() ;
        System.out.println("Enter break height");
        int bH= sc.nextInt();
        int wallL=15 *100;
        int wallB= 10 *100;
        int wallH= 8 *100;
        int bVol= bL*bB*bH;
        long wallVol= (long)wallL*wallB*wallH; 
        long total = wallVol / bVol;
        System.out.println("total bricks"+total);
    }
}