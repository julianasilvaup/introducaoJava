public class Aula6 {
  public static void main(String[] args) {
  double[][] valores;
  String marcaModelo[][];
  valores = new double[2][4];
  marcaModelo = new String[3][2];
  double[][] valores2 = new double[2][4];
  String marcaModelo2[][] = new String[3][2];
  valores[1][2] = 3.50;
  valores[0][3] = 7.28;
  marcaModelo[1][0] = "ford";
  marcaModelo[1][1] = "ecosport";
  double valores3[][] = {{ 10, 6, 32, 7.28 },
                         { 15, 16, 3.50, 44}};
  String marcaModelo3[][] = 
  {{"gm", "vectra" },
   { "ford", "ecosport"},
   {"fiat", "stilo"}};
  
double notas[][] = new double[100][4];
for (int linha=0; linha<notas.length; linha++) {
//notas.length:quantidade de linhas
  for(int coluna=0; coluna<notas[linha].length; coluna++) {
  //notas[linha].length: quantidade de coluna por linha
    notas[linha][coluna] = 10;
  }
}
//Exemplo instanciar
String nome = "Juliana";
String nome2 = new String("Juliana");
//Exemplo tamanho
String texto = "teste";
System.out.println(texto.length());
  }
    
}
