import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca:");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo:");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a placa:");
        String placa = scanner.nextLine();

        Carro carro = new Carro(marca, modelo, ano, placa);
        carro.exibirInformacoes();

        System.out.println("Acelerando o carro em 50 km/h");
        carro.acelerar(50);

        System.out.println("Freando o carro em 20 km/h");
        carro.frear(20);

        scanner.close();

    }
    
}
