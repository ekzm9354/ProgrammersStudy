import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int longN = N/4;
        for(int i=1; i<=longN; i++){
            System.out.println("long");
        }
            System.out.println("int");
    }
}