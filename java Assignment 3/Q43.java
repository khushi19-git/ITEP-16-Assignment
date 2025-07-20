import java.util.Scanner;
class F_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter unit");
        int unit=sc.nextInt();
        double tunit;

        if(unit>=50){
        tunit=unit*0.50;
        System.out.println("total bill="+tunit);

        }else if((unit>50)&&(unit<150)){
            tunit=unit*0.75;
             System.out.println("electricity bill="+tunit);
        }else if((unit>150)&&(unit<250)){
            tunit=unit*1.20;
             System.out.println("electricity bill.="+tunit);

        }else if(unit<=250){
        tunit=unit*1.50;
        double bill=(tunit*20)/100;
        double tbill=tunit+bill;
        System.out.println("electricitybill="+tbill);
        }
    }
}
