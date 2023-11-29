package br.com.senac.api.dto;

public class EstoqueRequest {

    private Long lojas_id;

    private Long produtos_id;

    private Float quantidadeEstoque;

    public Long getLojas_id() {
        return lojas_id;
    }

    public void setLojas_id(Long lojas_id) {
        this.lojas_id = lojas_id;
    }

    public Long getProdutos_id() {
        return produtos_id;
    }

    public void setProdutos_id(Long produtos_id) {
        this.produtos_id = produtos_id;
    }

    public Float getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Float quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
