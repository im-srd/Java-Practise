import java.util.Scanner;

public class SwitchCaseDoubt {
    public static void main(String args[]){
        System.out.println("Enter choice");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch(a){
            case 1 :
                System.out.println("India");
            case 2:
                System.out.println("Pakistan");
            default:
                System.out.println("China");
        }
    }
}
