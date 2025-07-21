import java.util.Scanner;
class Fifteen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int len=sc.nextInt();
        System.out.println("Enter breath");
        int bre=sc.nextInt();
        System.out.println("Enter Side");
        int side= sc.nextInt();
        int areaS= len* bre;
        int areaR= side*side;
        System.out.println("shelly" +areaS);
        System.out.println("rachel"+areaR);
        if(areaR > areaS){
            System.out.println("rachel garden is big"+(areaR-areaS));
        }else if (areaS > areaR){
            System.out.println("shelly garden is big"+ (areaS- areaR));
        }else{
            System.out.println("same");
        }
    }
}