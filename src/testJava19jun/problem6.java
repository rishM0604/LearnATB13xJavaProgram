package testJava19jun;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input>0) {
            System.out.println(input + " is positive");
        }else if(input<0){
            System.out.println(input + " is negetive");
        }else {
            System.out.println(input + " is zero");
        }

    }
}
