import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] baguni = new int[N];

		for (int i = 0; i < M; i++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			int K = sc.nextInt();

			for (int k = I - 1; k < J; k++) {
				baguni[k] = K;
			}
		}
		
		sc.close();
		for(int data : baguni) {
			System.out.print(data + " ");
		}

	}

}
