class Brick{
    public static void main(String[] args){
        int pLength=120*100;
        int pBreadth=240;
        int bLength=24;
        int bBreadth =15;
        int pathArea= pLength*pBreadth;
        int brickArea=bLength* bBreadth;
        int total= pathArea/brickArea;
        System.out.println("toal Number"+total);
    }
}