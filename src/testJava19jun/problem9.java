package testJava19jun;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }


}
