import java.io.*;
import java.net.*;
public class Server91 {
    public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(4000);
        System.out.println("Ready for Connection");
        Socket sock=ss.accept();
        System.out.println("Connection Established");

        InputStream i=sock.getInputStream();
        BufferedReader fr=new BufferedReader(new InputStreamReader(i));
        String fname=fr.readLine();
        BufferedReader cr=new BufferedReader(new FileReader(fname));

        OutputStream o=sock.getOutputStream();
        PrintWriter pw=new PrintWriter(o,true);
        String str;
        while((str=cr.readLine())!=null){
            pw.println(str);
        }
        pw.close();
        ss.close();
        fr.close();
        sock.close();
        cr.close();
    }
}
