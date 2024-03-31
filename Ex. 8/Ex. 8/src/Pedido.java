public class Pedido {
    private static int numPedidoAtual = 1;
    private int numPedido;
    private Pizza pizza;
    private String tam;
    private double valor;
    private String enderecoEntrega;

    public Pedido(Pizza pizza, String tam, String enderecoEntrega) {
        this.numPedido = numPedidoAtual++;
        this.pizza = pizza;
        this.tam = tam;
        this.valor = pizza.getValor(); 
        this.enderecoEntrega = enderecoEntrega;
        
    }

    public int getNumeroPedido() {
        return numPedido;

    }

    public Pizza getPizza() {
        return pizza;

    }

    public String getTamanho() {
        return tam;

    }

    public double getValor() {
        return valor;

    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;

    }

    public void setTam(String tam) {
        this.tam = tam;

        if (tam.equalsIgnoreCase("grande")) {
            this.valor = pizza.getValor() * 1.5; 

        } else if (tam.equalsIgnoreCase("média")) {
            this.valor = pizza.getValor() * 1.2; 

        } else {
            this.valor = pizza.getValor(); 

        }

    }

}
