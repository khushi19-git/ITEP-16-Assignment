import java.util.Scanner;

class Tw_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path length in meters: ");
        double pathLength = sc.nextDouble();

        System.out.print("Enter path width in meters: ");
        double pathWidth = sc.nextDouble();
        System.out.print("Enter brick length in cm: ");
        double brickLengthCm = sc.nextDouble();

        System.out.print("Enter brick width in cm: ");
        double brickWidthCm = sc.nextDouble();
        double brickLength = brickLengthCm / 100;
        double brickWidth = brickWidthCm / 100;

        double pathArea = pathLength * pathWidth;
        double brickArea = brickLength * brickWidth;
        int num = (int) Math.ceil(pathArea / brickArea);
        System.out.println("Number of bricks required: " + num);

    }
}