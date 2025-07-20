
import java.util.Scanner;
class Eleven{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age");
        int age =sc.nextInt();
        System.out.println("marital status");
        char Mar=sc.next().charAt(0);

        System.out.println("Enter Sex");
        char sex=sc.next().charAt(0);
        //System.out.println("marital status");
       // char Mar=sc.next().charAt(0);
        if(sex=='F'||sex=='f'){
          System.out.println("Female : she will work in Urban area");
        }else if(sex == 'M'|| sex =='m'){
            if(age>=20&&age<=40){
            System.out.println("Younger male:He wil work anywhere");
            }else if(age>40 && age<=60){
                System.out.println("Male: he will work in urban area");
            }
        }else {
            System.out.println("Error");
        }
        
    }
}