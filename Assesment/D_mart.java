import java.util.Scanner;
class Dmart{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Welecome in Dmart");
   System.out.println("Enter name -");
   String name = sc.next();
   System.out.println("Gender :M/F");
   char g = sc.next().charAt(0);
   double total_amount=0;
   
   System.out.println("Item 1");
   int item1 = sc.nextInt();
   System.out.println("Enter price :");
   double price1 = sc.nextDouble();
   System.out.println("quantity");
   double q1 = sc.nextDouble();
   double dis =0;
   double total1=0;
   if(q1>4){
     dis = (q1*price1)*(5/100);
     total1 = (q1*price1)-dis;
   }


   System.out.println("Item 2");
   int item2 = sc.nextInt();
   System.out.println("Enter price :");
   double price2 = sc.nextDouble();
   System.out.println("quantity");
   double q2 = sc.nextDouble();
   double total2 = q2*price2;
   

    System.out.println("Item 3");
   int item3 = sc.nextInt();
   System.out.println("Enter price :");
   double price3 = sc.nextDouble();
   System.out.println("quantity");
   double q3 = sc.nextDouble();
   double total3 = q3*price3;


    System.out.println("Item 4 ");
   int item4 = sc.nextInt();
    System.out.println("Enter price :");
   double price4 = sc.nextDouble();
   System.out.println("quantity");
   double q4 = sc.nextDouble();
   double total4 = q4*price4;


   System.out.println("Item 5 ");
   int item5 = sc.nextInt();
   System.out.println("Enter price :");
   double price5 = sc.nextDouble();
   System.out.println("quantity");
   double q5 = sc.nextDouble();
   double dis5 = (q5*price5)*10/100;
   double total5 = (q5*price5)-dis5;


   System.out.println("Item 6");
   int item6 = sc.nextInt();
   System.out.println("Enter price :");
   double price6 = sc.nextDouble();
   System.out.println("quantity");
   double q6 = sc.nextDouble();
   double total6 = q6*price6;


   System.out.println("Item 7 ");
   int item7 = sc.nextInt();
   System.out.println("Enter price :");
   double price7 = sc.nextDouble();
   System.out.println("quantity");
   double q7 = sc.nextDouble();
   double total7 = q7*price7;


   System.out.println("Item 8 ");
   int item8 = sc.nextInt();
   System.out.println("Enter price :");
   double price8 = sc.nextDouble();
   System.out.println("quantity");
   double q8 = sc.nextDouble();
   double total8 = q8*price8;


   System.out.println("Item 9");
   int item9 = sc.nextInt();
   System.out.println("Enter price :");
   double price9 = sc.nextDouble();
   System.out.println("quantity");
   double q9 = sc.nextDouble();
   double total9 = q9*price9;


   System.out.println("Item 10");
   int item10 = sc.nextInt();
   System.out.println("Enter price :");
   double price10 = sc.nextDouble();
   System.out.println("quantity");
   double q10 = sc.nextDouble();
   double dis10 = (q10*price10)*15/100;
   double total10 = (q10*price10)-dis10;


   total_amount =(total1+total2+total3+total4+total5+total6+total7+total8+total9+total10);
    
    double getdis=0;
    if(total_amount > 10000 ){
        getdis = total_amount*15/100;
    
    }else if (total_amount < 5000 && total_amount > 1000){
        getdis =total_amount*10/100;
    } else{
        getdis=0;
    }
      total_amount = total_amount - getdis;
      
      double gst = total_amount*10/100;
       total_amount = total_amount + gst;

       System.out.println("you want bag y/n");
        char ch = sc.next().charAt(0);
        if(ch=='y'||ch=='Y'){

            total_amount = total_amount+10;
            System.out.println("yes");
        }else if(ch=='n'&&ch=='N'){
            total_amount = total_amount;
            System.out.println("no");
        }else{
            total_amount= total_amount;
        }
       
        String gift ;
       if(g=='m'|| g=='M'){
          gift = "ledger wallet";
       }else if(g=='f'|| g=='F'){
        gift = "cadeburry";
       }else{
        gift = "none";
       }

    System.out.println(" ------------- \tDmart\t -------------      ");
    System.out.println("Name :"+name);
    System.out.println("----------------------------------------------------------");
    System.out.println("Item \tQuantity \tPrice  \tTotal   \t Discount");
    System.out.println(item1+  "\t"  +q1+   "\t"  +price1+  "\t"   +total1 );
    System.out.println(item2+  "\t"  +q2+   "\t"  +price2+  "\t"   +total2 );
    System.out.println(item3+  "\t"  +q3+   "\t"   +price3+  "\t"  +total3 );
    System.out.println(item4+  "\t"  +q4+   "\t"   +price4+  "\t"  +total4 );
    System.out.println(item5+  "\t"  +q5+   "\t"   +price5+  "\t"  +total5 );
     System.out.println(item6+  "\t"  +q6+   "\t"   +price6+   "\t"+total6 );
     System.out.println(item7+   "\t"   +q7+  "\t"  +price7+   "\t"+total7 );

    System.out.println(item8+   "\t"  +q8+  "\t"  +price8+   "\t"   +total8 );
    System.out.println(item9+   "\t"  +q9+  "\t"  +price9+   "\t"   +total9 );
     System.out.println(item10+  "\t"  +q10+  "\t"  +price10+  "\t "  +total10 );

    System.out.println("------------------------------------------------------------");

//System.out.println("discount ="+tdis);
System.out.println("              Ap          DP\n                 " +total_amount+"   "+getdis );
System.out.println("Gift"+gift);
System.out.println("gst"+gst);
System.out.println("cary bag"+ch);

 System.out.println("------------------------------------------------------------");
 System.out.println("total payment "+total_amount);
 System.out.println("\t   thank you ");
 System.out.println("\t   to visit \n            DMART");
}
}
