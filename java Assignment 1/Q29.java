class Tiles{
    public static void main(String[] args){
        int floorLength=800;
        int floorBreadth=900;
        int tileSide=10;
        int floorArea =floorLength*floorBreadth;
        int tileArea =tileSide*tileSide;
        int totalnumber=floorArea/tileArea;
        System.out.println("Number of tiles"+totalnumber);
    }
}