package br.com.alura.compras.principal;

import br.com.alura.compras.modelos.Carrinho;
import br.com.alura.compras.modelos.Produto;

import java.util.Scanner;

public class program {

    public void runBot(){

    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Sessao novaSessao = new Sessao();
        System.out.println("Qual o limite do seu cartão ?");

        double saldo = Double.parseDouble(leitor.nextLine());
        novaSessao.contaAtual.defineLimite(saldo);

        int resposta = Sessao.controladorDeSessao();

        while(resposta != 0) {
            if (resposta == -1) {
                resposta = Sessao.controladorDeSessao();
            } else {
                System.out.println("Qual o nome do produto que se deseja adicionar ?");
                String nome = leitor.nextLine();
                System.out.println("Quanto custa o produto adicionado ?");
                double preco = Double.parseDouble(leitor.nextLine());
                if (preco > novaSessao.contaAtual.getLimite()) {
                    System.out.println("Limite insuficiente para completar a compra");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("O limite atual é: " + novaSessao.contaAtual.getLimite());

                    novaSessao.carrinhoAtual.mostraNota();
                    resposta = Sessao.controladorDeSessao();

                } else {
                    novaSessao.contaAtual.compra(new Produto(nome, preco), novaSessao.carrinhoAtual);
                    resposta = Sessao.controladorDeSessao();

                }


            }
        }
        if (resposta == 0) {

            System.out.println("=================");
            System.out.println("");
            System.out.println("");
            System.out.println("A lista foi fechada com o seguinte conteúdo:");
            System.out.println("");
            novaSessao.carrinhoAtual.mostraNota();
        }
    }
}

