import java.util.*;
import java.io.*;
public class CRC{
    public static void main(String args[]){
        //SERVER SIDE
        Scanner sc=new Scanner(System.in);
        System.out.println("SERVER SIDE\n\nEnter the message :");
        String msg=sc.next();
        System.out.println("Enter the Generator :");
        String gen=sc.next();

        int data[]=new int[msg.length()+(gen.length()-1)];
        int div[]=new int[gen.length()];

        for (int i=0;i<msg.length();i++)
            data[i]=Integer.parseInt(msg.charAt(i)+"");
        for (int i=0;i<gen.length();i++)
            div[i]=Integer.parseInt(gen.charAt(i)+"");
        //CALCULATION OF CRC
        for (int i=0;i<msg.length();i++)
        {
            if(data[i]==1)
                for(int j=0;j< div.length;j++)
                    data[i+j]^=div[j];
        }
       //DISPLAY OF CRC (Checksum)
        System.out.println("The Checksum code is :");
        for (int i=0;i<msg.length();i++)
            data[i]=Integer.parseInt(msg.charAt(i)+"");
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]);
        System.out.println("\n-------------------------\n");
        //CLIENT SIDE
        //Check for input CRC Code
        System.out.println("CLIENT SIDE\n\nEnter the Checksum code :");
        msg=sc.next();
        System.out.println("Enter the Generator :");
        gen=sc.next();

        for (int i=0;i<msg.length();i++)
            data[i]=Integer.parseInt(msg.charAt(i)+"");
        for (int i=0;i<gen.length();i++)
            div[i]=Integer.parseInt(gen.charAt(i)+"");
        //Calculation of remainder
        for (int i=0;i<msg.length();i++)
        {
            if(data[i]==1)
                for(int j=0;j< div.length;j++)
                    data[i+j]^=div[j];
        }
        //Display validity of data
        boolean valid=false;
        for(int i=0;i<data.length;i++){
            if(data[i]==1)
                    valid=true;
        }
        if(valid==false)
            System.out.print("No Error");
        else System.out.println("Error.");
    }
}
