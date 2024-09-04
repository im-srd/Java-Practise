import java.util.*;
public class Sample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String n=sc.next();
        System.out.print("How are you, "+n+"?");
        String how=sc.next();
        if(how== "Fine")
        {
            System.out.println("Good.");
        }

    }
}
