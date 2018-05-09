
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
Escreva uma aplicação que receba do usuário uma frase no seguinte formato 
N-N-N-...-N-N-N (representando por números nteiros separados por hífen), extraia 
esses números desta frase e crie e alimente um vetor de tamanho exato a quantidade 
de números. De posse desses números, coloque-os em ordem decrescente no vetor.

Exemplo de entrada: "2-5-3-1-0";
Exemplo de saída: 5-3-2-1-0
*/
public class Aep3Prog{
   public static void main(String args[]){
       String entrada = JOptionPane.showInputDialog(null, "Digite uma sequência de "
               + "numeros separados por '-'"
               + "\n Exemplo: 4-36-9-1-8");
       String registro = entrada;
       int posicao = 0;
       int digitados[] = new int[1000];
       int hifen = entrada.indexOf('-');
       
       while(hifen != -1 ){
           String novo = entrada.substring(hifen+1);
           System.out.println("Posicao " + posicao + " ["+ entrada.substring(0, hifen)+"]");
           digitados[posicao] = Integer.parseInt(entrada.substring(0, hifen));
           entrada =  novo;
           hifen = entrada.indexOf('-');
           if (hifen == -1){
               posicao++;
               System.out.println("Posicao " + posicao + " ["+ entrada+"]");
               digitados[posicao] = Integer.parseInt(entrada);
           }else{
               posicao++;
           }
           
       }
       //carrega array
       int exato[] =  new int[posicao+1];
       for (int i = 0; i < exato.length; i++) {
           exato[i] = digitados[i];
       }
       //ordena
       Arrays.sort(exato);
       System.out.print("Ordenado: ");
       for (int i = 0; i < exato.length; i++) {    
           System.out.print(" - " + exato[i]);
      }
       System.out.println("");
   }
}
