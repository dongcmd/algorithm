import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N, M, check;
        Set<Integer> nums = new TreeSet<>();
        N = Integer.parseInt(br.readLine());
        StringTokenizer stn = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(stn.nextToken()));
        }
        
        M = Integer.parseInt(br.readLine());
        stn = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            check = Integer.parseInt(stn.nextToken());
            if(nums.add(check)) {
               bw.write("0\n"); 
               nums.remove(check);
            } else {
                bw.write("1\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}