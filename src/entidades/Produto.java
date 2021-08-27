package entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Produto {

    private String nome;
    private double preço;
    private String unidade;
    private int quantidade;

    private List<Produto> produto = new ArrayList<>();

    public Produto(){}

    public List<Produto> getProduto() {
        return Collections.unmodifiableList(produto);
    }

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

    public String toString(){
        return "Nome: " + this.nome + "\n"
             + "Preço: " + String.format("%.2f",this.preço) + "\n"
             + "Unidade: " + this.unidade + "\n"
             + "Quantidade: " + this.quantidade + "\n";
    }

    public void adicionaProduto(Produto prod){
        produto.add(prod);
    }

    public void removeProduto(Produto prod){
        produto.remove(prod);
    }


}
