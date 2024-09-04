class Objects{
    static int count=0;
    Objects(){
        count++;
    }
    void display(){
        System.out.println("Number of objects created in Object Class is ="+count);
    }
}
public class NoOfObjectCreated {
    public static void main(String args[]){
        Objects o1=new Objects();
        Objects o2=new Objects();
        Objects o3=new Objects();
        o1.display();

    }
}
