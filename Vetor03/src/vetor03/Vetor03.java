package vetor03;

import java.util.Arrays;

public class Vetor03 {
    
    public static void main(String[] args) {
        
        double v[] = {3.5, 2.75, 9, -4.5};
        
        Arrays.sort(v); //organiza o vetor
        
        for(double valor: v){
            
            System.out.print(valor + " ");
        }
        
    }
    
}
