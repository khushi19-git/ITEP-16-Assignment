class Trapeziod{
    public static void main(String args[]){
        int b1=128;
        int b2=92;
        int h=40;
        int w=4;
        // area trapez..=((b1+b2)/2) *h
        int tarea = ((b1+b2)/2)*h;
        int warea=w*h;
        int finalArea =(tarea - warea);
        System.out.println("trape..="+tarea);
        System.out.println("walk="+warea);
        System.out.println("final area="+finalArea);
    }
}