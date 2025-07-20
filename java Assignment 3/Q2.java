import java.util.Scanner;
class Two{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many item  purchased");
        int q= sc.nextInt();
        System.out.print("cost per unit");
        int cost=100;
        int t_cost=q*100;
        if(t_cost>1000)
        {
            int discount=((10*t_cost)/100);
            int tc= t_cost-discount;
            System.out.println("Final price is : " + tc);

        }else
        {
            System.out.println("you purchased items Rs : " + t_cost);
        }

    }
}