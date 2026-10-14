class Cat extends Animal{

    public Cat(String name, int age, int legs, boolean tail) {
        super(name, age, legs, tail);
    }

    @Override
    void voice() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Main info: " + name + " " + age + " " + legs + " " + tail;
    }
}
