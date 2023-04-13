import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] baguni = new int[N];
        
        for(int i=0; i<N; i++){
            baguni[i] = i+1;
        }
        
        for(int i=0; i<M; i++){
            int temp;
            int I = sc.nextInt();
            int J = sc.nextInt();
            
            temp = baguni[I-1];
            baguni[I-1] = baguni[J-1];
            baguni[J-1] = temp;
        }
        sc.close();
        
        for(int data : baguni){
            System.out.print(data + " ");
        }
        
        
    }
}