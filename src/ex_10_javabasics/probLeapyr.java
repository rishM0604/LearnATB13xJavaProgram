package ex_10_javabasics;

import java.util.Scanner;

public class probLeapyr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("It is a leap yr");
        }else{
            System.out.println("It is not a leap yr");
        }
    }

}
