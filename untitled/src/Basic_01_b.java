import java.util.Scanner;

public class Basic_01_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
    }
}
