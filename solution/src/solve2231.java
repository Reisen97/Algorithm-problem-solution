import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

public class solve2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<Integer> creators = new ArrayList<>();
        int originN = Integer.parseInt(input);
        int N = originN;
        while (N > 0) {
            int M = N;
            char[] digits = String.valueOf(M).toCharArray();
            for (char c : digits) {
                M += c - 48;
            }
            if (M == originN) {
                creators.add(N);
            }
            --N;
        }

        int min = 0;
        if (creators.isEmpty()) {
            System.out.print(0);
        }
        else {
            min = creators.get(0);
            for (int i : creators) {
                if (min > i) {
                    min = i;
                }
            }
            System.out.print(min);
        }
    }
}