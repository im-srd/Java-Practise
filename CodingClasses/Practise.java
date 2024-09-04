import java.util.*;
import java.math.BigInteger;
public class Practise{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the message:");
        String message=sc.next();
        Rsa r=new Rsa();
        byte[] messageBytes=message.getBytes();
        BigInteger messageInt=new BigInteger(messageBytes);
        BigInteger encryptedmessage=r.encrypt(messageInt);
        BigInteger decryptedmessage=r.decrypt(encryptedmessage);
        byte[] decryptedmessageBytes=decryptedmessage.toByteArray();
        String decryptedmessageString=new String(decryptedmessageBytes);
        System.out.println("original message:"+message);
        System.out.println("encrypted message:"+encryptedmessage);
        System.out.println("decrypted message:"+decryptedmessageString);

    }
}

 class Rsa {
    BigInteger n;
    BigInteger e;
    BigInteger d;
    public  Rsa(){
        BigInteger p=BigInteger.probablePrime(256,new Random());
        BigInteger q=BigInteger.probablePrime(256,new Random());
        n=p.multiply(q);
        BigInteger phi=(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        e=new BigInteger("65537");
        d=e.modInverse(phi);
    }
    public BigInteger encrypt(BigInteger message){
        return message.modPow(e,n);
    }
    public BigInteger decrypt(BigInteger message){
        return message.modPow(d,n);
    }
}
