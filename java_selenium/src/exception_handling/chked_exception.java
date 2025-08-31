package exception_handling;

public class chked_exception {
    public static void main(String[] args) {

        System.out.println("Execution started");
        System.err.println("Waiting for 5 seconds...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
            System.out.println(e.getMessage());
        }
        System.out.println("Execution completed");
    }
}
