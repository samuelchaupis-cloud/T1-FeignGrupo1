package pe.cibertec.t1feigngrupo1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.cibertec.t1feigngrupo1.restclient.rickandmorty.client.CharacterClient;
import pe.cibertec.t1feigngrupo1.restclient.rickandmorty.model.CharacterRM;
import pe.cibertec.t1feigngrupo1.restclient.rickandmorty.model.CharacterResponseRM;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterService {

    private final CharacterClient characterClient;

    public CharacterService(CharacterClient characterClient) {
        this.characterClient = characterClient;
    }

    public List<CharacterRM> getAliveHumans() {

        return characterClient
                .getCharacters(1, "Alive", "Human")
                .getResults();
    }
}

