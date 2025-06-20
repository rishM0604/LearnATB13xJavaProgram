package ex_05_JavaBasics;

import java.util.Scanner;

public class ternaryOper3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String result = marks>=90 && marks<=100 ? "A+" : marks>=75 ? "A" : marks >=60 ? "B" : marks >=40 ? "C" : "fail";

        System.out.println(result);

    }

}
