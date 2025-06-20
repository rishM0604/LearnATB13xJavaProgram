package testJava19jun;

public class problem13 {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            System.out.println("table of "+i+":");
            for (int j=1;j<=10;j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
        }
    }
}
