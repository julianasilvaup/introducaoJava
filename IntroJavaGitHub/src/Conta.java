public class Conta {
    //Atributos
    int numero;
    String nome;
    double saldo;
    double limite;
    
  void sacar(double quantidade){
    double novoSaldo = this.saldo - quantidade;
    this.saldo = novoSaldo;
  }
    
  boolean sacarVerifica(double quantidade){
    if (quantidade > this.saldo){
      return false;
    }else{
      double novoSaldo = this.saldo - quantidade;
      this.saldo = novoSaldo;
      return true;
    }   
  }
  
  void depositar(double quantidade){
    double novoSaldo = this.saldo + quantidade;
    this.saldo = novoSaldo;
  }
}
