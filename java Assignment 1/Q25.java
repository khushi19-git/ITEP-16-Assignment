class Brick{
    public static void main(String[] args){
        int num= 100;
        int l= 24;
        int b= 15;
        int area=l*b;
        int totalArea=area* num;
        double totalM= totalArea/10000.0;
        System.out.println("Area cm" +totalArea);
        System.out.println("Area m" +totalAreaM);
    }
}