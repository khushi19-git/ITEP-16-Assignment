class Regarden{
    public static void main(String args[]){
        int garL = 30;
        int garW = 20;
        int pW= 3;
        int pL= 4;
        int  garden = garL*garW;
        System.out.println(garden);
        int hor = pW*garL;
        int ver = pL*garW;
        System.out.println("two path way hor="+hor+"ver"+ver);
        int over = pW*pL;
        System.out.println("over"+over);
        int totPath = hor+ver-over;
        System.out.println("total path="+totPath);
        int useGar = garden-totPath;
        System.out.println("usable garden= "+useGar);
    }
}