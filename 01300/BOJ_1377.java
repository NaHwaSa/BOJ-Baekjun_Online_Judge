import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;

import static java.util.Arrays.sort;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1 << 16);

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    private void solution() throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[i][1] = Integer.parseInt(br.readLine());
        }
        sort(arr, Comparator.comparingInt(o -> o[1]));
        int ans = 0, i = 0;
        for (int[] cur : arr) ans = Math.max(ans, cur[0]-i++);
        System.out.println(ans+1);
    }
}
