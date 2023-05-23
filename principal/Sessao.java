package br.com.alura.compras.principal;

import br.com.alura.compras.modelos.Carrinho;
import br.com.alura.compras.modelos.Conta;

import java.util.Scanner;

public class Sessao {
    public Conta contaAtual = new Conta();
    public Carrinho carrinhoAtual = new Carrinho();

    public static int controladorDeSessao() {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Aperte 1 para comprar e 0 para sair");
        int input = Integer.parseInt(leitor.nextLine());

        if (!(input == 1 || input == 0)) {
            System.out.println("Insira um valor valido");

        }return input;

    }

}
