import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class solve2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>();
        int[] numCounters = new int[10];
        String input = "";
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            if (st.hasMoreTokens()) {
                arrayList.add(st.nextToken());
            }
        }
        int result = 1;
        for (String s : arrayList) {
            result *= Integer.parseInt(s);
        }

        String numValue = String.valueOf(result);
        char[] digits = numValue.toCharArray();

        for (int i : digits) {
            int index = Character.getNumericValue(i);
            numCounters[index] += 1;
        }

        for (int i : numCounters) {
            sb.append(i);
            sb.append(System.getProperty("line.separator"));
        }

        System.out.print(sb);
    }
}
