import java.util.*;
import java.io.*;
import java.net.*;
public class Client10 {
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        Socket s=new Socket("localhost",6666);
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        System.out.println("Connection established\nEnter the message :");
        String msg=sc.nextLine();
        dout.writeUTF(msg);
        dout.flush();
        dout.close();
        s.close();
    }
}
