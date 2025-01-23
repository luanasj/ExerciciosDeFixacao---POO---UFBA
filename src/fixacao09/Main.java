package fixacao09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do Produto:");
        String nomeProduto = scan.nextLine();
        System.out.print("Digite o preço do Produto:");
        double precoProduto = scan.nextDouble();
        System.out.print("Digite a quantidade em Estoque:");
        int qtdProduto = scan.nextInt();

        System.out.println(SistemaCadastro.cadastrarProduto(nomeProduto,precoProduto,qtdProduto));
    }
}
