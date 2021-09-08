package br.com.dio.pilgriman.beerapirest.mapper;

import br.com.dio.pilgriman.beerapirest.dto.BeerDTO;
import br.com.dio.pilgriman.beerapirest.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
