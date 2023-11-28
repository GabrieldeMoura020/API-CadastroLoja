package br.com.senac.api.mappers;

import br.com.senac.api.dto.ProdutoRequest;
import br.com.senac.api.dto.ProdutoResponse;
import br.com.senac.api.entidades.Produto;

public class ProdutoMapper {

    public static Produto produtoRequestToProdutos(ProdutoRequest produto){
        Produto out = new Produto();
        out.setNome(produto.getNome());
        out.setCodigoEan(out.getCodigoEan());
        out.setDescricao(out.getDescricao());

        return out;
    }

    public static ProdutoResponse produtoToProdutoResponse(Produto produto){
        ProdutoResponse out = new ProdutoResponse();
        out.setId(out.getId());
        out.setNome(out.getNome());
        out.setCodigoEan(out.getCodigoEan());
        out.setDescricao(out.getDescricao());
        return out;
    }
}
