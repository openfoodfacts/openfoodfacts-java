package pl.coderion.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Data;

@Data
public class Images {

    Map<String, Object> other = new LinkedHashMap<>();

    @JsonAnySetter
    void setDetail(String key, Object value) {
        other.put(key, value);
    }
}
