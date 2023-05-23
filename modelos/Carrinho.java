package br.com.alura.compras.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho implements Comparable<Carrinho>{
    public List<Produto> listaDeCompras = new ArrayList<>();

    public void adiciona(Produto item){
        listaDeCompras.add(item);
    }


    public void mostraNota(){
        if(this.listaDeCompras.isEmpty()){
            System.out.println("A lista está vazia");
        }for(Produto item:listaDeCompras){
            System.out.println(item.nome + " ================ " +item.preco );

        }
    }

    @Override
    public int compareTo(Carrinho o) {
        return 0;
    }




}
