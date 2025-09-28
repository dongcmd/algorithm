import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 조합 DP 테이블 (n, k ≤ 30)
        int[][] dp = new int[31][31];

        // 파스칼 삼각형 형태로 dp 채우기
        for (int n = 0; n <= 30; n++) {
            for (int k = 0; k <= n; k++) {
                if (k == 0 || k == n) dp[n][k] = 1;      // nC0 = 1, nCn = 1
                else dp[n][k] = dp[n-1][k-1] + dp[n-1][k]; // 점화식
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 서쪽 사이트 수
            int M = Integer.parseInt(st.nextToken()); // 동쪽 사이트 수
            sb.append(dp[M][N]).append("\n"); // M개 중 N개를 고르는 경우
        }

        System.out.print(sb);
    }
}
