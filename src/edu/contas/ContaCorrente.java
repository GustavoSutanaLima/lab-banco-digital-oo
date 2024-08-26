package edu.contas;

import edu.banco.Agencia;

public class ContaCorrente extends ContaPoupanca {

    private double TARIFA_MENSAL = 13.90;
    
    public ContaCorrente(Agencia agencia) {
        super(agencia);
    }

    @Override
    public void abaterTafira() {
        super.saldo-=TARIFA_MENSAL;
        super.alimentadorSaldo(this.saldo);
    }
    
    @Override
    public void somarJurosRendimento (){
        super.saldo+=super.saldo*0.01;
        super.alimentadorSaldo(this.saldo);
    }

    
}
