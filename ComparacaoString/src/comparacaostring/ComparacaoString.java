package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        
        String nome1 = "Henrique";
        String nome2 = "Henrique";
        String nome3 = new String("Henrique");
        String res;
        
        res = (nome1.equals(nome3))?"igual":"diferente"; //verifica se o CONTEUDO das variáveis é igual
        
        System.out.println(res);
        
        
    }
    
}
