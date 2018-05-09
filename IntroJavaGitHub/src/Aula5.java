public class Aula5 {
  public static void main(String[] args) {
  // Exemplos boolean
  boolean var1 = Boolean.valueOf("true");
  boolean var2 = Boolean.valueOf("False");
  boolean var3 = Boolean.valueOf("yes");
  
  System.out.println("Boolean.valueOf('true')" + var1);
  System.out.println("Boolean.valueOf('False')" + var2);
  System.out.println("Boolean.valueOf('yes')" + var3);
  //Exemplos Byte, Short, Integer e Long
  int inteiro = Integer.parseInt("10");
  long longo = Long.parseLong("105");
  int min = Integer.MIN_VALUE; 
  byte bMax = Byte.MAX_VALUE;
  
  int notas[];
  notas = new int[10];
  String alunos[] = new String[15];
  String nomes[] = {"Alexandre", "Maria", "Jose"};
  double salarios[] = {1500, 754.50, 412.00};
  float vet[]={2.5f,3.4f,7.8f,10,9.1f};
      System.out.println("--"+ vet[1]);
      
  double valores[]= new double[1000];
  for (int x = 0; x < valores.length; x++) {
    valores[x] = x*2;
  }
  }
}
