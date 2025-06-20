package testJava19jun;

import java.util.Scanner;

public class problem12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int input = val;

        int fact = 1;

        if(input==0){
            System.out.println("factorial of "+val+" is: "+1 );
        }else{
        while(input>0){
            fact = fact*input;
            input--;
        }
            System.out.println("factorial of "+val+" is: "+fact );
        }
    }
}
