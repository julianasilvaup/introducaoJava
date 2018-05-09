
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
Faça um programa em linguagem JAVA que leia cinco grupos de 4 valores inteiros 
(A, B, C, D) e mostre-os na ordem lida. Em seguida, mostre-os em ordem crescente 
e descrescente.
 */
public class Aep3Prog2 {

    public static void main(String[] args) {
        int grupos[][] = new int[5][4];
        int linha = 0;

        for (int i = 0; i < 5; i++) {
            String entrada = JOptionPane.showInputDialog("Digite 4 valores separados por vígula"
                    + ", para criar o grupo " + (i + 1));
            if (entrada.contains(",")) {
                String grupo[] = entrada.split(",");
                for (int j = 0; j < grupo.length; j++) {
                    grupos[linha][j] = Integer.parseInt(grupo[j].trim());
                }
                Arrays.sort(grupos[linha]);
                linha++;
            } else {
                System.out.println("Digite a entrada no seguinte formato 1,5,87,98");
            }
        }
        for (int i = 0; i < grupos.length; i++) {
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.print(grupos[i][j] + "\t");
            }
            System.out.println("");
            
        }

    }

}
