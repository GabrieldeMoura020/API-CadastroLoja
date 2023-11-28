package br.com.senac.api.entidades;

import jakarta.persistence.*;

import java.util.List;

public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lojas_id")
    private List<Lojas> tabelaLojas;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private List<Produto> tabelaProdutos;

    @Column
    private Float quantidadeEstoque;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Lojas> getTabelaLojas() {
        return tabelaLojas;
    }

    public void setTabelaLojas(List<Lojas> tabelaLojas) {
        this.tabelaLojas = tabelaLojas;
    }

    public List<Produto> getTabelaProdutos() {
        return tabelaProdutos;
    }

    public void setTabelaProdutos(List<Produto> tabelaProdutos) {
        this.tabelaProdutos = tabelaProdutos;
    }

    public Float getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Float quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
