import java.util.*;
public class Dec22_3 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=s.nextInt();
        // (condition)? trueExpression : falseExpression;
        String var=(num<0 && num!=0)?"Negative":(num==0)?"Zero":"Positive";
        System.out.println(var);

    }
}
