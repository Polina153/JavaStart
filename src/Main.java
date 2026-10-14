public class Main {

    public static void main(String[] args) {

        //Animal animal1 = new Animal("new name",0, 18, true);
        Cat cat1 = new Cat("Barsik", 4, 4, true);
        System.out.println(cat1);
        System.out.println(cat1.equals(cat1));
        System.out.println(cat1.hashCode());
        System.out.println(cat1.toString());
        cat1.printInfo();
        System.out.println(cat1.getClass());
        cat1.voice();

        Dog dog1 = new Dog("Tuzik", 10, 4, true);
        dog1.printInfo();
        dog1.voice();
        dog1.swim();
    }
}
