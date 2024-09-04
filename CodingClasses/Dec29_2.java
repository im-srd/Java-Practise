import java.util.*; //to use Scanner_Class
public class Dec29_2 {
    public static void main(String args[]){
         //int arr[]=new int[5];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of array :");
        int n=sc.nextInt();
        String arr[]=new String[n];

//        arr[0]=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the element "+(i+1));
            arr[i]=sc.next(); //next() --> without space accept the String
        }                           //nextLine() --> with space accept the string
        System.out.print("\nYour Array Elements are : [");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i<arr.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}

