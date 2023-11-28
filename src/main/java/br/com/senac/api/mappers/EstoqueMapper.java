package br.com.senac.api.mappers;

import br.com.senac.api.dto.EstoqueRequest;
import br.com.senac.api.entidades.Estoque;

public class EstoqueMapper {

    public static Estoque estoqueRequestToEstoque(EstoqueRequest estoque){
        Estoque out = new Estoque();
        out.setQuantidadeEstoque();
    }
}
