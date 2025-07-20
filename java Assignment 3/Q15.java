import java.util.Scanner;
class Tax{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter cost");
        int c= sc.nextInt();
        float Tax;
        if(c>100000){
            Tax= c*(15f/100);
        }else if (c>50000&&c<=100000){
            Tax=c*(10f/100);
        
        }else{
            Tax = c*(5f/100);
        }System.out.println("tax you need to pay:"+Tax);
    }
}