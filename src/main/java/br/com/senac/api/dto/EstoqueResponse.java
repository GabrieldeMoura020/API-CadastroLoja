package br.com.senac.api.dto;

import br.com.senac.api.entidades.Lojas;
import br.com.senac.api.entidades.Produto;

import java.util.List;

public class EstoqueResponse {

    private Long id;

    private List<Lojas> tabelaLojas;

    private List<Produto> tabelaProdutos;

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
