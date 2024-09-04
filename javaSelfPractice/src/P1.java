import java.util.Arrays;

public class P1 {
    public static void main(String args[])
    {
        System.out.print('s');
        System.out.print('h');
        System.out.print('y');
        System.out.print('a');
        System.out.println('m');
        System.out.println("shyam");
        // sout k baad TAB press krne se System.out.println aajata hai

        /* PRIMITIVE Types
        * byte - 1 byte [-127 to 128]
        * short - 2 bytes
        * int - 4 bytes
        * float - 4 bytes
        * double - 8 bytes
        * char - 2 bytes
        * boolean - 1 byte
        *
        * NON-PRIMITIVE Types
        * String
         -> Strings are immutable - can't change
          Methods :
            eg ; String name = "shyam ranjan dubey";
            * name.charAt(6);
            * name.length();
            * name2 = name.replace('a','b') jha jha 'a' hai wha 'b' hojaega
            * name.substring(0,6); O/P : shyam
        * Arrays
         -> collection of same data types
         -> if no value is given -> 0 assigned by-default
          Methods :
            eg ; int[] marks = new int[5];  Aise declare karte hai
            * marks.length();
            * Arrays.sort();
          *
        * */
        String fn = "Shyam ";
        String ln = "Dubey";
        String fullname = fn + ln;
        System.out.println("Name is : "+fullname); // cannot use comma("Name is",fullname)
        float pi= 3.14F;  // float pi = 3.14;  --> ERROR

        int [] a = new int[5];
        a[0] = 560;
        a[1] = 90;
        a[2] = 60;
        a[3] = 30;
        a[4] = 40;

        int []b = {8,3,7};

        System.out.println(a[0]);
        Arrays.sort(a); // Sort kr dega
        System.out.println(a[0]);
    }
}
