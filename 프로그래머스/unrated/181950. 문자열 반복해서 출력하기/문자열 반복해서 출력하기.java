import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            answer += str;
        }
        System.out.println(answer);
    }
}