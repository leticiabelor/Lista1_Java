public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velAtual = 0;

    }

    public void acelerar(double vel) {
        if (vel > 0) {
            this.velAtual += vel;
            System.out.println("O carro acelerou para " + this.velAtual + " km/h ");

        } else {
            System.out.println("A velocidade deve ser maior que zero! ");

        }

    }

    public void frear(double vel) {

        if (vel > 0 && vel <= this.velAtual) {
            this.velAtual -= vel;

            System.out.println("O carro reduziu a velocidade para " + this.velAtual + " km/h");

        } else {
            System.out.println("A velocidade de frenagem deve ser maior que zero e menor ou igual à velocidade atual do carro. ");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velAtual + " km/h");

    }

}
