import java.util.*;
class Empp{
//    String empname[]=new String[5];
//    String empid[]=new String[5];
//    String empsalary[]=new String[5];
String empname,empid,empsalary;

    Empp(String na,String id,String sa){
        empname=na;
        empid=id;
        empsalary=sa;
    }
    void display(){
            System.out.println(empname+" "+empid+" "+empsalary);
    }

}
public class Braj{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        Empp obj[]=new Empp[5];
//        String empname[]=new String[n];
//        String empid[]=new String[n];
//        String empsalary[]=new String[n];
        for(int i=0;i<5;i++){
            System.out.println("enter the name of "+(i+1)+"employee name");
            String na=sc.next();
            System.out.println("enter the id of "+(i+1)+"employee name");
            String id=sc.next();
            System.out.println("enter the salary of "+(i+1)+"employee name");
            String sa=sc.next();
//            Empp j=new Empp(i,na,id,sa);
            obj[i]=new Empp(na,id,sa); //Store
        }
//        Emp k=new Empp();
        for (int i=0;i<5;i++)
        {
            obj[i].display();
        }
    }
}