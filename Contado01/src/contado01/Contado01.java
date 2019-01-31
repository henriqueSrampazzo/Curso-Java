package contado01;

public class Contado01 {

    public static void main(String[] args) {

        int cc = 1;

        while (cc < 10) { 

            cc++;
            
            if(cc == 5 || cc == 7 || cc==9){
                
                continue; //intorrompe o fluxo natual e volta ao while
                
            }
            
            if(cc == 7){
                
                break; //intorrompe o fluxo natual e vai para o fim do programa
            }

            System.out.println("Cambalhota " + (cc));
        }
    }
}
