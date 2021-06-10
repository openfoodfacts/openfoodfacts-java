package pl.coderion.model;

import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;

@Data
public class SelectedImageItem {

    private String en;

    private String fr;

    private String pl;

    public String getUrl() {
        return ObjectUtils.firstNonNull(en, fr, pl);
    }
}
