package testJava26jun;

public class prob2 {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";

        System.out.println("== : "+ str1==str3);
        System.out.println("equals() :"+str1.equals(str2));
        System.out.println("equalsIgnoreCase() :"+str2.equalsIgnoreCase(str3));
        System.out.println("compareTo() :"+str1.compareTo(str2));
    }
}
