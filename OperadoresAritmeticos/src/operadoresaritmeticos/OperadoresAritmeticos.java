package operadoresaritmeticos;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        int n1 = 3; //operadores aritméticos 
        int n2 = 5;
        float m = (n1 + n2)/2;       
        System.out.println("A média é igual a: " +m);  
        
        int numero = 5; //operadores unários
        int valor = 5 + numero++;
        System.out.println(numero);
        
        int x = 4;  //operadores de atribuição
        x += 2; //x = x + 2
        System.out.println(x);
        
        float v = 8.3f; //arredondamentos
        int ar = (int) round(v);
        System.out.println(ar);
        
        double ale = random(); //random
        int n = (int) (5 + ale * (10-5)); //gera numeros de 5 a 10
        System.out.println(n);
   
    }
}
