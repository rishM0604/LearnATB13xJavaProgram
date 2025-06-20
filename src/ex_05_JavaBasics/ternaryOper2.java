package ex_05_JavaBasics;

import java.sql.SQLOutput;

public class ternaryOper2 {

    public static void main(String[] args) {

        int a = 19;

        String result = a%2==0 ? "even" : "odd";
        System.out.println(result);

        a=20;

        String resultnew = a%2==0 ? "even" : "odd";

        System.out.println(resultnew);
    }
}
