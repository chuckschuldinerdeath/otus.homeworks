

import java.util.Random;
import java.util.Scanner;

public class Homework{
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("Введите число от 1 до 5: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                printHello("");
                break;
            case 2:
                checkSum(random.nextInt(), random.nextInt(), random.nextInt());
                break;
            case 3:
                selectColor();
                break;
            case 4:
                compareNum();
                break;
            case 5:
                addOrSubtractAndPrint(random.nextInt(), random.nextInt());
                break;
            default:
                System.out.println("ERROR!!!");
        }
    }

    public static void printHello(String word) {
        System.out.println("Hello\n" + "world\n" + "fron\n" + "java\n");
    }

    public static void checkSum(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public static void selectColor() {
        int numcolor = (int) (Math.random() * 30);
        if (numcolor < 10 & numcolor >= 0) {
            System.out.println("Красный");
        } else if (numcolor >= 10 & numcolor <= 20) {
            System.out.println("Желтый");
        } else if (numcolor > 20) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Ошибка");
        }
    }

    public static void compareNum() {
        Random random = new Random();

        int a = random.nextInt();
        int b = random.nextInt();

        System.out.println(a);
        System.out.println(b);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta) {

        Random random = new Random();
        boolean increment = random.nextBoolean();
        if (increment == true) {
            int res1 = initValue + delta;
            System.out.println("true: " + res1);
        } else {
            int res2 = initValue - delta;
            System.out.println("false: " + res2);
        }
    }
}





