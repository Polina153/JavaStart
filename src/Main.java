import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* int i = 10;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
                //break;
            }
            i++;
        }
        System.out.println("Цикл завершен");*/
       /* int a = 0;
        do {
            System.out.println("Hello!");
        } while (a > 0);*/
       /* int summ = 0;
        for (int a = 0; a <= 100; a++) {
            summ += a;
        }

        System.out.println("Сумма всех чисел от 1 до 100 (включительно) равна " + summ);*/
        ifMethod();
        switchMethod();
    }

    private static void ifMethod() {
        System.out.println("Enter number from 1 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("1");
        } else if (number == 2) {
            System.out.println("2");
        } else if (number == 3) {
            System.out.println("3");
        } else if (number == 4) {
            System.out.println("4");
        } else if (number == 5) {
            System.out.println("5");
        } else {
            System.out.println("введено число НЕ от 1 до 5!");
        }
    }

    static void switchMethod() {
        System.out.println("Enter number from 1 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1: //if(number ==1)...
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                //case 5, 6, 7:
                //case 10, 11:
                System.out.println("5");
                break;
            default:
                System.out.println("введено число НЕ от 1 до 5!");
        }
    }

}
