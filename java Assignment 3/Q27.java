import java.util.Scanner;

class T_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter alphabet ");
        char c = sc.next().charAt(0);
        

        
        switch(c){
            case 'A': 
                System.out.println("vowel");
                break;
            
            case 'E':
                System.out.println("vowel");
                break;
            case 'I':
                System.out.println("vowel");
                break;
            case 'O':
                System.out.println("vowel");
                break;
            case 'U':
                System.out.println("vowel");
                break;
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
                
            default:
                System.out.println("given charecter is consonent");
                break;

                
        }

    }
}
