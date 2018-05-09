
import javax.swing.JOptionPane;

public class ExemploString {
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog(null,"Digite o nome 1");
        String nome2 = JOptionPane.showInputDialog(null,"Digite o nome 2");
        if(nome1 == nome2){
            System.out.println("O objeto referenciado por nome1 [" + 
                    nome1 + "] e por nome2 [" + 
                    nome2 + "] eh o mesmo!\n");
        }else{
            System.out.println("O objeto referenciado por nome1 [" + 
                    nome1 + "] e por nome2 [" + 
                    nome2 + "] sao diferentes!\n");
        }
   
    }
    
}
