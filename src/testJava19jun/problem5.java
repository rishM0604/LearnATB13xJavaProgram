package testJava19jun;

public class problem5 {

    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;

        System.out.println(a*b+b);  // precedance of * is higher than + so it will multiply first then will add the numbers

        double sum = a+b;
        System.out.println(sum);

        int sumN = a+(int)b;
        System.out.println(sumN);
    }
}
