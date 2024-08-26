package edu.clientes;

import edu.banco.Agencia;
import edu.contas.Conta;
import edu.contas.ContaCorrente;
import edu.contas.ContaPoupanca;


public class Cliente {
    
    //Atributos
    private String nomeCliente;
    private Conta conta;
    private Agencia agencia;
    /**
     * Instancia um novo Cliente, dado um determinado banco e uma modalidade específica.
     * @param nomeCliente
     * @param banco
     * @param modalidade (ecolha 1=Conta Corrente (e Poupança), 2=Conta Poupança)
     */
    public Cliente(String nomeCliente, Agencia agencia, int modalidade) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        if (modalidade == 1) {
            this.conta = (ContaCorrente) new ContaCorrente(agencia);
        }
        else if (modalidade == 2){
            this.conta = (ContaPoupanca) new ContaPoupanca(agencia);
        }
    }
    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "{Cliente="+nomeCliente+ ", Conta="+ getConta() + ", Agencia= " + agencia + "}";
    }

    


}
