class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
        System.out.printf("Еда уменьшилась на %d \n", n);
    }

    void info() {
        System.out.println("plate: " + food);
    }
}