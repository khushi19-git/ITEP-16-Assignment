class vol{
    public static void main(String args[]){
        float v= 1287f;
        float r=10f;
        float surf;
        float pi=3.14f;
        //v=pi*r^2*h
        float h= v/(pi*r*r);
        System.out.println("height="+h);
        double tsa = 2*pi*r*(r+h);
        System.out.println("total surface ="+tsa);    }
}