import java.util.Scanner;

class Ninteen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter edge");   
        int c = sc.nextInt();
        int cube=c*c*c;
        System.out.println("Enter length");
        int l = sc.nextInt();
        System.out.println("Enter breath");
        int b = sc.nextInt();
        System.out.println("Enter Height");
        int h = sc.nextInt();
        int cuboid=l*b*h;
        System.out.println("cube"+cube);
        System.out.println("cuboid"+cuboid);
        if(cube>cuboid){
            System.out.println("Cube has more volume");
        }else if(cuboid> cube) {
            System.out.println("Cuboid has more volume");
        }else{
            System.out.println("Both have equal volume");
        }
    }
}