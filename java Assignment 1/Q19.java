class More{
    public static void main(String[] args){
        int c=7;
        int cube=c*c*c;
        int l=7;
        int b=4;
        int h=8;
        int cuboid=l*b*h;
        System.out.println("cube"+cube);
        System.out.println("cuboid"+cuboid);
        if(cube>cuboid){
            System.out.println("Cube has more volume");
        }else if(cuboid> cube) {
            System.out.println("Cuboid has more volume");
        }else{
            System.out.println("Both have equal volume");
        }
    }
}