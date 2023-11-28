package br.com.senac.api.dto;

import br.com.senac.api.entidades.Lojas;
import br.com.senac.api.entidades.Produto;

import java.util.List;

public class EstoqueRequest {

    private List<Lojas> tabelaLojas;

    private List<Produto> tabelaProdutos;

    private Float quantidadeEstoque;

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
