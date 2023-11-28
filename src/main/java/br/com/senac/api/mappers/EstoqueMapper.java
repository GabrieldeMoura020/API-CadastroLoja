package br.com.senac.api.mappers;

import br.com.senac.api.dto.EstoqueRequest;
import br.com.senac.api.dto.EstoqueResponse;
import br.com.senac.api.entidades.Estoque;

import java.util.List;

public class EstoqueMapper {

    public static Estoque estoqueRequestToEstoque(EstoqueRequest estoque){
        Estoque out = new Estoque();
        out.setQuantidadeEstoque(out.getQuantidadeEstoque());
        out.setTabelaLojas(out.getTabelaLojas());
        out.setTabelaProdutos(out.getTabelaProdutos());

        return out;
    }

    public static EstoqueResponse estoqueToEstoqueResponse(Estoque estoque){
        EstoqueResponse out = new EstoqueResponse();
        out.setId(out.getId());
        out.setTabelaLojas(out.getTabelaLojas());
        out.setTabelaProdutos(out.getTabelaProdutos());
        out.setQuantidadeEstoque(out.getQuantidadeEstoque());

        return out;
    }
}
