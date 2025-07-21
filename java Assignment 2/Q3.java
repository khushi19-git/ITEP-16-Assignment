 import java.util.scanner;
 class Tiles {
    public static void main(String[] args) {
        Scanner sc = new scanner(System.in);
        System.out.println("Enter floar length");        
        int fl = sc.nextInt();
        System.out.println("Enter floar Breath");
        int fb = sc.nextInt();
        System.out.println("Enter tiles Length");
        int tl = sc.nextInt();
        System.out.println("Enter tiles Breath");
        int tb= sc.nextInt();
        int fArea = fl*fb;
        int tArea = tl*tb;
        int numberOfTiles = fArea / tArea;
        System.out.println("Number of tiles needed: " + numberOfTiles);
    }
}