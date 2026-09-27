package pe.cibertec.t1feigngrupo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.t1feigngrupo1.restclient.rickandmorty.model.CharacterRM;
import pe.cibertec.t1feigngrupo1.service.CharacterService;

import java.util.List;

@RestController
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/characters")
    public List<CharacterRM> getCharacters() {
        return characterService.getAliveHumans();
    }
}
