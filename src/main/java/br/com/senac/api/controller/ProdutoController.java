package br.com.senac.api.controller;

import br.com.senac.api.dto.ProdutoRequest;
import br.com.senac.api.dto.ProdutoResponse;
import br.com.senac.api.entidades.Produto;
import br.com.senac.api.mappers.ProdutoMapper;
import br.com.senac.api.repositorio.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/")
    @CrossOrigin
    public ResponseEntity<List<ProdutoResponse>> carregarProdutos(){

        List<Produto> retorno = produtoRepository.findAll();

        List<ProdutoResponse> out = retorno.stream().map(ProdutoMapper::produtoToProdutoResponse).toList();

        return ResponseEntity.ok().body(out);
    }

    @PostMapping("/")
    public ResponseEntity<ProdutoRepository> criarProduto(@RequestBody ProdutoRequest produto){

        Produto retorno = produtoRepository.save(ProdutoMapper.produtoRequestToProdutos(produto));

        return ResponseEntity.status(HttpStatus.CREATED).body((ProdutoRepository) ProdutoMapper.produtoToProdutoResponse(retorno));
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProdutos(@PathVariable Long id){
        produtoRepository.deleteById(id);

        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<ProdutoResponse> atualizarProduto(@PathVariable Long id, @RequestBody Produto produto){

        Produto retorno = produtoRepository.findById(id).map(record ->{
            record.setNome(produto.getNome());
            record.setCodigoEan(produto.getCodigoEan());
            record.setDescricao(produto.getDescricao());

            return produtoRepository.save(record);
        }).get();

        ProdutoResponse out = ProdutoMapper.produtoToProdutoResponse(retorno);
        return ResponseEntity.ok(out);
    }

}
