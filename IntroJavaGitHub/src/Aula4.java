
import javax.swing.JOptionPane;

public class Aula4 {

public static void exemWhile(){
int num1 = 0;
while( num1 < 10){
    System.out.println("- " +(num1++));  
}
int num2 = 0;
// Errado
  while(num2 < 10 && num2 > -5 && num2 != 10);
  {
      num2 = 11;
      System.out.println(" * " + num2);
  }
  // Correto
  while(num2 < 10 && num2 > -5 && num2 != 10){
      num2 = 11;
      System.out.println(" * " + num2);
  }
 }// fecha exemWhile 

public static void exemDoWhile() {
int num3 = 0, soma = 0;
do{
    num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor?"));
    soma += num3;
}while(num3 > 0);
System.out.println("Soma total: " + soma);
}
public static void exeFor() {
    for(int cont = 0; cont <= 100; cont++ ){
        System.out.println(cont);
    }
}

public static void exemBreak(){
String nomes[] = {"Joao", "Maria","Jose"};
String procura = "Jose";
boolean encontrou = false;
for(int i = 0; i<nomes.length; i++){
  if(nomes[i].equals(procura)){
      encontrou = true;
      break;
  }
  System.out.println("Visitamos este lugar");
}
if(encontrou)
  System.out.println(procura + " encontrado!");
else
  System.out.println(procura + "NAO encontrado");
}

public static void exemContinue(){
String names[] = {"Joao", "Bia", "Pedro", "Joao"};
String procura = "Joao";
int cont = 0;
  for (int i = 0; i < names.length; i++) {
    if(!names[i].equals(procura)){
        continue;
    }
    cont++;
    System.out.println("Encontrei");
  }
System.out.println(cont+" "+procura+" na lista");   
}

public static void exem2Continue(){
int numero = 0;
String saida = "";
  for (numero = 0; numero < 10; numero++) {
      if(numero%2 == 0)
          continue;
      saida += numero + " ";
  }
  JOptionPane.showMessageDialog(null,saida,"Saida", JOptionPane.INFORMATION_MESSAGE);
  System.exit(0);
}


public static void main(String[] args) {
   exem2Continue();
}
}   
