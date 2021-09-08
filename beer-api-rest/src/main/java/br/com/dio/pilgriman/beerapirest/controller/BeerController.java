package br.com.dio.pilgriman.beerapirest.controller;
import lombok.AllArgsConstructor;
import  br.com.dio.pilgriman.beerapirest.dto.BeerDTO;
import  br.com.dio.pilgriman.beerapirest.exceptions.BeerAlreadyRegisteredException;
import  br.com.dio.pilgriman.beerapirest.exceptions.BeerNotFoundException;
import  br.com.dio.pilgriman.beerapirest.service.BeerService;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.http.HttpStatus;
import  org.springframework.web.bind.annotation.DeleteMapping;
import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.PostMapping;
import  org.springframework.web.bind.annotation.RequestBody;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.ResponseStatus;
import  org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/beers")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerController implements BeerControllerDocs {

    private final BeerService beerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BeerDTO createBeer(@RequestBody @Valid BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        return beerService.createBeer(beerDTO);
    }

    @GetMapping("/{name}")
    public BeerDTO findByName(@PathVariable String name) throws BeerNotFoundException {
        return beerService.findByName(name);
    }

    @GetMapping
    public List<BeerDTO> listBeers() {
        return beerService.listAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws BeerNotFoundException {
        beerService.deleteById(id);
    }
}

