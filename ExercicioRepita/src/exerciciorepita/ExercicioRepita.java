package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {

        int n, s = 0;

        int tv = 0;
        int par = -1;
        int impar = 0;
        int maior = 0;
        float media = 0;

        do {

            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero:  (valor 0 interrompe)"));

            s+=n;
            
            if (n != 0) { //total de valores 

                tv++;

            }
            if (n % 2 == 0) { //par

                par++;

            }
            if (n % 2 == 1) { //impar

                impar++;

            }
            if (n > 100) {

                maior++;
            }
            
            media = s/tv;
            

        } while (n != 0);

        JOptionPane.showMessageDialog(null, "<html>resultado:<br> ---------------------- "+ 
                "<br> Somatório: " + s + 
                "<br> Total de Valores: " + tv +
                "<br> Total Pares: " + par +
                "<br> Total Impares: " + impar +
                "<br> Acima de 100: " + maior +
                "<br> Média dos valores: " + media +
                
                "</html>");

    }

}
