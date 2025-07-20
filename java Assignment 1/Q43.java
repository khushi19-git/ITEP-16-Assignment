class Cone{
    public static void main(String args[]){
        int h=4;
        int sh=5;
        int rate=10;
        
        float pi=3.14f;
        float sqR=((sh*sh)-(h*h));
        double r=Math.sqrt(sqR);
        double area=pi*r*r;
        double  cost= area*rate;
        System.out.println("radius="+r);
        System.out.println("area="+area);
        System.out.println("cost"+cost);    }
}