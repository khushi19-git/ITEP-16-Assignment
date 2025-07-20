import java.util.Scanner;
class Th_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet.");
        } else {
            System.out.println(ch + " is NOT an Alphabet.");
        }

    }
}