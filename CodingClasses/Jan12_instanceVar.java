// Instance variable hiding
class IVH{
    String name;

    IVH(String name){
        this.name=name;  ////this --> access the class variable
    }
    void display()
    {
        System.out.println("name :"+name);
    }
}
public class Jan12_instanceVar {
    public static void main(String args[]){
        IVH obj=new IVH("shyam");
        obj.display();
    }
}
