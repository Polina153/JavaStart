import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*        byte age = 12;
        String name = "Harry Potter";
        System.out.println("Hello, " + name + "!\n" + "You are " + (age + 3));
        age += 3;
        System.out.print(age);*/
        //Создать метод, который принимает кол-во секунд от пользователя,
        // потом выводит в консоль сколько это дней, часов, минут и секунд
        calculateSecondsFromUser();
    }

    private static void calculateSecondsFromUser() {
        System.out.println("Enter amount of seconds: ");
        Scanner sc = new Scanner(System.in);
        int secondsFromUser = sc.nextInt();

        int days = (secondsFromUser / 60 / 60 / 24);
        int hours = (secondsFromUser / 60 / 60) % 24;
        int minutes = (secondsFromUser / 60) % 60;
        int seconds = secondsFromUser % minutes;

        System.out.println("There are " + days + " days");
        System.out.println("There are " + hours + " hours");
        System.out.println("There are " + minutes + " minutes");
        System.out.println("There are " + seconds + " seconds");
    }
}
