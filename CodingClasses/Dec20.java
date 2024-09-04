import java.util.*;
public class Dec20 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Today's Topic : String");
        String fruits="apple, baNana, mango";
        System.out.println("Fruits :"+fruits);

        System.out.println("Length of Fruits : "+fruits.length());

        System.out.println("using indexof() method \nIndex of b:"+fruits.indexOf("b"));
        System.out.println("Index of N:"+fruits.indexOf("N"));
        System.out.println("Index of n:"+fruits.indexOf("n"));
        System.out.println("Index of banana:"+fruits.indexOf("banana"));
        System.out.println("Index of baNana:"+fruits.indexOf("baNana"));
        //if more than one char then show only the index of first

        System.out.println("using charAt()\nAt index no 12: "+fruits.charAt(12));

        System.out.println("Upper Case: "+fruits.toUpperCase());
        System.out.println("Lower Case: "+fruits.toLowerCase());

        System.out.println(fruits.trim());
        System.out.println(fruits.strip());
        System.out.println(fruits.substring(4,10)); //(start index, end index)

        System.out.println(fruits.replace("c","d"));//(target, replacement)
        System.out.println(fruits.replace("apple","pineapple"));

        System.out.println(fruits.startsWith("a")); //String starts with a or not
        System.out.println(fruits.startsWith("apple"));//string starts with apple or not   -->Return Boolean values
        System.out.println(fruits.endsWith("a"));//string ends with a or not-
    }

}
