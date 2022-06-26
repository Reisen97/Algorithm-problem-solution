import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class solve10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] alphabets = new char[26];
        int ascii = 97;

        for (int i = 0; i < alphabets.length; ++i) {
            alphabets[i] = (char)ascii;
            ++ascii;
        }

        String input = "";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        while (input.equals("")) {
            input = br.readLine();
        }

        for (int i = 0; i < input.length(); ++i) {
            if (hashMap.containsKey(input.charAt(i)) == false) {
                hashMap.put(input.charAt(i), i);
            }
        }

        for (char c : alphabets) {
            if (hashMap.containsKey(c)) {
                sb.append(hashMap.get(c));
                sb.append(" ");
            }
            else {
                sb.append(-1);
                sb.append(" ");
            }
        }

        System.out.print(sb);
    }
}