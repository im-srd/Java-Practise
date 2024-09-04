import java.util.*; //scanner present --> nextInt() //built in fn.
public class Jan02 {
    //User defined function
    int add() //void --> null
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        return a+b; //integer type
    }

    int mul(int a,int b) //parameterized function
    {
        return a*b;
    }

    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println();
        Jan02 j=new Jan02(); // user defined class
        Scanner sc=new Scanner(System.in); // built in class
        // className obj = new className();
//        int x= sc.nextInt();
//        System.out.println(j.add());
//        System.out.println(j.add());
        System.out.println(j.mul(2,3));
        Math.pow(2,3);
    }
}















