package br.com.gabriel.projeto1labBeach.controllers;

import br.com.gabriel.projeto1labBeach.services.BairroService;
import br.com.gabriel.projeto1labBeach.models.Bairro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value = "api/bairros")
public class BairroController {

    @Autowired
    private BairroService bairroService;

    @GetMapping
    public ResponseEntity<List<Bairro>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(bairroService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bairro> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(bairroService.findByID(id));
    }
    @PostMapping(value = "/post1")
    public Long save(@RequestParam("name") String name,
                     @RequestParam("description") String description,
                     @RequestParam("population") Integer population){
        return ResponseEntity.ok().body(bairroService.save(name, description, population)).getBody();

    }

    @PostMapping(value = "/post2")
    public ResponseEntity<Bairro> create(@RequestBody Bairro bairro){
        return ResponseEntity.status(HttpStatus.CREATED).body(bairroService.saveAll(bairro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
    bairroService.deleteById(id);
    return ResponseEntity.status(HttpStatus.OK).build();

    }

}
