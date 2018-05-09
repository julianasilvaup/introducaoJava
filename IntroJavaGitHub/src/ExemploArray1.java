public class ExemploArray1 {
public static void main(String[] args) {
   int notas[] = {100, 97, 88, 46, 79};
   float soma = 0;
    for (int indice = 0; indice < notas.length; indice++) {
        System.out.print(
                "[" + notas[indice] + "]");
        soma += notas[indice];
    }
    System.out.println("\n A média é "+ (soma/notas.length));
}
    
}
