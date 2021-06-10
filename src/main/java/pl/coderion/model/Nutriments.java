package pl.coderion.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Data;

@Data
public class Nutriments {

    private float calcium;

    @JsonProperty("calcium_value")
    private float calciumValue;

    @JsonProperty("calcium_100g")
    private float calcium100G;

    @JsonProperty("calcium_serving")
    private float calciumServing;

    @JsonProperty("calcium_unit")
    private String calciumUnit;

    private float carbohydrates;

    @JsonProperty("carbohydrates_value")
    private float carbohydratesValue;

    @JsonProperty("carbohydrates_100g")
    private float carbohydrates100G;

    @JsonProperty("carbohydrates_serving")
    private float carbohydratesServing;

    @JsonProperty("carbohydrates_unit")
    private String carbohydratesUnit;

    @JsonProperty("carbon-footprint-from-known-ingredients_product")
    private float carbonFootprintFromKnownIngredientsProduct;

    @JsonProperty("carbon-footprint-from-known-ingredients_100g")
    private float carbonFootprintFromKnownIngredients100G;

    @JsonProperty("carbon-footprint-from-known-ingredients_serving")
    private float carbonFootprintFromKnownIngredientsServing;

    private float cholesterol;

    @JsonProperty("cholesterol_value")
    private float cholesterolValue;

    @JsonProperty("cholesterol_100g")
    private float cholesterol100G;

    @JsonProperty("cholesterol_serving")
    private float cholesterolServing;

    @JsonProperty("cholesterol_unit")
    private String cholesterolUnit;

    private int energy;

    @JsonProperty("energy-kcal")
    private int energyKcal;

    @JsonProperty("energy-kj")
    private int energyKj;

    @JsonProperty("energy_value")
    private int energyValue;

    @JsonProperty("energy-kcal_value")
    private int energyKcalValue;

    @JsonProperty("energy-kj_value")
    private int energyKjValue;

    @JsonProperty("energy_100g")
    private int energy100G;

    @JsonProperty("energy-kcal_100g")
    private int energyKcal100G;

    @JsonProperty("energy-kj_100g")
    private int energyKj100G;

    @JsonProperty("energy_serving")
    private int energyServing;

    @JsonProperty("energy-kcal_serving")
    private int energyKcalServing;

    @JsonProperty("energy-kj_serving")
    private int energyKjServing;

    @JsonProperty("energy_unit")
    private String energyUnit;

    @JsonProperty("energy-kcal_unit")
    private String energyKcalUnit;

    @JsonProperty("energy-kj_unit")
    private String energyKjUnit;

    private float fat;

    @JsonProperty("fat_value")
    private float fatValue;

    @JsonProperty("fat_100g")
    private float fat100G;

    @JsonProperty("fat_serving")
    private float fatServing;

    @JsonProperty("fat_unit")
    private String fatUnit;

    private float fiber;

    @JsonProperty("fiber_value")
    private float fiberValue;

    @JsonProperty("fiber_100g")
    private float fiber100G;

    @JsonProperty("fiber_serving")
    private float fiberServing;

    @JsonProperty("fiber_unit")
    private String fiberUnit;

    @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    private float fruitsVegetablesNutsEstimateFromIngredients100G;

    private float iron;

    @JsonProperty("iron_value")
    private float ironValue;

    @JsonProperty("iron_100g")
    private float iron100G;

    @JsonProperty("iron_serving")
    private float ironServing;

    @JsonProperty("iron_unit")
    private String ironUnit;

    @JsonProperty("nova-group")
    private float novaGroup;

    @JsonProperty("nova-group_100g")
    private float novaGroup100G;

    @JsonProperty("nova-group_serving")
    private float novaGroupServing;

    private float proteins;

    @JsonProperty("proteins_value")
    private float proteinsValue;

    @JsonProperty("proteins_100g")
    private float proteins100G;

    @JsonProperty("proteins_serving")
    private float proteinsServing;

    @JsonProperty("proteins_unit")
    private String proteinsUnit;

    private float salt;

    @JsonProperty("salt_value")
    private float saltValue;

    @JsonProperty("salt_100g")
    private float salt100G;

    @JsonProperty("salt_serving")
    private float saltServing;

    @JsonProperty("salt_unit")
    private String saltUnit;

    @JsonProperty("saturated-fat")
    private float saturatedFat;

    @JsonProperty("saturated-fat_value")
    private float saturatedFatValue;

    @JsonProperty("saturated-fat_100g")
    private float saturatedFat100G;

    @JsonProperty("saturated-fat_serving")
    private float saturatedFatServing;

    @JsonProperty("saturated-fat_unit")
    private String saturatedFatUnit;

    private float sodium;

    @JsonProperty("sodium_value")
    private float sodiumValue;

    @JsonProperty("sodium_100g")
    private float sodium100G;

    @JsonProperty("sodium_serving")
    private float sodiumServing;

    @JsonProperty("sodium_unit")
    private String sodiumUnit;

    private float sugars;

    @JsonProperty("sugars_value")
    private float sugarsValue;

    @JsonProperty("sugars_100g")
    private float sugars100G;

    @JsonProperty("sugars_serving")
    private float sugarsServing;

    @JsonProperty("sugars_unit")
    private String sugarsUnit;

    @JsonProperty("trans-fat")
    private float transFat;

    @JsonProperty("trans-fat_value")
    private float transFatValue;

    @JsonProperty("trans-fat_100g")
    private float transFat100G;

    @JsonProperty("trans-fat_serving")
    private float transFatServing;

    @JsonProperty("trans-fat_unit")
    private String transFatUnit;

    @JsonProperty("vitamin-a")
    private float vitaminA;

    @JsonProperty("vitamin-a_value")
    private float vitaminAValue;

    @JsonProperty("vitamin-a_100g")
    private float vitaminA100G;

    @JsonProperty("vitamin-a_serving")
    private float vitaminAServing;

    @JsonProperty("vitamin-a_unit")
    private String vitaminAUnit;

    @JsonProperty("vitamin-c")
    private float vitaminC;

    @JsonProperty("vitamin-c_value")
    private float vitaminCValue;

    @JsonProperty("vitamin-c_100g")
    private float vitaminC100G;

    @JsonProperty("vitamin-c_serving")
    private float vitaminCServing;

    @JsonProperty("vitamin-c_unit")
    private String vitaminCUnit;

    @JsonProperty("vitamin-d")
    private float vitaminD;

    @JsonProperty("vitamin-d_value")
    private float vitaminDValue;

    @JsonProperty("vitamin-d_100g")
    private float vitaminD100G;

    @JsonProperty("vitamin-d_serving")
    private float vitaminDServing;

    @JsonProperty("vitamin-d_unit")
    private String vitaminDUnit;

    Map<String, Object> other = new LinkedHashMap<>();

    @JsonAnySetter
    void setDetail(String key, Object value) {
        other.put(key, value);
    }
}