import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Turret {
    int x, y, r;
}
public class Main {
    public static void main(String[] args) throws IOException {
        int T;
        //      0 , 1 , 2 , 3 , 4 , 5
        // int x1, y1, r1, x2, y2, r2;
        double range;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stn;
        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            Turret t1 = new Turret();
            Turret t2 = new Turret();
            stn = new StringTokenizer(br.readLine());
            t1.x = Integer.parseInt(stn.nextToken());
            t1.y = Integer.parseInt(stn.nextToken());
            t1.r = Integer.parseInt(stn.nextToken());
            t2.x = Integer.parseInt(stn.nextToken());
            t2.y = Integer.parseInt(stn.nextToken());
            t2.r = Integer.parseInt(stn.nextToken());
            //1 1 1 - 1 1 5
            range = Math.sqrt(Math.pow(t1.x - t2.x, 2) + Math.pow(t1.y - t2.y, 2));
            // 두 점의 거리
            
            if(t1.x == t2.x && t1.y == t2.y) {
                if(t1.r == t2.r) {
                    bw.write("-1\n");
                } else {
                    bw.write("0\n");
                }
            } else {
                if(range == t1.r + t2.r || range == Math.abs(t1.r - t2.r)) {
                    bw.write("1\n");
                } else if(range > t1.r + t2.r || range < Math.abs(t1.r - t2.r)) {
                    bw.write("0\n");
                } else {
                    bw.write("2\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}