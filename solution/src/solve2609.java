import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class solve2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double copyA = A;
        double copyB = B;
        double GCD = A;

        while (copyB != 0) {
            double R = copyA % copyB;
            GCD = copyB;
            copyA = copyB;
            copyB = R;
        }

        double smallA = A / GCD;
        double smallB = B / GCD;

        System.out.println((int)GCD);
        System.out.println((int)(GCD * smallA * smallB));
    }
}
//1.유클리드 호제법 참고
//2 최대공약수와 최소공배수의 관계 참고
//https://mathbang.net/206