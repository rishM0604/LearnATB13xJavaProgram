package ex_09_switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab087_realSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String browser = sc.next();
        //String browser = args[0];
        browser = browser.toLowerCase();
        switch (browser){
            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println(".............");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge" :
                System.out.println("Excecute the edge code");
                break;
            default:
                System.out.println("No idea which browser is this");

        }

    }
}
