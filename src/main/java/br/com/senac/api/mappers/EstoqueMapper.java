package br.com.senac.api.mappers;

import br.com.senac.api.dto.EstoqueRequest;
import br.com.senac.api.dto.EstoqueResponse;
import br.com.senac.api.entidades.Estoque;

public class EstoqueMapper {

    public static Estoque estoqueRequestToEstoque(EstoqueRequest estoque){
        Estoque out = new Estoque();
        out.setQuantidadeEstoque(out.getQuantidadeEstoque());
        out.setLojas(out.getLojas());
        out.setProdutos(out.getProdutos());

        return out;
    }

    public static EstoqueResponse estoqueToEstoqueResponse(Estoque estoque){
        EstoqueResponse out = new EstoqueResponse();
        out.setId(out.getId());
        out.setQuantidadeEstoque(out.getQuantidadeEstoque());

        return out;
    }
}