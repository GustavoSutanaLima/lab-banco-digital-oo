package edu.banco;

public class Agencia {

    //Atributos
    private int numeroAgencia;
    private Banco banco;
    /*
     *  Toda vez que eu instanciar Agencia, vou querer um numero diferente para esta instância, para isso, basta
     *  fazer com que este atributo seja do tipo static (estático), assim é possível acessar essa variável (e até mesmo
     *  manipulá-la, sem instanciar um novo objeto. Mas para garantir que não seja possível acessar ela de fora da classe
     *  ou seja, alugém modificando seu valor, é acrescido o modificador de acesso private).
     * 
     *  Queremos que essa valor seja incrementado somente ao instanciar uma nova agência, portanto no construtor da
     *  agência tem-se a linha: SEQUENCIAL_AGENCIA++;
     */
    private static int SEQUENCIAL_AGENCIA = 1;

    //Construtor Agencia:
    public Agencia (Banco banco) {
        this.banco = banco;
        this.numeroAgencia = SEQUENCIAL_AGENCIA;
        SEQUENCIAL_AGENCIA++;
    }

    //Getters:
    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public Banco getBanco() {
        return banco;
    }



    //Ao printar a Agência, o texto abaixo será exibido, ao invés de printar o endereço de Objeto:
    @Override
    public String toString() {
        return "{Banco=" + banco.getNomeBanco() + ", Agência=" + numeroAgencia +"}";
    }

 
} 