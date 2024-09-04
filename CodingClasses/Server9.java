import java.io.*;
import java.net.*;
public class Server9 {
    public static void main(String args[]) throws Exception{
        ServerSocket ss = new ServerSocket(6666);
        Socket s=ss.accept();
        //sop(connection successful)
        InputStream is=s.getInputStream(); //Accept filename from client
        BufferedReader fileRead=new BufferedReader(new InputStreamReader(is)); //Read the file name came from Client side
        String fname= fileRead.readLine(); //Reading file contents
        BufferedReader contentRead = new BufferedReader(new FileReader(fname));//ready to send the contents to client
        OutputStream os=s.getOutputStream(); //Send the file contents

        //PrintWriter pwrite=new PrintWriter(os,true);
        s.close();
        ss.close();

    }
}
