package br.com.senac.api.controller;

import br.com.senac.api.dto.EstoqueRequest;
import br.com.senac.api.dto.EstoqueResponse;
import br.com.senac.api.entidades.Estoque;
import br.com.senac.api.mappers.EstoqueMapper;
import br.com.senac.api.repositorio.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueRepository estoqueRepository;

    @GetMapping("/")
    @CrossOrigin
    public ResponseEntity<List<EstoqueResponse>> carregarEstoque(){

        List<Estoque> retorno = estoqueRepository.findAll();

        List<EstoqueResponse> out = retorno.stream().map(EstoqueMapper :: estoqueToEstoqueResponse).toList();
        return ResponseEntity.ok().body(out);
    }

    @PostMapping("/")
    public ResponseEntity<EstoqueResponse> criarEstoque(@RequestBody EstoqueRequest estoque){

        Estoque retorno = estoqueRepository.save(EstoqueMapper.estoqueRequestToEstoque(estoque));

        return ResponseEntity.status(HttpStatus.CREATED).body(EstoqueMapper.estoqueToEstoqueResponse(retorno));
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEstoque(@PathVariable Long id){
        estoqueRepository.deleteById(id);

        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<EstoqueResponse> atualizarEstoque(@PathVariable Long id, @RequestBody Estoque estoque){
        Estoque retorno = estoqueRepository.findById(id).map(record -> {
            record.setTabelaProdutos(estoque.getTabelaProdutos());
            record.setTabelaLojas(estoque.getTabelaLojas());
            record.setQuantidadeEstoque(estoque.getQuantidadeEstoque());
            return estoqueRepository.save(record);
        }).get();

        EstoqueResponse out = EstoqueMapper.estoqueToEstoqueResponse(retorno);
        return ResponseEntity.ok(out);
    }

}
