import java.util.Scanner;
public class NextLine {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name (With Space) :");
        String s=sc.nextLine();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Name2 (Without Space) :");
        String s1=sc1.next();
        System.out.println(s);
        System.out.println(s1);
    }

}
