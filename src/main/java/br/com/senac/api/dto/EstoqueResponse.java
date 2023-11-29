package br.com.senac.api.dto;

public class EstoqueResponse {

    private Long id;

    private Long lojas_id;

    private Long produto_id;

    private Float quantidadeEstoque;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLojas_id() {
        return lojas_id;
    }

    public void setLojas_id(Long lojas_id) {
        this.lojas_id = lojas_id;
    }

    public Long getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Long produto_id) {
        this.produto_id = produto_id;
    }

    public Float getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Float quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
