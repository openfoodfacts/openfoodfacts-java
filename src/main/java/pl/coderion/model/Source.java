package pl.coderion.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Source {

    private String[] fields;

    private String id;

    private String[] images;

    @JsonProperty("import_t")
    private long importT;

    private String manufacturer;

    private String name;

    private String url;
}
