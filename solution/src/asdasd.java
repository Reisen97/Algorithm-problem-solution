import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

public class asdasd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> coordinates = new HashMap<>();

        //좌표 배열 입력
        for (int i = 0; i < N; ++i) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt((st.nextToken()));

            if (coordinates.containsKey(x)) {
                ArrayList<Integer> temps = coordinates.get(x);
                temps.add(y);
                coordinates.put(x, temps);
            }
            else {
                ArrayList<Integer> temps = new ArrayList<>();
                temps.add(y);
                coordinates.put(x,temps);
            }
        }

        /*for(int key : coordinates.keySet()){
            if (coordinates.get(key))
                System.out.println("key : " + key);
        }*/
    }
}