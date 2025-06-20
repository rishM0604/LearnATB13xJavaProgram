package testJava19jun;

public class problem2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a = 10;
        int b = 5;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a%b);
        System.out.println(a/b);
        System.out.println(a*b);

        a=5;
        System.out.println(a);  // updated value of a will be 5.
        a+=3;
        System.out.println(a); // latest value of a is 5+3=8
        a-=3;
        System.out.println(a);  // now value of a is 8 then 8-3=5
        a*=3;
        System.out.println(a);  // a=5; 5*3 =15, the updated value of a is 15
        a/=3;
        System.out.println(a); // 15/3 = 5


    }
}
