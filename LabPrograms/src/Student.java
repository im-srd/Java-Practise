/*1 (a) Create a Java class called Student with the following details as variables within it.
(i) USN (ii) Name (iii) Branch (iv) Phone
Write a Java program to create n Student objects and print the USN, Name, Branch, and Phone of these
objects with suitable headings.*/

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.io.*;
class Student1 {
    String usn;
    String name;
    String branch;
    long phone;

    Student1(String u,String n,String b,long p)
    {
        usn=u;
        name=n;
        branch=b;
        phone=p;
    }
    void display()
    {
        System.out.println("Name :"+name);
        System.out.println("USN :"+usn);
        System.out.println("Branch :"+branch);
        System.out.println("Phone No. :"+phone);
    }
}

class Student{
    public static void main(String args[])
    {
        //Student s1;
        Scanner sc=new Scanner(System.in); //Names with SPACES (that's why we use two scanner classes objects)
        Scanner sc1=new Scanner(System.in); //Names without SPACES
        System.out.println("Enter the number of Students :");
        int n=sc.nextInt();
        Student1 s[]=new Student1[n];
        for(int i=0;i<n;i++)
        {

            System.out.println("Enter the details of Student number "+(i+1));
            System.out.println("Enter the name(WITH or WITHOUT Space) :");
            String na=sc.next();
            System.out.println("Enter the USN :");
            String us=sc1.nextLine();
            System.out.println("Enter the Branch :");
            String br=sc1.next();
            System.out.println("Enter the Phone No. :");
            long ph=sc1.nextLong();

            s[i]= new Student1(us,na,br,ph);
        }

            for(int i=0;i<n;i++)
            {
                System.out.println("Details of Student :"+(i+1));
                s[i].display();
            }

    }
}
