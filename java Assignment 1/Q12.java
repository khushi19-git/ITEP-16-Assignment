 class RightTriangle {
    public static void main(String[] args) {
        double hypo =13;
        double side1 =12;
        double side2 = Math.sqrt(hypo*hypo- side1 *side1);
        double area =0.5*side1*side2;
        System.out.println("Length ="+side2);
        System.out.println("Area of the triangle="+area);
    }
}