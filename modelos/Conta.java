package br.com.alura.compras.modelos;

public class Conta {

    protected double limite;

    public double getLimite() {
        return limite;
    }

    public void defineLimite(double valor){
        this.limite = valor;

    }

    public boolean compra(Produto item, Carrinho lista ){
        if(item.preco < this.limite){
            lista.adiciona(item);
            this.limite -= item.preco;
            return true;
        }return false;
    }
}
