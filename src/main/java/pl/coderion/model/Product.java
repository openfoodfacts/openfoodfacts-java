package pl.coderion.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Data;

@Data
public class Product {

    private Images images;

    private Ingredient[] ingredients;

    @JsonProperty("languages_codes")
    private LanguagesCodes languagesCodes;

    @JsonProperty("nutrient_levels")
    private NutrientLevels nutrientLevels;

    private Nutriments nutriments;

    @JsonProperty("selected_images")
    private SelectedImages selectedImages;

    private Source[] sources;

    @JsonProperty("additives_n")
    private int additivesN;

    @JsonProperty("additives_old_n")
    private int additivesOldN;

    @JsonProperty("additives_original_tags")
    private String[] additivesOriginalTags;

    @JsonProperty("additives_old_tags")
    private String[] additivesOldTags;

    @JsonProperty("additives_prev_original_tags")
    private String[] additivesPrevOriginalTags;

    @JsonProperty("additives_debug_tags")
    private String[] additivesDebugTags;

    @JsonProperty("additives_tags")
    private String[] additivesTags;

    private String allergens;

    @JsonProperty("allergens_from_ingredients")
    private String allergensFromIngredients;

    @JsonProperty("allergens_from_user")
    private String allergensFromUser;

    @JsonProperty("allergens_hierarchy")
    private String[] allergensHierarchy;

    @JsonProperty("allergens_lc")
    private String allergensLc;

    @JsonProperty("allergens_tags")
    private String[] allergensTags;

    @JsonProperty("amino_acids_prev_tags")
    private String[] aminoAcidsPrevTags;

    @JsonProperty("amino_acids_tags")
    private String[] aminoAcidsTags;

    private String brands;

    @JsonProperty("brands_debug_tags")
    private String[] brandsDebugTags;

    @JsonProperty("brands_tags")
    private String[] brandsTags;

    @JsonProperty("carbon_footprint_percent_of_known_ingredients")
    private String carbonFootprintPercentOfKnownIngredients;

    @JsonProperty("carbon_footprint_from_known_ingredients_debug")
    private String carbonFootprintFromKnownIngredientsDebug;

    private String categories;

    @JsonProperty("categories_hierarchy")
    private String[] categoriesHierarchy;

    @JsonProperty("categories_lc")
    private String categoriesLc;

    @JsonProperty("categories_properties_tags")
    private String[] categoriesPropertiesTags;

    @JsonProperty("categories_tags")
    private String[] categoriesTags;

    @JsonProperty("checkers_tags")
    private String[] checkersTags;

    @JsonProperty("cities_tags")
    private String[] citiesTags;

    private String code;

    @JsonProperty("codes_tags")
    private String[] codesTags;

    @JsonProperty("compared_to_category")
    private String comparedToCategory;

    private int complete;

    @JsonProperty("completed_t")
    private long completedT;

    private float completeness;

    @JsonProperty("conservation_conditions")
    private String conservationConditions;

    private String countries;

    @JsonProperty("countries_hierarchy")
    private String[] countriesHierarchy;

    @JsonProperty("countries_lc")
    private String countriesLc;

    @JsonProperty("countries_debug_tags")
    private String[] countriesDebugTags;

    @JsonProperty("countries_tags")
    private String[] countriesTags;

    @JsonProperty("correctors_tags")
    private String[] correctorsTags;

    @JsonProperty("created_t")
    private long createdT;

    private String creator;

    @JsonProperty("data_quality_bugs_tags")
    private String[] dataQualityBugsTags;

    @JsonProperty("data_quality_errors_tags")
    private String[] dataQualityErrorsTags;

    @JsonProperty("data_quality_info_tags")
    private String[] dataQualityInfoTags;

    @JsonProperty("data_quality_tags")
    private String[] dataQualityTags;

    @JsonProperty("data_quality_warnings_tags")
    private String[] dataQualityWarningsTags;

    @JsonProperty("data_sources")
    private String dataSources;

    @JsonProperty("data_sources_tags")
    private String[] dataSourcesTags;

    @JsonProperty("debug_param_sorted_langs")
    private String[] debugParamSortedLangs;

    @JsonProperty("editors_tags")
    private String[] editorsTags;

    @JsonProperty("emb_codes")
    private String embCodes;

    @JsonProperty("emb_codes_debug_tags")
    private String[] embCodesDebugTags;

    @JsonProperty("emb_codes_orig")
    private String embCodesOrig;

    @JsonProperty("emb_codes_tags")
    private String[] embCodesTags;

    @JsonProperty("entry_dates_tags")
    private String[] entryDatesTags;

    @JsonProperty("expiration_date")
    private String expirationDate;

    @JsonProperty("expiration_date_debug_tags")
    private String[] expirationDateDebugTags;

    @JsonProperty("fruits-vegetables-nuts_100g_estimate")
    private int fruitsVegetablesNuts100GEstimate;

    @JsonProperty("generic_name")
    private String genericName;

    private String id;

    private String _id;

    @JsonProperty("image_front_small_url")
    private String imageFrontSmallUrl;

    @JsonProperty("image_front_thumb_url")
    private String imageFrontThumbUrl;

    @JsonProperty("image_front_url")
    private String imageFrontUrl;

    @JsonProperty("image_ingredients_url")
    private String imageIngredientsUrl;

    @JsonProperty("image_ingredients_small_url")
    private String imageIngredientsSmallUrl;

    @JsonProperty("image_ingredients_thumb_url")
    private String imageIngredientsThumbUrl;

    @JsonProperty("image_nutrition_small_url")
    private String imageNutritionSmallUrl;

    @JsonProperty("image_nutrition_thumb_url")
    private String imageNutritionThumbUrl;

    @JsonProperty("image_nutrition_url")
    private String imageNutritionUrl;

    @JsonProperty("image_small_url")
    private String imageSmallUrl;

    @JsonProperty("image_thumb_url")
    private String imageThumbUrl;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("informers_tags")
    private String[] informersTags;

    @JsonProperty("ingredients_analysis_tags")
    private String[] ingredientsAnalysisTags;

    @JsonProperty("ingredients_debug")
    private String[] ingredientsDebug;

    @JsonProperty("ingredients_from_or_that_may_be_from_palm_oil_n")
    private int ingredientsFromOrThatMayBeFromPalmOilN;

    @JsonProperty("ingredients_from_palm_oil_tags")
    private String[] ingredientsFromPalmOilTags;

    @JsonProperty("ingredients_from_palm_oil_n")
    private int ingredientsFromPalmOilN;

    @JsonProperty("ingredients_hierarchy")
    private String[] ingredientsHierarchy;

    @JsonProperty("ingredients_ids_debug")
    private String[] ingredientsIdsDebug;

    @JsonProperty("ingredients_n")
    private int ingredientsN;

    @JsonProperty("ingredients_n_tags")
    private String[] ingredientsNTags;

    @JsonProperty("ingredients_original_tags")
    private String[] ingredientsOriginalTags;

    @JsonProperty("ingredients_tags")
    private String[] ingredientsTags;

    @JsonProperty("ingredients_text")
    private String ingredientsText;

    @JsonProperty("ingredients_text_debug")
    private String ingredientsTextDebug;

    @JsonProperty("ingredients_text_with_allergens")
    private String ingredientsTextWithAllergens;

    @JsonProperty("ingredients_that_may_be_from_palm_oil_n")
    private int ingredientsThatMayBeFromPalmOilN;

    @JsonProperty("ingredients_that_may_be_from_palm_oil_tags")
    private String[] ingredientsThatMayBeFromPalmOilTags;

    @JsonProperty("interface_version_created")
    private String interfaceVersionCreated;

    @JsonProperty("interface_version_modified")
    private String interfaceVersionModified;

    @JsonProperty("_keywords")
    private String[] keywords;

    @JsonProperty("known_ingredients_n")
    private int knownIngredientsN;

    private String labels;

    @JsonProperty("labels_hierarchy")
    private String[] labelsHierarchy;

    @JsonProperty("labels_lc")
    private String labelsLc;

    @JsonProperty("labels_prev_hierarchy")
    private String[] labelsPrevHierarchy;

    @JsonProperty("labels_prev_tags")
    private String[] labelsPrevTags;

    @JsonProperty("labels_tags")
    private String[] labelsTags;

    @JsonProperty("labels_debug_tags")
    private String[] labelsDebugTags;

    private String lang;

    @JsonProperty("lang_debug_tags")
    private String[] langDebugTags;

    @JsonProperty("languages_hierarchy")
    private String[] languagesHierarchy;

    @JsonProperty("languages_tags")
    private String[] languagesTags;

    @JsonProperty("last_edit_dates_tags")
    private String[] lastEditDatesTags;

    @JsonProperty("last_editor")
    private String lastEditor;

    @JsonProperty("last_image_dates_tags")
    private String[] lastImageDatesTags;

    @JsonProperty("last_image_t")
    private long lastImageT;

    @JsonProperty("last_modified_by")
    private String lastModifiedBy;

    @JsonProperty("last_modified_t")
    private long lastModifiedT;

    private String lc;

    private String link;

    @JsonProperty("link_debug_tags")
    private String[] linkDebugTags;

    @JsonProperty("manufacturing_places")
    private String manufacturingPlaces;

    @JsonProperty("manufacturing_places_debug_tags")
    private String[] manufacturingPlacesDebugTags;

    @JsonProperty("manufacturing_places_tags")
    private String[] manufacturingPlacesTags;

    @JsonProperty("max_imgid")
    private String maxImgid;

    @JsonProperty("minerals_prev_tags")
    private String[] mineralsPrevTags;

    @JsonProperty("minerals_tags")
    private String[] mineralsTags;

    @JsonProperty("misc_tags")
    private String[] miscTags;

    @JsonProperty("net_weight_unit")
    private String netWeightUnit;

    @JsonProperty("net_weight_value")
    private String netWeightValue;

    @JsonProperty("nutrition_data_per")
    private String nutritionDataPer;

    @JsonProperty("nutrition_score_warning_no_fruits_vegetables_nuts")
    private int nutritionScoreWarningNoFruitsVegetablesNuts;

    @JsonProperty("no_nutrition_data")
    private String noNutritionData;

    @JsonProperty("nova_group")
    private String novaGroup;

    @JsonProperty("nova_groups")
    private String novaGroups;

    @JsonProperty("nova_group_debug")
    private String novaGroupDebug;

    @JsonProperty("nova_group_tags")
    private String[] novaGroupTags;

    @JsonProperty("nova_groups_tags")
    private String[] novaGroupsTags;

    @JsonProperty("nucleotides_prev_tags")
    private String[] nucleotidesPrevTags;

    @JsonProperty("nucleotides_tags")
    private String[] nucleotidesTags;

    @JsonProperty("nutrient_levels_tags")
    private String[] nutrientLevelsTags;

    @JsonProperty("nutrition_data")
    private String nutritionData;

    @JsonProperty("nutrition_data_per_debug_tags")
    private String[] nutritionDataPerDebugTags;

    @JsonProperty("nutrition_data_prepared")
    private String nutritionDataPrepared;

    @JsonProperty("nutrition_data_prepared_per")
    private String nutritionDataPreparedPer;

    @JsonProperty("nutrition_grades")
    private String nutritionGrades;

    @JsonProperty("nutrition_score_beverage")
    private int nutritionScoreBeverage;

    @JsonProperty("nutrition_score_debug")
    private String nutritionScoreDebug;

    @JsonProperty("nutrition_score_warning_no_fiber")
    private int nutritionScoreWarningNoFiber;

    @JsonProperty("nutrition_grades_tags")
    private String[] nutritionGradesTags;

    private String origins;

    @JsonProperty("origins_debug_tags")
    private String[] originsDebugTags;

    @JsonProperty("origins_tags")
    private String[] originsTags;

    @JsonProperty("other_information")
    private String otherInformation;

    @JsonProperty("other_nutritional_substances_tags")
    private String[] otherNutritionalSubstancesTags;

    private String packaging;

    @JsonProperty("packaging_debug_tags")
    private String[] packagingDebugTags;

    @JsonProperty("packaging_tags")
    private String[] packagingTags;

    @JsonProperty("photographers_tags")
    private String[] photographersTags;

    @JsonProperty("pnns_groups_1")
    private String pnnsGroups1;

    @JsonProperty("pnns_groups_2")
    private String pnnsGroups2;

    @JsonProperty("pnns_groups_1_tags")
    private String[] pnnsGroups1Tags;

    @JsonProperty("pnns_groups_2_tags")
    private String[] pnnsGroups2Tags;

    @JsonProperty("popularity_key")
    private long popularityKey;

    @JsonProperty("producer_version_id")
    private String producerVersionId;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("product_quantity")
    private String productQuantity;

    @JsonProperty("purchase_places")
    private String purchasePlaces;

    @JsonProperty("purchase_places_debug_tags")
    private String[] purchasePlacesDebugTags;

    @JsonProperty("purchase_places_tags")
    private String[] purchasePlacesTags;

    @JsonProperty("quality_tags")
    private String[] qualityTags;

    private String quantity;

    @JsonProperty("quantity_debug_tags")
    private String[] quantityDebugTags;

    @JsonProperty("recycling_instructions_to_discard")
    private String recyclingInstructionsToDiscard;

    private int rev;

    @JsonProperty("serving_quantity")
    private String servingQuantity;

    @JsonProperty("serving_size")
    private String servingSize;

    @JsonProperty("serving_size_debug_tags")
    private String[] servingSizeDebugTags;

    private long sortkey;

    private String states;

    @JsonProperty("states_hierarchy")
    private String[] statesHierarchy;

    @JsonProperty("states_tags")
    private String[] statesTags;

    private String stores;

    @JsonProperty("stores_debug_tags")
    private String[] storesDebugTags;

    @JsonProperty("stores_tags")
    private String[] storesTags;

    private String traces;

    @JsonProperty("traces_from_ingredients")
    private String tracesFromIngredients;

    @JsonProperty("traces_hierarchy")
    private String[] tracesHierarchy;

    @JsonProperty("traces_debug_tags")
    private String[] tracesDebugTags;

    @JsonProperty("traces_from_user")
    private String tracesFromUser;

    @JsonProperty("traces_lc")
    private String tracesLc;

    @JsonProperty("traces_tags")
    private String[] tracesTags;

    @JsonProperty("unknown_ingredients_n")
    private int unknownIngredientsN;

    @JsonProperty("unknown_nutrients_tags")
    private String[] unknownNutrientsTags;

    @JsonProperty("update_key")
    private String updateKey;

    @JsonProperty("vitamins_prev_tags")
    private String[] vitaminsPrevTags;

    @JsonProperty("vitamins_tags")
    private String[] vitaminsTags;

    Map<String, Object> other = new LinkedHashMap<>();

    @JsonAnySetter
    void setDetail(String key, Object value) {
        other.put(key, value);
    }
}
