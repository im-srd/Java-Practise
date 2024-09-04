import java.io.*;
import java.net.*;
public class Server10 {
    public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        System.out.println("Ready for connection.");
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        System.out.println("Connection established.");
        System.out.println(din.readUTF());
        ss.close();
    }
}
