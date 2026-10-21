public class Main {

    public static void main(String[] args) {

        /*DaysOfWeek today = DaysOfWeek.WEDNESDAY;
        System.out.println("Сегодня: " + today);

        if (today.isWeekend()) {
            System.out.println("Сегодня выходной!");
        } else {
            System.out.println("Сегодня рабочий день.");
        }

        DaysOfWeek tomorrow = today.nextDay();
        System.out.println("Завтра: " + tomorrow);
        System.out.println();
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println("День: " + day);
        }*/

        /*String s = "cat";
        String ss = "cat";
        System.out.println(s == ss); // true
        s = "dog";
        System.out.println(ss);
        System.out.println(s == ss); // false

        String s1 = "hello";
        String s2 = " world";
        String s3 = "hello world";
        String s4 = s1 + s2; // Конкатенация в runtime создает НОВЫЙ объект в куче
        String s5 = "hello" + " world"; // Конкатенация констант оптимизируется компилятором

        System.out.println(s3 == s4); // false! s4 - новый объект
        System.out.println(s3 == s5); // true! Компилятор сделал их одной константой*/

        Cat cat = new Cat("Barsik", 15);
        System.out.println("Cat has appetite: " + cat.getAppetite());
        Plate plate = new Plate(20);
        plate.info();
        System.out.println("Cat is full: " + cat.isFull());
        cat.eat(plate);
        System.out.println("Cat is full: " + cat.isFull());
        System.out.println("Cat has " + cat.getAppetite() + " appetite");
        plate.info();
    }
}
