import java.util.Scanner;

class F_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter basic salary: ");
        double bS= sc.nextDouble();

        double hra, da, grossSalary;
        if (bS<= 10000) {
            hra = bS* 0.20;
            da = bS * 0.80;
        } else if (bS<= 20000) {
            hra = bS* 0.25;
            da = bS* 0.90;
        } else {
            hra = bS * 0.30;
            da = bS* 0.95;
        }
        grossSalary = bS+ hra + da;
        System.out.println("Gross Salary = " + grossSalary);
    }
}
