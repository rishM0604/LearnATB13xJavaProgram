package ex_10_javabasics;

import java.util.Scanner;

public class probGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numScore = sc.nextInt();

        if(numScore>=90 && numScore<=100){
            System.out.println("A");
        } else if (numScore>=80 && numScore<=89) {
            System.out.println("B");
        }else if (numScore>=70 && numScore<=79) {
            System.out.println("C");
        }else if (numScore>=60 && numScore<=69) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }
}
