package exception_handling;

public class throws_exception {
    public static void main(String[] args) throws InterruptedException, Exception {

        System.out.println("Execution started");
        System.err.println("Waiting for 5 seconds...");

        Thread.sleep(5000);

        System.out.println("Execution completed");
    }
}
