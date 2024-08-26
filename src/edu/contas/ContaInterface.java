package edu.contas;

public interface ContaInterface {
    /*
     *  Interface (um tipo de Classe) irá definir algums métodos padrões (também conhecidos como contratos),
     *  que todas as classes que a implementarem, precisarão contê-los;
     * 
     *  Os métodos principais são definidos aqui, ou seja, qualquer classe que implemente essa interface precisará
     *  ter esses métodos em seu corpo. Porém, na interface não se define o que o método fará, mas sim a classe
     *  que o implementa. A interface não sabe como as classes vão usar seus métodos, isso é deifino na classe que
     *  a implementará.
     * 
     */

    public void imprimirStatusConta();

    public void sacar(double valor);

    public void depositar(double valor);

    public void transferir(double valor, Conta conta);

    public void imprimirExtrato();

}
