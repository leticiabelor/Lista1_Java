import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU ");
            System.out.println("[1] Adicionar Produto ");
            System.out.println("[2] Atualizar Produto ");
            System.out.println("[3] Remover Produto ");
            System.out.println("[4] Gerar Relatório de Estoque ");
            System.out.println("[0] Sair ");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                break;

            }

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque, scanner);
                    break;

                case 2:
                    atualizarProduto(estoque, scanner);
                    break;

                case 3:
                    removerProduto(estoque, scanner);
                    break;

                case 4:
                    gerarRelatorio(estoque);
                    break;

                default:
                    System.out.println("Erro! Opção inválida!");

            }

        }

    }

    public static void adicionarProduto(ArrayList<Produto> estoque, Scanner scanner) {
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.next();

        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade em estoque do produto: ");
        int quantidade = scanner.nextInt();

        Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(novoProduto);

        System.out.println("Produto adicionado com sucesso!! ");

    }

    public static void atualizarProduto(ArrayList<Produto> estoque, Scanner scanner) {
        System.out.println("Digite o código do produto que deseja atualizar: ");
        int codigo = scanner.nextInt();

        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                System.out.println("Digite o novo nome do produto: ");
                String novoNome = scanner.next();

                System.out.println("Digite o novo preço do produto: ");
                double novoPreco = scanner.nextDouble();

                System.out.println("Digite a nova quantidade em estoque do produto: ");
                int novaQuantidade = scanner.nextInt();

                produto.setNome(novoNome);
                produto.setPreco(novoPreco);
                produto.setQuantidadeEmEstoque(novaQuantidade);
                System.out.println("Produto atualizado com sucesso! ");
                return;

            }

        }

        System.out.println("Erro! Produto não encontrado! ");
        
    }

    public static void removerProduto(ArrayList<Produto> estoque, Scanner scanner) {
        System.out.println("Digite o código do produto que deseja remover:");
        int codigo = scanner.nextInt();

        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                estoque.remove(produto);

                System.out.println("Produto removido com sucesso! ");
                return;

            }

        }

        System.out.println("Erro! Produto não encontrado! ");

    }

    public static void gerarRelatorio(ArrayList<Produto> estoque) {
        System.out.println("Relatório de Estoque: ");
        for (Produto produto : estoque) {
            System.out.println(produto);

        }

    }

}

