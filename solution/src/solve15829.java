import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class solve15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String plain = br.readLine();
        int[] nextPlain = new int[L];
        double hash = 0;
        double R = 1;

        for (int i = 0; i < nextPlain.length; ++i) {
            int temp = plain.charAt(i) - 96;
            hash += (temp * R) % 1234567891;
            R = (R * 31) % 1234567891;
            nextPlain[i] = temp;
        }

        System.out.printf("%.0f", hash % 1234567891);
    }
}
// 오버플로우가 나지않게 소수로 나눠주는것이 포인트
// Math.pow() 함수 사용 하지 말고 직접 제곱