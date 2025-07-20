class Tiles {
    public static void main(String[] args) {
        
        int fl = 520;
        int fb = 140;
        int tl = 13;
        int tb= 7;
        int fArea = fl*fb;
        int tArea = tl*tb;
        int numberOfTiles = fArea / tArea;
        System.out.println("Number of tiles needed: " + numberOfTiles);
    }
}