package threads;

public class SingleThreadDemo {
    public static void main(String[] args) {
        for (int index = 0; index < 4 ; index++) {
            System.out.println("The value of index to the power of 4 is " + Math.pow(index, 4));
        }

        for (int j = 0; j < 5; j ++) {
            System.out.println("*** The value of j is " + j + "!");
        }
    }
}
