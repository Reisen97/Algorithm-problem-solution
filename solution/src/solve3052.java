import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class solve3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> remains = new ArrayList<>();
        String input = "";
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arrayList.add(st.nextToken());
            }
        }

        for (String s : arrayList) {
            int num = Integer.parseInt(s);
            if (remains.contains(num % 42) == false) {
                if (num < 42) {
                    remains.add(num);
                }
                else {
                    remains.add(num % 42);
                }
            }
        }
        System.out.print(remains.size());
    }
}
