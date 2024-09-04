import java.util.*;
class Employee{
    String Empname;
    String Empid;
    double  salary;
    int phone;

    Employee(String nm, String id, double sly, int phn){
        Empname=nm;
        Empid=id;
        salary=sly;
        phone=phn;
    }
    void display(){
        System.out.println("Employee name:"+Empname);
        System.out.println("Employee id:"+Empid);
        System.out.println("Employee salary:"+salary);
        System.out.println("Employee phone:"+phone);
    }
}
public class Suraj{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        Employee[] emp=new Employee[2];
        for(int i=0;i<2;i++){
            System.out.println("Employee"+(i+1)+" Details :");
            System.out.println("Empname");
            String na=sc.next();
            System.out.println("Empid");
            String id=sc.next();
            System.out.println("salary:");
            double sa=sc.nextDouble();
            System.out.println("phone:");
            int ph=sc.nextInt();

            emp[i]=new Employee(na,id,sa,ph);
        }

        for(int i=0;i<2;i++)
        {
            emp[i].display();
            System.out.println();
        }
    }
}