package br.com.dio.pilgriman.beerapirest.builder;

import br.com.dio.pilgriman.beerapirest.dto.BeerDTO;
import br.com.dio.pilgriman.beerapirest.enums.BeerType;
import lombok.Builder;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private  String brand = "Ambev";

    @Builder.Default
    private Integer max = 50;

    @Builder.Default
    private Integer quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO(){
        return new BeerDTO(id, name, brand, max, quantity, type);
    }

}
