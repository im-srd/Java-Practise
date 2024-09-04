public class StringExample {
    public static void main(String args[]){
        String str1 = new String("Java"); // CPM and outside CPM dono me object bana rha
        String str2 = "Java"; // Direct CPM me object bana rha
//        String str3 = str2;
//        String str3 = str1.intern(); // intern() CPM k andar wala memory fetch kar rha
        String str3 = str1; // CPM k bahar wala memory fetch kr rha
        System.out.println("Address of str1 : "+str1.hashCode());
        System.out.println("Address of str1 : "+str1.intern().hashCode()); // to fetch from CPM use intern()
        System.out.println("Address of str2 : "+str2.hashCode());
        System.out.println("str1 == str2 :"+(str1==str2));
        System.out.println("str2 == str3 :"+(str2==str3));
    }
}
