class Sixth{
    public static void main(String args[]){
        int a=10;
        int b=9;
        int p=36;
        /*heron's formula
        
            semi perimeter=(a+b+c)/2;
            area =squarroot s(s-a)(s-b)(s-c);
        */
       float  c = (a+b)-p;
       float s = (a+b+c)/2;
       float area =(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("area of triangle"+area);


    }
}