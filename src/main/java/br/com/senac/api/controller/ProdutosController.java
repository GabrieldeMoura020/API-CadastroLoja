package br.com.senac.api.controller;

import br.com.senac.api.dto.ProdutosRequest;
import br.com.senac.api.dto.ProdutosResponse;
import br.com.senac.api.entidades.Produtos;
import br.com.senac.api.mappers.ProdutosMapper;
import br.com.senac.api.repositorio.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutosRepository produtosRepository;

    @GetMapping("/")
    @CrossOrigin
    public ResponseEntity<List<ProdutosResponse>> carregarProdutos(){

        List<Produtos> retorno = produtosRepository.findAll();

        List<ProdutosResponse> out = retorno.stream().map(ProdutosMapper::produtosToProdutosResponse).toList();

        return ResponseEntity.ok().body(out);
    }

    @PostMapping("/")
    public ResponseEntity<ProdutosResponse> criarProdutos(@RequestBody ProdutosRequest produtos){

        Produtos retorno = produtosRepository.save(ProdutosMapper.produtosRequestToProdutos(produtos));

        return ResponseEntity.status(HttpStatus.CREATED).body( ProdutosMapper.produtosToProdutosResponse(retorno));
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProdutos(@PathVariable Long id){
        produtosRepository.deleteById(id);

        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<ProdutosResponse> atualizarProduto(@PathVariable Long id, @RequestBody Produtos produtos){

        Produtos retorno = produtosRepository.findById(id).map(record ->{
            record.setNome(produtos.getNome());
            record.setCodigoEan(produtos.getCodigoEan());
            record.setDescricao(produtos.getDescricao());

            return produtosRepository.save(record);
        }).get();

        ProdutosResponse out = ProdutosMapper.produtosToProdutosResponse(retorno);
        return ResponseEntity.ok(out);
    }

}
