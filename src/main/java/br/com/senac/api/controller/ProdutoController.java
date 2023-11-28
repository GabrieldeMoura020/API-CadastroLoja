package br.com.senac.api.controller;

import br.com.senac.api.dto.ProdutoResponse;
import br.com.senac.api.entidades.Produto;
import br.com.senac.api.repositorio.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/")
    @CrossOrigin
    public ResponseEntity<List<ProdutoResponse>> carregarProdutos(){

        List<Produto> retorno = produtoRepository.findByAll();

        List<ProdutoResponse> out = retorno.stream().map(ProdutoMapper :: p)
    }

}
