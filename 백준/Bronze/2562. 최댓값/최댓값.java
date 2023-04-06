import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        
        int max = array[0];
        int index = 1;
        
        for(int i=0; i<array.length; i++){
            if(array[i] > max ) {
                max = array[i];
                index = i+1;
            }
        }
        
        System.out.println(max +" " + index);
        
        
    }
}