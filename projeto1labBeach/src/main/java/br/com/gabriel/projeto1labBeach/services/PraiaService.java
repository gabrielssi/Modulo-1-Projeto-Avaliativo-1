package br.com.gabriel.projeto1labBeach.services;

import br.com.gabriel.projeto1labBeach.repositories.PraiaRepository;
import br.com.gabriel.projeto1labBeach.models.Bairro;
import br.com.gabriel.projeto1labBeach.models.Praia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PraiaService {

    @Autowired
    private PraiaRepository praiaRepository;
    @Autowired
    private BairroService bairroService;

    public List<Praia> findAll(){return praiaRepository.findAll();}

    public Long save(String name,
                     Boolean acessibilidade,
                     String status,
                     Long bairroId) {
        Praia praia = new Praia();
        Bairro bairro = bairroService.findByID(bairroId);
        praia.setName(name);
        praia.setAcessibilidade(acessibilidade);
        praia.setStatus(status);
        praia.setBairro(bairro);
        praiaRepository.save(praia);
        return praia.getId();
    }



    public Praia update (Praia praia) {
        return praiaRepository.save(praia);
    }
    public void deleteById(Long id) { praiaRepository.deleteById(id);}
    public List<Praia> findByStatus(String status){
        return praiaRepository.findByStatus(status);
    }
    public List<Praia> findByAcessibilidade(Boolean acessibilidade){
        return praiaRepository.findByAcessibilidade(acessibilidade);
    }
    public List<Praia> findByPopulation(Integer population){
        return praiaRepository.findByPopulation(population);
    }

    public List<Praia> findByPopulacaoMaxima(int populacaoMaxima) {
        List<Praia> praias = praiaRepository.findAll();
        praias = praias.stream()
                .filter(praia -> praia.getBairro().getPopulation() <= populacaoMaxima)
                .collect(Collectors.toList());
        return praias;
    }

}
