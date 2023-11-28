package br.com.senac.api.mappers;

import br.com.senac.api.dto.LojasRequest;
import br.com.senac.api.dto.LojasResponse;
import br.com.senac.api.entidades.Lojas;

public class LojasMapper {

    public static Lojas lojasRequestToLojas(LojasRequest lojas){
        Lojas out = new Lojas();
        out.setNome(out.getNome());
        out.setCnpj(out.getCnpj());
        out.setResponsavel(out.getResponsavel());

        return out;
    }

    public static LojasResponse lojasToLojasResponse(Lojas lojas){
        LojasResponse out = new LojasResponse();
        out.setId(out.getId());
        out.setNome(out.getNome());
        out.setCnpj(out.getCnpj());
        out.setResponsavel(out.getResponsavel());

        return out;
    }
}
