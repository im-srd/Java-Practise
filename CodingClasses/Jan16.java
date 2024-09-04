//static
public class Jan16 {
    static int count=0;

    static void count(){  //prevents overloading
        count++;
        System.out.println(count);
    }
//    void count(int count)
//    {
//        count++;
//        System.out.print("Count="+count);
//    }

    public static void main(String args[]){
        Jan16 j1 =new Jan16();
        Jan16 j2=new Jan16();
        Jan16 j3 =new Jan16();
//        Jan16 j4=new Jan16();
//        j4.count(2);
        j1.count();
        j2.count();
        j3.count();
    }

}
