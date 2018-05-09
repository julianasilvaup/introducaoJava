
public class Aula4Exercicio2 {
    public static void main(String[] args) {
        int cont1 = 1;
        int cont2 = 6;
        while(cont1 <= 5){
            for (int i = 1; i <= 10; i++) {
                System.out.println(cont1 + " x "+ i + " = "+(cont1*i)+"\t"+
                               cont2 + " x "+ i + " = "+(cont2*i));    
            }
            cont1++;
            cont2++;
            System.out.println("------------\t------------");
        }
    }
}
