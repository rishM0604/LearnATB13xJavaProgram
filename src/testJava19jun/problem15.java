package testJava19jun;

public class problem15 {

    public static void main(String[] args) {



    for(int i=2;i<=100;i++){           // 1 is not a prime number so iterating from 2.

        boolean isPrimeNo = true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                isPrimeNo = false;
                break;
            }
        }

        if(isPrimeNo){
            System.out.print(i+" ");
        }


    }

    }
}
