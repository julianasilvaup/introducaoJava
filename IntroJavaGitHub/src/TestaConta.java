public class TestaConta {
  public static void main(String[] args) {
    Conta minhaConta;
    minhaConta = new Conta(); 
    
    minhaConta.numero = 1;
    minhaConta.nome = "Juliana";
    minhaConta.saldo = 100.00;
    
    System.out.println("O numero da minha conta: " + minhaConta.numero);
  }
}
