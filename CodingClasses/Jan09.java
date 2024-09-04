import java.util.*;
class Rectangle
{
    Rectangle() { //Default constructor
        System.out.println("Yeah, Constructor is called.");
    }
    Rectangle(int a,int b) {
        System.out.println("Value of a and b is"+a+""+b);
    }

    Rectangle(int a){ //Parametrized constructor
        System.out.println("This is parameterized constructor.");
        System.out.println("The value of a is"+a);
    }
}
public class Jan09 { //Main Class

    public static void main(String args[]){
        Rectangle r=new Rectangle(); //Automatically called when objects of the class are made.
        Rectangle r2=new Rectangle(10); //calls the Paramaeterized cons.
        Rectangle r3=new Rectangle(12,45);
    }
}
