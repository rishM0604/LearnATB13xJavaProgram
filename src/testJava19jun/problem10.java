package testJava19jun;

import java.util.Scanner;

public class problem10 {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     double a = sc.nextDouble();
     double b = sc.nextDouble();
    String operatoR = sc.next();

        switch (operatoR){
            case "+" -> System.out.println(a+b);
            case "-" -> System.out.println(a-b);
            case "*" -> System.out.println(a*b);
            case "/" -> System.out.println(a/b);
        }
    }
}
