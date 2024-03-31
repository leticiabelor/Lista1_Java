public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantEmEstoque;

    public Produto(String nome, int codigo, double preco, int quantEmEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantEmEstoque = quantEmEstoque;

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getCodigo() {
        return codigo;

    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;

    }

    public double getPreco() {
        return preco;

    }

    public void setPreco(double preco) {
        this.preco = preco;

    }

    public int getQuantEmEstoque() {
        return quantEmEstoque;

    }

    public void setQuantEmEstoque(int quantEmEstoque) {
        this.quantEmEstoque = quantEmEstoque;

    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", codigo=" + codigo + ", preco=" + preco + ", quantEmEstoque=" + quantEmEstoque + '}';

    }

}
