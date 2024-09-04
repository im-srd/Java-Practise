/*Define class Square with a variable to initialise the side length with the help of a constructor.
Define two methods which will return area and perimeter of square .

Define class cube with appropriate variable name and constructor to initialise the value. Define two
methods which will return volume and total surface area of cube .

Define class circle having a variable radius with the appropriate required constructor to initialise its
value and will have two methods to print the area and circumference to the console .

Define main class , make an object of each class and envoke all the possible methods and display it .*/

import static java.lang.Math.PI;

class Square{
    float side;
    Square(){System.out.println("No value Given");}
    Square(float s){
        side=s;
    }
    void area(){
        System.out.println("Area of square :"+(side*side));
    }
    void per(){
        System.out.println("Perimeter of Square :"+(4*side));
    }
}
class Cube{
    float side;
    Cube(){System.out.println("No value Given");}
    Cube(float s){ side=s; }
    void volume(){ System.out.println("Volume of Cube:"+(side*side*side)); }
    void TSA(){ System.out.println("Total Surfaec Area of Cube :"+(6*side*side)); }
}
class Circle{

    float radius;
    Circle(){System.out.println("No value Given");}
    Circle(float r) { radius=r; }
    void area(){ System.out.println("Area of circle :"+(PI * radius*radius)); }
    void cir(){ System.out.println("Circumference of Circle :"+(2*PI*radius)); }
}
public class Set4_Q2 {
    public static void main(String args[]){
        Square s=new Square((float) 5.4);
        s.area();
        s.per();
        Cube c=new Cube((float) 6.7);
        c.TSA();
        c.volume();
        Circle o=new Circle((float) 4.8);
        o.cir();
        o.area();
    }
}
