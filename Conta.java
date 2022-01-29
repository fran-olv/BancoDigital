public abstract class Conta implements InterfaceConta{
  
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int conta;
  protected int agencia;
  protected double saldo;

  public Conta(){
    this.agencia = Conta.AGENCIA_PADRAO;
    this.conta = SEQUENCIAL++;
  }

  @Override 
  public void sacar(double valor){
    saldo -= valor;
  }
  
   @Override 
  public void depositar(double valor){
    saldo += valor;
  }

   @Override 
  public void transferir(double valor, Conta contaDestino){
    this.sacar(valor);
    contaDestino.depositar(valor);

  }

  public int getConta(){
    return conta;
  }

  public int getAgencia(){
      return agencia;
  }
  
  public double getSaldo(){
    return saldo;
  }

  protected void imprimirInfoComum(){
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Conta: %d", this.conta));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
}
}

