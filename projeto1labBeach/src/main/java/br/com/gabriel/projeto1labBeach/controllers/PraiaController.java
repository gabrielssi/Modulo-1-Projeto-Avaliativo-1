package br.com.gabriel.projeto1labBeach.controllers;

import br.com.gabriel.projeto1labBeach.services.PraiaService;
import br.com.gabriel.projeto1labBeach.models.Praia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/praias")
public class PraiaController {

    @Autowired
    private PraiaService praiaService;

    @GetMapping
    public ResponseEntity<List<Praia>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(praiaService.findAll());
    }

    @PostMapping(value = "/post")
    public ResponseEntity<Long> save(@RequestParam("name") String name,
                                     @RequestParam("acessibilidade") Boolean acessibilidade,
                                     @RequestParam("status") String status,
                                     @RequestParam("bairroId") Long bairroId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(praiaService.save(name, acessibilidade, status, bairroId));
    }


    // usar get para findByStatus
//    @PostMapping // Cadastro de praia:
//    public ResponseEntity<Praias> create(@RequestBody Praias praias){
//        // verifica se o bairro foi criado, e invoca o método save, da classe service, responsável por salvar.
//        return ResponseEntity.status(HttpStatus.CREATED).body(praiaService.save(praias));
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Praia> update(@RequestBody Praia praia){
        return ResponseEntity.status(HttpStatus.OK).body(praiaService.update(praia));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        praiaService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping(value = "status")
    public List<Praia> findByStatus(@RequestParam("status") String status){
        List<Praia> praias = praiaService.findByStatus(status);
        return ResponseEntity.ok().body(praias).getBody();
    }

    @GetMapping(value = "acessibilidade")
    public ResponseEntity<List<Praia>> findByAcessibilidade(@RequestParam("acessibilidade") Boolean acessibilidade){
        List<Praia> praias = praiaService.findByAcessibilidade(acessibilidade);
        return ResponseEntity.ok(praias);
    }

    @GetMapping(value = "populacao")
    public ResponseEntity<List<Praia>> findByPopulacaoMaxima(@RequestParam("populacaoMaxima") int populacaoMaxima) {
        List<Praia> praias = praiaService.findByPopulacaoMaxima(populacaoMaxima);
        return ResponseEntity.ok(praias);
    }


}
