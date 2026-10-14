public class Main {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Denis");
        myArrayList.add("Masha");
        myArrayList.add("Rita");
        myArrayList.add("Oleg");
        myArrayList.add("Kate");
        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println(myArrayList.getSize());
        myArrayList.remove("Denis");
        System.out.println();
        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println(myArrayList.getSize());
        //Animal animal1 = new Animal("new name",0, 18, true);
        /*Cat cat1 = new Cat("Barsik", 4, 4, true);
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
        System.out.println(dog1.canRun());
        dog1.run(150);
        EgyptCat cat2 = new EgyptCat("Kleopatra", 9, 4, true);
        cat2.printInfo();

        Animal [] animals = new Animal[3];
        System.out.println(animals.length);
        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = dog1;
        for (Animal animal: animals){
            System.out.println(animal);
        }*/
        //System.out.println(animals);
    }
}
