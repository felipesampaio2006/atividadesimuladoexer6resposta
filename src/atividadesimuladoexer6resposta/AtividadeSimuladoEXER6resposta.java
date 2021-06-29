package atividadesimuladoexer6resposta;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class AtividadeSimuladoEXER6resposta {
    public static void main(String[] args) {
        int numero, cont115;
        Scanner ler = new Scanner(System.in);
        cont115 = 0;
        numero = ler.nextInt();
        while(numero >= 0) {
            if(numero >= 1 && numero <= 15) {
                cont115++;
            }//fim do if
            numero = ler.nextInt();
        }//fim do while
    }//fim do string
    
}//fim da atividade
