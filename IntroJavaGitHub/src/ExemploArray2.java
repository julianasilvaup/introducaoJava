public class ExemploArray2 {
public static void main(String[] args) {
   String nomes[] = {"João","José","da Silva","Xavier"};
    System.out.println("Tamanho do vetor criado = " + nomes.length);
    for (int indice = 0; indice < nomes.length; indice++) {
        System.out.println(
                "Valor da posição [" + indice + "] é: " + nomes[indice]);
    }
}    
}
