package br.com.senac.api.mappers;

import br.com.senac.api.dto.ProdutosRequest;
import br.com.senac.api.dto.ProdutosResponse;
import br.com.senac.api.entidades.Produtos;

public class ProdutosMapper {

    public static Produtos produtosRequestToProdutos(ProdutosRequest produtos){
        Produtos out = new Produtos();
        out.setNome(produtos.getNome());
        out.setCodigoEan(produtos.getCodigoEan());
        out.setDescricao(produtos.getDescricao());

        return out;
    }

    public static ProdutosResponse produtosToProdutosResponse(Produtos produtos){
        ProdutosResponse out = new ProdutosResponse();
        out.setId(produtos.getId());
        out.setNome(produtos.getNome());
        out.setCodigoEan(produtos.getCodigoEan());
        out.setDescricao(produtos.getDescricao());
        return out;
    }
}
