class Garden{
    public static void main(String args[]){
        int len=22;
        int bre=15;
        int side= 21;
        int areaS= len* bre;
        int areaR= side*side;
        System.out.println("shelly" +areaS);
        System.out.println("rachel"+areaR);
        if(areaR > areaS){
            System.out.println("rachel garden is big"+(areaR-areaS));
        }else if (areaS > areaR){
            System.out.println("shelly garden is big"+ (areaS- areaR));
        }else{
            System.out.println("same");
        }
    }
}