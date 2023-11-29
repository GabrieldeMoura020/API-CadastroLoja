package br.com.senac.api.entidades;

import jakarta.persistence.*;

@Entity(name = "estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lojas_id")
    private Lojas lojas;

    @ManyToOne
    @JoinColumn(name = "produtos_id")
    private Produtos produtos;

    @Column
    private Float quantidadeEstoque;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Lojas getLojas() {
        return lojas;
    }

    public void setLojas(Lojas lojas) {
        this.lojas = lojas;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public Float getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Float quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
