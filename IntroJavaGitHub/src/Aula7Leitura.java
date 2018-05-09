
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Aula7Leitura {
 public static void main(String[] args) {
  InputStreamReader ent = 
          new InputStreamReader(System.in);
  BufferedReader ler = new BufferedReader(ent);
  String s;
  System.out.println("Digite um texto:");
  try {
    s = ler.readLine();
    System.out.println("Voce digitou: "+ s);
  } catch (IOException ex) {
    // Se acontecer um erro de leitura, imprime
    System.out.println("Erro de leitura: "+ ex);
  }
 }
}
