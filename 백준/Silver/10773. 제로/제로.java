import java.util.Stack;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < K; i++) {
            int n = sc.nextInt();
            if(n == 0) 
                stack.pop();
            else
                stack.push(n);
        }
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.print(sum);
        
    }
}