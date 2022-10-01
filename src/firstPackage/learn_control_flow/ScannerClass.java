package firstPackage.learn_control_flow;

import java.util.Scanner;

public class ScannerClass {


    public static void main(String[] args) {
        ScannerClass sclass = new ScannerClass();
        sclass.greatestNumber();


    }

    void greatestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type value of X below");
        int x = scanner.nextInt();
        System.out.println("Type value of Y below");
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println("x is grater");
        } else if (y > x) {
            System.out.println("Y is greater");
        } else {
            System.out.println("THey are same");
        }

    }




    }




