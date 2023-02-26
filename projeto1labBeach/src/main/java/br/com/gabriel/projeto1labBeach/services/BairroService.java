package br.com.gabriel.projeto1labBeach.services;

import br.com.gabriel.projeto1labBeach.repositories.BairroRepository;
import br.com.gabriel.projeto1labBeach.models.Bairro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BairroService {


    @Autowired
    private BairroRepository bairroRepository;


    public Long save (String name,
                      String description,
                      Integer population){
        Bairro bairro = new Bairro();
        bairro.setName(name);
        bairro.setDescription(description);
        bairro.setPopulation(population);
        return bairroRepository.save(bairro).getId();
    }

   public Bairro saveAll (Bairro bairro) { return bairroRepository.save(bairro);} // método salvar via JSON
    public Bairro findByID(Long id){
        Optional<Bairro> bairros = bairroRepository.findById(id);
        return (bairros.isPresent() ? bairros.get() : null);
    }

    public List<Bairro> findAll() {return bairroRepository.findAll();}
    public void deleteById(Long id) { bairroRepository.deleteById(id);}


}
