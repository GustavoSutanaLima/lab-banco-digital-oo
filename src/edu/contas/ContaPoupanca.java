package edu.contas;

import edu.banco.Agencia;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Agencia agencia) {
        super(agencia);
    }
    
    @Override
    public void somarJurosRendimento (){
        super.saldo+=super.saldo*0.01;
        super.alimentadorSaldo(this.saldo);
    }

    @Override
    public void abaterTafira(){
        System.out.println("ERRO: Não há tarifas a abatar!");
    };

}
