package threads;

public class MultiThreadDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            for (int index = 0; index < 5 ; index++) {
                System.out.println("The value of " + index + " to the power of 4 is " + index * index * index * index);
            }
        });

        thread.start();

        for (int j = 0; j < 5; j ++) {
            System.out.println("*** The value of j is " + j + "!");
        }
    }
}
