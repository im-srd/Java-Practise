import java.util.*;
public class Dec24_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//        int i=1;
//        System.out.println(i++ + ++i + i++ + --i);
        String ch=sc.next();
        for(int i=0; i<=ch.length();i+=2){
            System.out.print(ch.charAt(i));
        }

    }
}
