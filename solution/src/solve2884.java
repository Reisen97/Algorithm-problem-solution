import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class solve2884 {
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

        int hour = Integer.parseInt(inputs.get(0));
        inputs.remove(0);
        int minute = Integer.parseInt(inputs.get(0));

        if (minute > 45) {
            minute -= 45;
        }
        else {
            minute += (30-45) * -1;
            if (hour == 0) {
                hour = 23;
            }
            else {
                hour -= 1;
            }
        }

        if (minute >= 60) {
            minute = 0;
            if (hour == 23) {
                hour = 0;
            }
            else {
                hour += 1;
            }
        }
        System.out.print(hour + " " + minute);
    }
}
