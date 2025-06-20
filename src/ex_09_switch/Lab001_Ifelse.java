package ex_09_switch;

import java.util.Scanner;

public class Lab001_Ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if(a==b && b==c){
            System.out.println("Triangle is equilateral");
        }else if(a==b || b==c || c==a ){
            System.out.println("Triangle is isosceles");
        }else{
            System.out.println("Triangle is scalene");
        }
    }
}
