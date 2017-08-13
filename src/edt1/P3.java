package edt1;
import java.util.Scanner;

public class P3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String line = scan.nextLine();
        
        line = line.toUpperCase();
        char[] c = line.toCharArray();
        int[] n = new int[line.length()];
        
        for(int i = 0; i < line.length(); i++){
            n[i] = c[i] - 64;
        }
        
        for(int i = 0; i < line.length(); i++){
            System.out.println(n[i]);
        }
        
        int r = 0;
        for(int i = 0; i < line.length(); i++){
            r = r + (n[i]);
        }
        
        System.out.println(r);        
    }
}
