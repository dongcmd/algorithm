import java.util.Scanner;
class Main {
    static public void main(String[] args) {
        int T, a, b;
        Scanner sc = new Scanner(System.in);
        
        T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            int data = 1;
            for(int j = 0; j < b; j++) {
                data = data * a % 10;
            }
            if(data == 0) data = 10;
            System.out.println(data);
        }
    }
}