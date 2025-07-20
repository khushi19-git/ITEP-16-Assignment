class Sqgarden{
    public static void main(String args[]){
        int garL = 150;
        int swimL = 25;
        int areaG = garL*garL;
        int areaP = swimL*swimL;   
        int totArea= areaG - areaP;
        System.out.println("area of graden excl pool="+totArea);
    }
}