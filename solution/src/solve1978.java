import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class solve1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int isCount = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp == 2) {
                ++isCount;
            }
            else if (temp % 2 != 0) {
                for (int i = temp - 1; i > 1; --i) {
                    if (temp % i == 0) {
                        break;
                    }
                    if (i == 2) {
                        ++isCount;
                    }
                }
            }
        }
        System.out.print(isCount);
    }
}
