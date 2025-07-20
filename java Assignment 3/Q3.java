import java.util.Scanner;
class Three{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
 System.out.println("Enter salary");
 float s= sc.nextInt();
 System.out.println("Enter year");
 float y= sc.nextInt();
 if(y>5){
    float bonus=5f/100f ;
    float netsalary=bonus*s;
    System.out.println("bonus : " + bonus); 
    System.out.println("You get bonus  rs =" + netsalary);
 }else{
    System.out.println("Your salary is " +s);
 }

}

}