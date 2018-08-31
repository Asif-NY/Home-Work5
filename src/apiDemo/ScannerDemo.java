package apiDemo;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println(scanner.hasNext());

        System.out.println("Please Enter Your First Number");
        int num1 = scanner.nextInt();
        System.out.println("Please Enter Your Second Number");
        int num2 = scanner.nextInt();
        System.out.println("You have entered total number of:"+(num1+num2));
    }
}
