import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class solve2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int[] cards = new int[N];

        for (int i = 0; i < N; ++i) {
            if (st.hasMoreTokens()) {
                cards[i] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;

        for (int i = 0; i < cards.length; ++i) {
            for (int j = 0; j < cards.length; ++j) {
                for (int t = 0; t < cards.length; ++t) {
                    if (t != j && t != i && j != i) {
                        int temp = cards[t] + cards[j] + cards[i];
                        if (max < temp && temp <= M) {
                            max = temp;
                        }
                    }
                }
            }
        }

        System.out.print(max);
    }
}