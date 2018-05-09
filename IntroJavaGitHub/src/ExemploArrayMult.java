
import javax.swing.JOptionPane;

public class ExemploArrayMult {
    public static void main(String[] args) {
        String nomes[][], leitura, listaNomes = "", listaSobrenomes = "";
        int totalNomes = 0;
        String leu = JOptionPane.showInputDialog(null,"Total de Nomes");
        totalNomes = Integer.parseInt(leu);
        nomes = new String[totalNomes][2];
        for (int lin = 0; lin < nomes.length; lin++) {
            nomes[lin][0] = JOptionPane.showInputDialog(
                    null,"Entre com o nome ["+(lin+1)+"]");
            nomes[lin][1] = JOptionPane.showInputDialog(
                    null,"Entre com o sobrenome ["+(lin+1)+"]");
            listaNomes += nomes[lin][0] + "\n";
            listaSobrenomes += nomes[lin][1] + "\n";
        }
        System.out.println(listaNomes);
        System.out.println(listaSobrenomes);
    }
}
