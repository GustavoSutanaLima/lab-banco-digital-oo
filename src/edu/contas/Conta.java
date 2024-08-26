package edu.contas;

import edu.banco.Agencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Conta implements ContaInterface{

    //Atributos de uma Conta Bancária:
    private Agencia agencia; // 
    private int numeroConta;
    protected double saldo = 0;
    private Map<Integer, Double> extrato = new TreeMap<Integer, Double>();
    private int movimentacao = 1; //Número de movimentação;

    /*
     *  Criando uma variável estática para sequenciar o atributo numeroConta para cada instância dessa classe:
     */
    private static int SEQUENCIAL_CONTA = 1;

    //Construtor Conta:
    public Conta(Agencia agencia) {
        this.agencia = agencia;
        this.numeroConta = SEQUENCIAL_CONTA;
        SEQUENCIAL_CONTA++; //Implementação da sequência;
    }

    //Métodos Abstratos (da Interface ContaInterface):

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
        alimentadorSaldo(saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo-=valor;
        alimentadorSaldo(saldo);     
    }

    @Override
    public void transferir(double valor, Conta conta) {
        this.saldo-=valor;
        conta.depositar(valor);
        alimentadorSaldo(saldo);    
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Movimentações da Conta de Nº "+ this.numeroConta + ": " + extrato);
    }

    @Override
    public void imprimirStatusConta() {
       System.out.println("Conta Bancária de Nº: " + numeroConta + " & " + "numeroAgência: " + agencia.getNumeroAgencia());
       
   }

    //Método para gerar extrato:
    protected void alimentadorSaldo(double saldo) {
        extrato.put(movimentacao, saldo);
        movimentacao++;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void abaterTafira(){

    }

    public void somarJurosRendimento (){
       
    }
    
}
