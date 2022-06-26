import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class solve10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        ArrayList<String> inputs = new ArrayList<String>();

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                inputs.add(st.nextToken());
            }
        }

        inputs.remove(0);
        int x = Integer.parseInt(inputs.get(0));
        inputs.remove(0);

        for (String s : inputs) {
            int a = Integer.parseInt(s);
            if (x > a) {
                sb.append(a);
                sb.append(" ");
            }
        }

        System.out.print(sb);
    }
}

