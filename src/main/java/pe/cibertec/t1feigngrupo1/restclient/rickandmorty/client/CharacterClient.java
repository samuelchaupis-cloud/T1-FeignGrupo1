package pe.cibertec.t1feigngrupo1.restclient.rickandmorty.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.cibertec.t1feigngrupo1.restclient.rickandmorty.model.CharacterResponseRM;

@FeignClient(
        name = "characterClient",
        url = "https://rickandmortyapi.com/api"
)
public interface CharacterClient {

    @GetMapping("/character")
    CharacterResponseRM getCharacters(
            @RequestParam("page") int page,
            @RequestParam("status") String status,
            @RequestParam("species") String species
    );
}
