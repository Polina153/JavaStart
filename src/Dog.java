class Dog extends Animal implements Swimmable {
    public Dog(String name, int age, int legs, boolean tail) {
        super(name, age, legs, tail);
    }

    @Override
    void voice() {
        System.out.println("Guff");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
