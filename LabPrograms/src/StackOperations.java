
/*1 (b) Write a Java program to implement the Stack using arrays. Write Push (), Pop (), and Display ()
methods to demonstrate its working.*/

import java.util.Scanner;

class Stack{
    int top=-1;
    int MAX=100;
    int a[]=new int[MAX];
    Scanner sc1=new Scanner(System.in);
    void push()
    {
        if(top==(MAX-1))
        {
            System.out.println("Stack is FULL.");
        }
        else
        {
        int elem;
        System.out.println("Enter the element :");
        elem=sc1.nextInt();
        a[++top]=elem;
        }
    }

    void pop()
    {
        if(top==-1)
            System.out.println("Stack is Empty.");
        else
        {
            int elem = a[top];
            top--;
            System.out.println("Element Deleted is :" + elem);
        }
    }

    void display()
    {
        if(top==-1)
            System.out.println("Nothing to Display.");
        for(int i=top;i>=0;i--)
        {
            System.out.println(a[i]+"\n");
        }
    }
}

public class StackOperations {
    public static void main(String args[])
    {
        Stack s=new Stack();
        int choice;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("----STACK OPERATIONS----");
        System.out.println("1. PUSH");
        System.out.println("2. POP");
        System.out.println("3. DISPLAY");
        System.out.println("4. EXIT");
        System.out.println("Enter your Choice :");
        choice=sc.nextInt();
        switch(choice)
            {
                case 1: s.push(); break;
                case 2: s.pop(); break;
                case 3: s.display(); break;
                case 4: return; //in java we use 'return' instead of 'exit'.
                default : System.out.println("Invalid Choice !!!"); break;
            }
        }
    }
}
