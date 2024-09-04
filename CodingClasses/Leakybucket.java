import java.util.*;
public class Leakybucket {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the output rate ");
       int oprate=sc.nextInt();
       System.out.println("Enter the Bucket Size ");
       int bktsize=sc.nextInt();
        for(int i=1;i<=2;i++) //kitne baar run karna hai
        {
            System.out.println("Enter the size of packet "+i);
            int pktsize=sc.nextInt();

            if (pktsize>bktsize)
                System.out.println("Bucket Overflow !!!\n");
            else
                while(pktsize>oprate){
                    System.out.println(oprate+"bytes outputted.");
                   try{ Thread.sleep(1000);}
                   catch(InterruptedException ie){}
                   pktsize-=oprate;
                }
                if(pktsize>0)
                    System.out.println("Last "+pktsize+" bytes outputted.");
                System.out.println("Successful");
        }
    }
}
