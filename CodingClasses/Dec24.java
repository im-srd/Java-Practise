import java.util.*;
public class Dec24 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Switch Case:\n");
        System.out.println("Enter Integer(1/2/3/4/5/6/7) as Day:");
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THRUSHDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Invalid.");
        }
    }

}

