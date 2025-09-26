import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Main {
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        LOOP : 
        for(int i = 0; i < T; i++) {
            String line = br.readLine();
            cnt = 0;
            for(char ch : line.toCharArray()) {
                if(ch == '(') {
                    cnt++;
                } else {
                    if(--cnt < 0) {
                        bw.write("NO\n");
                        continue LOOP;
                    }
                }
            }
            if(cnt == 0) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}