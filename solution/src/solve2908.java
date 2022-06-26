import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class solve2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        ArrayList<String> arrayList = new ArrayList<>();
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arrayList.add(st.nextToken());
            }
        }
        int max = 0;
        for (String s : arrayList) {
            StringBuffer sb = new StringBuffer(s);
            int reverse = Integer.parseInt(sb.reverse().toString());
            if (max < reverse) {
                max = reverse;
            }
        }
        System.out.print(max);
    }
}
