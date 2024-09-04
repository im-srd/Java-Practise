class Rectangle1{
    int length,breadth;
    Rectangle1(){}
    Rectangle1(int l,int b){
        length=l;
        breadth=b;
    }
    void area(int l,int b){
        System.out.println("Area:"+(l*b));
    }
}
public class Jan13 {
    public static void main(String args[]){
        Rectangle1 r=new Rectangle1(4,5);


//        r=new Rectangle1(10,20);
//        r.area(4,5);
//        r.area(10,20);
//        r.length=5;
//        r.length=15;

        System.out.println(r.length+" "+r.breadth);
    }
}
