import java.util.Scanner;
class Seven{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of classes held");
        int held=sc.nextInt();
        System.out.println("Enter no. of  classes you attend ");
        int attend=sc.nextInt();
        int res= ((attend*100)/held);
        System.out.println("percent of classes you attendance " + res);
        if(attend>75){
            System.out.println("You are allowed to give exam");
        }
        else{
            System.out.println("You don't need to attend this tooo!");
        }
    }
}