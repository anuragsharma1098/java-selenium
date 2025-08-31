package exception_handling;

public class except {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("String is null");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution completed");
        }
    }
}