public interface Runnable {

    boolean canRun();

    default void run(int distance){
        System.out.println("It is running!");
    }
}
