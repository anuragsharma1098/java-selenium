package type_casting;

public class stringbfr {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb1 = new StringBuffer(str);
        sb1.append("!!!");
        System.out.println(sb1);
    }
}
