package br.com.dio.pilgriman.beerapirest.repository;

import br.com.dio.pilgriman.beerapirest.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
