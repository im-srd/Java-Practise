import java.math.BigInteger;
import java.util.*;
//class RSA1 {
//    private BigInteger n;
//    private BigInteger e;
//    private BigInteger d;
//
//    public RSA1() {
//        BigInteger p = BigInteger.probablePrime(256, new Random()); // p
//        BigInteger q = BigInteger.probablePrime(256, new Random()); // q
//        n = p.multiply(q);                                                  // n=p*q
//        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE)); //phi=(p-1)(q-1)
//        e = new BigInteger("65537");                                    //encryption key
//        d = e.modInverse(phi);                                              //decryption key
//    }
//
//    public BigInteger encrypt(BigInteger message)
//    {
//        return message.modPow(e, n);
//    }
//
//    public BigInteger decrypt(BigInteger message)
//    {
//        return message.modPow(d, n);
//    }
//}
//
public class RSA {
    public static void main(String[] args) {
        System.out.println(("a"));
//        RSA1 rsa = new RSA1();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Message");
//        String message=sc.nextLine();
//
//        byte[] messageBytes = message.getBytes();
//        BigInteger messageInt = new BigInteger(messageBytes);
//
//        BigInteger encryptedMessage = rsa.encrypt(messageInt);
//        BigInteger decryptedMessage = rsa.decrypt(encryptedMessage);
//
//        byte[] decryptedMessageBytes = decryptedMessage.toByteArray();
//        String decryptedMessageString = new String(decryptedMessageBytes);
//
//        System.out.println("Original message: " + message);
//        System.out.println("Encrypted message: " + encryptedMessage);
//        System.out.println("Decrypted message: " + decryptedMessageString);
    }
}


