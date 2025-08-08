package application;

import entities.Produto;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto");
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Preço do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Produto p = new Produto(nome, preco, quantidade);

        System.out.println("\nInformações do produto: " + p);

        System.out.println();
        System.out.print("Deseja adicionar algum produto? (Sim = 1 / Não = 2): ");
        char qtdAdicionar = sc.next().charAt(0);

        if(qtdAdicionar == '1' ) {

            System.out.print("\nEntre com o número de produtos que você deseja adicionar: ");
            quantidade = sc.nextInt();
            p.adicionarProduto(quantidade);

            System.out.println("\nInformações do produto: " + p);
        }
        if(qtdAdicionar == '2') {
            System.out.print("Deseja remover algum produto? (Sim = 1 / Não = 2): ");
            char qtdRemover = sc.next().charAt(0);

            if(qtdRemover == '1') {

                System.out.print("\nEntre com o número de produtos que você deseja remover: ");
                quantidade = sc.nextInt();
                p.removerProduto(quantidade);

                System.out.println("\nInformações do produto: " + p);
            }

        }
        System.out.println("\nCompra finalizada com sucesso! Volte sempre!");

        sc.close();
    }

}
