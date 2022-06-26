import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class solve1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            if (st.hasMoreTokens()) {
                String origin = st.nextToken();
                if (origin.equals("0")) {
                    break;
                }
                StringBuffer sb = new StringBuffer(origin);
                String reverse = sb.reverse().toString();
                if (origin.equals(reverse)) {
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
            }
        }
    }
}