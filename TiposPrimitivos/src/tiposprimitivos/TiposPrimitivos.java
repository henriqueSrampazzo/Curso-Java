package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        
         System.out.print("Digite a notas do aluno: ");
        float nota = teclado.nextFloat();
        
        //System.out.print("A nota é: "+nota); //saida sem quebra de linha
        //System.out.println("A nota é: "+nota); //saida com quebra de linha
        System.out.printf("A nota de %s é %.2f \n", nome,nota);  //saida com formatação
       
        
//conflito de dados
//        int idade =30;
//        String valor = Integer.toString(idade);
//        System.out.println(valor);
        
//        String valor = "30";
//        int idade = Integer.parseInt(valor);
//        System.out.println(idade);
        
    }
}
