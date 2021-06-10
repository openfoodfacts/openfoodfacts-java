package pl.coderion.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Ingredient {

    @JsonProperty("from_palm_oil")
    private String fromPalmOil;

    private String id;

    private String origin;

    private String percent;

    private int rank;

    private String text;

    private String vegan;

    private String vegetarian;
}
