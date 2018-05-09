public class Aula3Exemplos {
public static void main(String[] args) {
int num1 = 8;
if (num1 >= 10){
    System.out.println("Numero maior ou igual a 10");
}else{
    System.out.println("Numero menor que 10");
}
// Estruturas aninhadas
int nota = 70;
if(nota >= 90){
    System.out.println("Conceito A");
}else{
    if(nota >= 80){
        System.out.println("Conceito B");
    }else{
        if(nota >= 70){
            System.out.println("Conceito C");
        }else{
            System.out.println("Insuficente");
        }
    }
}

// Estruturas aninhadas 2
int nt = 70;
if(nt > 90){
    System.out.println("Conceito A");
}else if(nt > 80){
    System.out.println("Conceito B");
}else if(nt >= 70){
    System.out.println("Conceito C");
}else{
    System.out.println("Insuficente");
}

// Operador Ternário
System.out.println(nt >=7 ? "Aprovado":"Reprovado");

int opcao = 2;
switch(opcao){
    case 1:
        System.out.println("UM");
    case 2:
        System.out.println("DOIS");
    default:
        System.out.println("Opcional");
}
int opc = 2;
switch(opc){
    case 1:
        System.out.println("UM");
        break;
    case 2:
        System.out.println("DOIS");
        break;
    default:
        System.out.println("Opcional");
}
int a = 10, b =5, c =2, d=3, e=1, f=5, g=7, h=2, i=2;

System.out.println(" - " + (a/b^c^d-e+f-g*h+i));
System.out.println(" - " + (3*10*2/15-2+4^2^2));
System.out.println(" - " + (a^b*c/d-e+f^g-h++));
    }
}
