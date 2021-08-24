package entidades;

public class Produto {

    private String nome;
    private double preço;
    private String unidade;
    private int quantidade;

    public Produto(){}

    public Produto(String nome, double preço, String unidade, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.unidade = unidade;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
