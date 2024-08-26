
import edu.banco.Agencia;
import edu.banco.Banco;
import edu.clientes.Cliente;
import edu.contas.Conta;
import edu.contas.ContaCorrente;
import edu.contas.ContaInterface;

public class App {

    public static void main(String[] args) {
        //Implementa um novo banco;
        Banco bancoBrasil = new Banco("Banco do Brasil", 1);
        
        //Implmenta uma nova agência;
        Agencia astolfoDutra = new Agencia(bancoBrasil);
        
        //Cria dois novos clientes;
        Cliente gustavoSutanaLima = new Cliente("Gustavo Sutana Lima", astolfoDutra, 1);
        Cliente mariaConceicaoSutanaLima = new Cliente("Maria Conceicao", astolfoDutra, 2);
        
        gustavoSutanaLima.getConta().depositar(1350);
        gustavoSutanaLima.getConta().transferir(700, mariaConceicaoSutanaLima.getConta());   
        gustavoSutanaLima.getConta().imprimirExtrato();

        mariaConceicaoSutanaLima.getConta().depositar(2000);
        mariaConceicaoSutanaLima.getConta().sacar(876.19);
        mariaConceicaoSutanaLima.getConta().imprimirExtrato();

        mariaConceicaoSutanaLima.getConta().somarJurosRendimento();
        System.out.println("****");
        mariaConceicaoSutanaLima.getConta().imprimirExtrato();
        System.out.println("****");
        mariaConceicaoSutanaLima.getConta().abaterTafira();
        System.out.println("**");
        gustavoSutanaLima.getConta().abaterTafira();
        gustavoSutanaLima.getConta().imprimirExtrato();
        System.out.println("**");
        gustavoSutanaLima.getConta().somarJurosRendimento();
        gustavoSutanaLima.getConta().imprimirExtrato();




}
}
