package br.com.gabriel.projeto1labBeach.repositories;

import br.com.gabriel.projeto1labBeach.models.Praia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PraiaRepository extends JpaRepository<Praia, Long> {

    public List<Praia> findByStatus(String status);

    public  List<Praia> findByAcessibilidade (Boolean acessibilidade); // Listagem de praias com acessibilidade

    @Query ("select p from Praia p left join Bairro b on ( p.bairro = b ) where b.population <= :num")
    public List<Praia> findByPopulation(@Param("num") Integer population);

}
