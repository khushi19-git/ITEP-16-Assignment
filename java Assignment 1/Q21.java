import java.util.Scanner;

class Tw_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bL=15;
        int bB=8;
        int bH= 5;
        int wallL=15 *100;
        int wallB= 10 *100;
        int wallH= 8 *100;
        int bVol= bL*bB*bH;
        long wallVol= (long)wallL*wallB*wallH; 
        long total = wallVol / bVol;
        System.out.println("total bricks"+total);
    }
}