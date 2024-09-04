import java.io.*;
import java.net.*;
public class Client91 {
    public static void main(String args[])throws Exception{
        Socket sock=new Socket("127.0.0.1",4000);
        System.out.println("Enter the file name");
        BufferedReader kr=new BufferedReader(new InputStreamReader(System.in));
        String fname=kr.readLine();

        OutputStream o=sock.getOutputStream();
        PrintWriter pw=new PrintWriter(o,true);
        pw.println();

        InputStream i=sock.getInputStream();
        BufferedReader sr=new BufferedReader(new InputStreamReader(i));
        String str;
        while((str=sr.readLine())!=null){
            System.out.println(str);
        }
        sock.close(); kr.close(); sr.close();
    }
}
