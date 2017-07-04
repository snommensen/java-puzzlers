package hellogoodbye;

public class HelloGoodbye2 {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> System.out.println("Goodbye world")));
        System.exit(0);
    }
}

