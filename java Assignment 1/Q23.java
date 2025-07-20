class cube{
    public static void main(String[] args){
        int l=15;
        int b= 9;
        int h= 12;
        int Side= 3;
        int length =l/Side;
        int breadth =b/Side;
        int height =h/Side;
        int totalBox=length*breadth*height;
        System.out.println("toatal"+ totalBox);
    }
}