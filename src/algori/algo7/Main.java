package algori.algo7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        is_prime(scan.nextInt());
    }


    public static void is_prime(int number) {
        if(number <2 ) {
            System.out.println("소수가 아닙니다.");
            return;
        }

        if(number == 2) {
            System.out.println("소수 입니다.");
            return;
        }

        for(int i=2;i<=Math.sqrt(number); i++) {

            if(number % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }

        System.out.println("소수입니다.");
        return;



    }
}
