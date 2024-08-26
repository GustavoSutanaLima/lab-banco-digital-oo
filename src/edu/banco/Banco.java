package edu.banco;

public class Banco {
    
    /*
     *  Atributos de um Banco:
     */

    private String nomeBanco;
    private int codigoBanco;

    /*
     *  Construtores Banco (posso instanciar um banco, somente passando o nome, ou passando nome e codigo bancário):
     */
    public Banco(String nomeBanco){
        this.nomeBanco = nomeBanco;
    }

    public Banco(String nomeBanco, int codigoBanco) {
        this.nomeBanco = nomeBanco;
        this.codigoBanco = codigoBanco;
    }

    @Override
    public String toString() {
        return "nomeBanco="+ "\""+ nomeBanco + "\"" + " codigoBanco=" +codigoBanco;
    } 
    /* 
    * Getters:
    */
    public String getNomeBanco() {
        return nomeBanco;
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }
    
    
    
}