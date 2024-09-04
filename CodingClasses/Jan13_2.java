import java.util.*;
public class Jan13_2 {
    //Leap_Year Method
    void leapYear(int year){
        if (year%4==0)
            System.out.println("Leap Year.");
        else System.out.println("Not a leap year.");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Website Program
        System.out.println("Enter website :");
        String webSite=sc.next();
        if(webSite.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(webSite.endsWith(".org")){
            System.out.println("Organizational Website");
        }
        else
            System.out.println("Indian Website");

        //Leap Year
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        Jan13_2 j=new Jan13_2();
        j.leapYear(year);
    }
}