
public class Main {
    public static void main(String[] args) {
        char ex3 = '\u263A';
        char ex2_1 = '\u2639';
        String ex2_2 = "\uD83D\uDE16";
        String ex2_3 = "\ud83d\ude0d";
        System.out.println("3 емодзі:  " + ex2_1 + "  " +ex2_2 + "  " + ex2_3 );
        System.out.println("Всім привіт" + ex3);
        StringBuffer sb=new StringBuffer("Hello world");

        sb.replace(6,7,"W");
        System.out.println(sb);
    }
}
