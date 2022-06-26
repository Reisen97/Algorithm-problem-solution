import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

public class solve2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int range = 1;
        int count = 1;
        int current = 1;
        while (current != target) {
            if (current == range) {
                range += 6 * count;
                ++count;
            }
            ++current;
        }
        System.out.print(count);
    }
}