import java.util.*;
public class Jan05 {
    int add(int a) //argument
    {
        if (a==0)  //basic step
             return a;
        else
            return a + add(a-1);  //5 + 4 + 3 + 2 + 1 ..... add(0)
//            System.out.print(a+add(a-1));
    }
    public static void main(String args[]){
        //Recursion : Calling the same function again and again.
        //Basic step : To come out of the fn.
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        Jan05 j=new Jan05();   //create a object of class 'Jan05' to use the func ( add() ) defined in 'Jan05'
        System.out.print(j.add(n));
//        j.add(5);


        //using for loop


    }
}
