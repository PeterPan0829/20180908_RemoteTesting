import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_01_a {
        public static void main(String[] args) throws IOException {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("請輸入字串:");
            String text = buf.readLine();
            String s = new StringBuffer(text).reverse().toString();
            System.out.println(s);
        }
}

