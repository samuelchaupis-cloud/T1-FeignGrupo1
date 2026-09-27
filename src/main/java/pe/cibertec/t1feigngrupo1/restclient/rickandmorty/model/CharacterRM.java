package pe.cibertec.t1feigngrupo1.restclient.rickandmorty.model;

import lombok.Data;

@Data
public class CharacterRM {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String image;
    private String url;
}
