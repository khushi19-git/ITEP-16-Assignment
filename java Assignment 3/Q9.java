import java.util.Scanner;
class Nine{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter alphabet");
        char al=sc.next().charAt(0);
        if(al>='A'&&al<='Z'){
            System.out.println("Uppercase");
        }else if(al>='a'&&al<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("please enter a character");
        }

        
    }
}