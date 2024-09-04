//Constructor overloading --> methods define in the same class with the same name.
/* void add()  --> obj.add()
   void add(int a) --> obj.add(12)
   void add(String a) --> obj.add("12")
   void add(int a,String b) --> obj.add(12,
 */
class CO{
    void add()
    {
        int a=5;
        int b=6;
        System.out.println((a+b)); //5+6
    }
    CO()
    {

    }
    CO(int a,int b){}
    CO(String a,String b){}
    void add(int a,int b){
        System.out.println(a+b); //add
    }
    void add(String a,String b)
    {
        System.out.println(a+b); //concatenation
    }
}
public class Jan12_C_OverLoadng {
    public static void main (String args[]){
        CO obj=new CO(); //object created with obj name
        obj.add(); //output : 11
        obj.add(12,45); //output : 57
        obj.add("12","45"); //output : 1245
    }
}
