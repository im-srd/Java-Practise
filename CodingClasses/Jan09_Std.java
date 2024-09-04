import java.util.*;
class Student{
    String usn;
    String name;
    Student(String u,String n)
    {
        usn=u;
        name=n;
    }
    void display()
    {
        System.out.println("usn:"+usn);
        System.out.println("name:"+name);
    }
}

public class Jan09_Std {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of student :");
        int n=sc.nextInt();
//        Student s[]=new Student("1ay","shyam");
        Student s[]=new Student[n]; //array
        for(int i=0;i<n;i++)
        {
            System.out.println("Student"+(i+1)+" Details :");
            System.out.println("Enter name");
            String na=sc.next();
            System.out.println("Enter usn");
            String us=sc.next();
            s[i]=new Student(us,na);
//            s[i].display();
        }
        for(int i=0;i<n;i++)
        {
            s[i].display();
            System.out.println();
        }
    }
}
