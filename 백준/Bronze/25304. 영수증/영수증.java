import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int bil = sc.nextInt();
        int many = sc.nextInt();
        
        for(int i=0; i<many; i++){
            int price = sc.nextInt();
            int count = sc.nextInt();
            
            bil = bil -(price*count);
        }
        
        if(bil == 0 ) System.out.println("Yes");
        else System.out.println("No");
    }
}