package part1.task1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите 2 любых целых числа: ");
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число:");
            int num1 = scan.nextInt();
            System.out.println("Введите второе число:");
            int num2 = scan.nextInt();
            System.out.println("Введите операцию:");
            String operation = scan.next();
            int result = calc(num1, num2, operation);
            System.out.println("Результат:" + result);
        }
    }

    public static int calc(int num1, int num2, String operation) {
        int result = 0;
        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        } else if (operation.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.print("Error");
        }
        return result;
    }
}


