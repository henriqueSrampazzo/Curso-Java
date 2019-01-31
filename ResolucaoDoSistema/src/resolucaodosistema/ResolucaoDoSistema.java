package resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {

    public static void main(String[] args) {
       
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension resolucao = t.getScreenSize();
        
        System.out.println("A resolução da tela é: ");
        System.out.println(resolucao.toString());
    }
    
}
