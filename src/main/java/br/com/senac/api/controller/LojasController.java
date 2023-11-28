package br.com.senac.api.controller;

import br.com.senac.api.entidades.Lojas;
import br.com.senac.api.repositorio.LojasRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/lojas")
public class LojasController {

    @Autowired
    private LojasRepository lojasRepository;

    @GetMapping("/")
    @CrossOrigin
    public ResponseEntity<List<Lojas>> carregarLojas(){

        List<Lojas> retorno = lojasRepository.findAll();
        return ResponseEntity.ok().body(retorno);
    }

    @PostMapping("/")
    public ResponseEntity<Lojas> criarLojas(@RequestBody Lojas lojas){

        Lojas retorno = lojasRepository.save(lojas);

        return ResponseEntity.status(HttpStatus.CREATED).body(retorno);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLojas(@PathVariable Long id){

        lojasRepository.deleteById(id);

        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<Lojas> atualizarLojas(@PathVariable Long id, @RequestBody Lojas lojas){
        Lojas retorno = lojasRepository.findById(id).map(record -> {
            record.setNome(lojas.getNome());
            record.setCnpj(lojas.getCnpj());
            record.setResponsavel(lojas.getResponsavel());

            return lojasRepository.save(record);
        }).get();

        return ResponseEntity.ok(retorno);
    }

}
