package edt1;
import java.util.Scanner;

public class P2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers;
        
        int t = scan.nextInt();
        
        for(int i = 0; i < t; i++){
            
            int n = scan.nextInt(); 
            numbers = new int[n];
            
            for(int j = 0; j < n; j++){
                numbers[j] = scan.nextInt();
            }
            
            boolean r = true;
            for(int j = 0; j < n; j++){
                if(numbers[j] != j+1){
                    r = false;
                }
            }
            
            if(r){
                System.out.println("inverse");
            }
            else{
                System.out.println("not inverse");
            }
        }
        
    }
}
