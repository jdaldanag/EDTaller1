package edt1;
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        
        int n = scan.nextInt();
        int[] numbers = new int[n];
        
        for(int i = 0; i < n; i++){
            numbers[i] = scan.nextInt();
        }       
        
        int t = scan.nextInt();
        
        for(int i = 0; i < t; i++){
            
            int s = scan.nextInt();
            int r = 0;
            
            for(int j = 0; j < n; j++){
                if(s == numbers[j]){
                    r++;
                }
            }
            
            if(r == 0){
                System.out.println("NOT PRESENT");
            }
            else{
                System.out.println(r);
            }
        } 
    }   
}
