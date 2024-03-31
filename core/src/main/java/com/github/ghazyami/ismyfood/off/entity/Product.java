package com.github.ghazyami.ismyfood.off.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;


public class Product implements Serializable {

    private Images images;

    private List<Ingredient> ingredients;

    @JsonbProperty("languages_codes")
    private LanguagesCodes languagesCodes;

    @JsonbProperty("nutrient_levels")
    private NutrientLevels nutrientLevels;

    private Nutriments nutriments;

    @JsonbProperty("selected_images")
    private SelectedImages selectedImages;

    private List<Source> sources;

    @JsonbProperty("additives_n")
    private int additivesN;

    @JsonbProperty("additives_old_n")
    private int additivesOldN;

    @JsonbProperty("additives_original_tags")
    private List<String> additivesOriginalTags;

    @JsonbProperty("additives_old_tags")
    private List<String> additivesOldTags;

    @JsonbProperty("additives_prev_original_tags")
    private List<String> additivesPrevOriginalTags;

    @JsonbProperty("additives_debug_tags")
    private List<String> additivesDebugTags;

    @JsonbProperty("additives_tags")
    private List<String> additivesTags;

    private String allergens;

    @JsonbProperty("allergens_from_ingredients")
    private String allergensFromIngredients;

    @JsonbProperty("allergens_from_user")
    private String allergensFromUser;

    @JsonbProperty("allergens_hierarchy")
    private List<String> allergensHierarchy;

    @JsonbProperty("allergens_lc")
    private String allergensLc;

    @JsonbProperty("allergens_tags")
    private List<String> allergensTags;

    @JsonbProperty("amino_acids_prev_tags")
    private List<String> aminoAcidsPrevTags;

    @JsonbProperty("amino_acids_tags")
    private List<String> aminoAcidsTags;

    private String brands;

    @JsonbProperty("brands_debug_tags")
    private List<String> brandsDebugTags;

    @JsonbProperty("brands_tags")
    private List<String> brandsTags;

    @JsonbProperty("carbon_footprint_percent_of_known_ingredients")
    private String carbonFootprintPercentOfKnownIngredients;

    @JsonbProperty("carbon_footprint_from_known_ingredients_debug")
    private String carbonFootprintFromKnownIngredientsDebug;

    private String categories;

    @JsonbProperty("categories_hierarchy")
    private List<String> categoriesHierarchy;

    @JsonbProperty("categories_lc")
    private String categoriesLc;

    @JsonbProperty("categories_properties_tags")
    private List<String> categoriesPropertiesTags;

    @JsonbProperty("categories_tags")
    private List<String> categoriesTags;

    @JsonbProperty("checkers_tags")
    private List<String> checkersTags;

    @JsonbProperty("cities_tags")
    private List<String> citiesTags;

    private String code;

    @JsonbProperty("codes_tags")
    private List<String> codesTags;

    @JsonbProperty("compared_to_category")
    private String comparedToCategory;

    private int complete;

    @JsonbProperty("completed_t")
    private long completedT;

    private float completeness;

    @JsonbProperty("conservation_conditions")
    private String conservationConditions;

    private String countries;

    @JsonbProperty("countries_hierarchy")
    private List<String> countriesHierarchy;

    @JsonbProperty("countries_lc")
    private String countriesLc;

    @JsonbProperty("countries_debug_tags")
    private List<String> countriesDebugTags;

    @JsonbProperty("countries_tags")
    private List<String> countriesTags;

    @JsonbProperty("correctors_tags")
    private List<String> correctorsTags;

    @JsonbProperty("created_t")
    private long createdT;

    private String creator;

    @JsonbProperty("data_quality_bugs_tags")
    private List<String> dataQualityBugsTags;

    @JsonbProperty("data_quality_errors_tags")
    private List<String> dataQualityErrorsTags;

    @JsonbProperty("data_quality_info_tags")
    private List<String> dataQualityInfoTags;

    @JsonbProperty("data_quality_tags")
    private List<String> dataQualityTags;

    @JsonbProperty("data_quality_warnings_tags")
    private List<String> dataQualityWarningsTags;

    @JsonbProperty("data_sources")
    private String dataSources;

    @JsonbProperty("data_sources_tags")
    private List<String> dataSourcesTags;

    @JsonbProperty("debug_param_sorted_langs")
    private List<String> debugParamSortedLangs;

    @JsonbProperty("editors_tags")
    private List<String> editorsTags;

    @JsonbProperty("emb_codes")
    private String embCodes;

    @JsonbProperty("emb_codes_debug_tags")
    private List<String> embCodesDebugTags;

    @JsonbProperty("emb_codes_orig")
    private String embCodesOrig;

    @JsonbProperty("emb_codes_tags")
    private List<String> embCodesTags;

    @JsonbProperty("entry_dates_tags")
    private List<String> entryDatesTags;

    @JsonbProperty("expiration_date")
    private String expirationDate;

    @JsonbProperty("expiration_date_debug_tags")
    private List<String> expirationDateDebugTags;

    @JsonbProperty("fruits-vegetables-nuts_100g_estimate")
    private int fruitsVegetablesNuts100GEstimate;

    @JsonbProperty("generic_name")
    private String genericName;

    private String id;

    private String _id;

    @JsonbProperty("image_front_small_url")
    private String imageFrontSmallUrl;

    @JsonbProperty("image_front_thumb_url")
    private String imageFrontThumbUrl;

    @JsonbProperty("image_front_url")
    private String imageFrontUrl;

    @JsonbProperty("image_ingredients_url")
    private String imageIngredientsUrl;

    @JsonbProperty("image_ingredients_small_url")
    private String imageIngredientsSmallUrl;

    @JsonbProperty("image_ingredients_thumb_url")
    private String imageIngredientsThumbUrl;

    @JsonbProperty("image_nutrition_small_url")
    private String imageNutritionSmallUrl;

    @JsonbProperty("image_nutrition_thumb_url")
    private String imageNutritionThumbUrl;

    @JsonbProperty("image_nutrition_url")
    private String imageNutritionUrl;

    @JsonbProperty("image_small_url")
    private String imageSmallUrl;

    @JsonbProperty("image_thumb_url")
    private String imageThumbUrl;

    @JsonbProperty("image_url")
    private String imageUrl;

    @JsonbProperty("informers_tags")
    private List<String> informersTags;

    @JsonbProperty("ingredients_analysis_tags")
    private List<String> ingredientsAnalysisTags;

    @JsonbProperty("ingredients_debug")
    private List<String> ingredientsDebug;

    @JsonbProperty("ingredients_from_or_that_may_be_from_palm_oil_n")
    private int ingredientsFromOrThatMayBeFromPalmOilN;

    @JsonbProperty("ingredients_from_palm_oil_tags")
    private List<String> ingredientsFromPalmOilTags;

    @JsonbProperty("ingredients_from_palm_oil_n")
    private int ingredientsFromPalmOilN;

    @JsonbProperty("ingredients_hierarchy")
    private List<String> ingredientsHierarchy;

    @JsonbProperty("ingredients_ids_debug")
    private List<String> ingredientsIdsDebug;

    @JsonbProperty("ingredients_n")
    private int ingredientsN;

    @JsonbProperty("ingredients_n_tags")
    private List<String> ingredientsNTags;

    @JsonbProperty("ingredients_original_tags")
    private List<String> ingredientsOriginalTags;

    @JsonbProperty("ingredients_tags")
    private List<String> ingredientsTags;

    @JsonbProperty("ingredients_text")
    private String ingredientsText;

    @JsonbProperty("ingredients_text_debug")
    private String ingredientsTextDebug;

    @JsonbProperty("ingredients_text_with_allergens")
    private String ingredientsTextWithAllergens;

    @JsonbProperty("ingredients_that_may_be_from_palm_oil_n")
    private int ingredientsThatMayBeFromPalmOilN;

    @JsonbProperty("ingredients_that_may_be_from_palm_oil_tags")
    private List<String> ingredientsThatMayBeFromPalmOilTags;

    @JsonbProperty("interface_version_created")
    private String interfaceVersionCreated;

    @JsonbProperty("interface_version_modified")
    private String interfaceVersionModified;

    @JsonbProperty("_keywords")
    private List<String> keywords;

    @JsonbProperty("known_ingredients_n")
    private int knownIngredientsN;

    private String labels;

    @JsonbProperty("labels_hierarchy")
    private List<String> labelsHierarchy;

    @JsonbProperty("labels_lc")
    private String labelsLc;

    @JsonbProperty("labels_prev_hierarchy")
    private List<String> labelsPrevHierarchy;

    @JsonbProperty("labels_prev_tags")
    private List<String> labelsPrevTags;

    @JsonbProperty("labels_tags")
    private List<String> labelsTags;

    @JsonbProperty("labels_debug_tags")
    private List<String> labelsDebugTags;

    private String lang;

    @JsonbProperty("lang_debug_tags")
    private List<String> langDebugTags;

    @JsonbProperty("languages_hierarchy")
    private List<String> languagesHierarchy;

    @JsonbProperty("languages_tags")
    private List<String> languagesTags;

    @JsonbProperty("last_edit_dates_tags")
    private List<String> lastEditDatesTags;

    @JsonbProperty("last_editor")
    private String lastEditor;

    @JsonbProperty("last_image_dates_tags")
    private List<String> lastImageDatesTags;

    @JsonbProperty("last_image_t")
    private long lastImageT;

    @JsonbProperty("last_modified_by")
    private String lastModifiedBy;

    @JsonbProperty("last_modified_t")
    private long lastModifiedT;

    private String lc;

    private String link;

    @JsonbProperty("link_debug_tags")
    private List<String> linkDebugTags;

    @JsonbProperty("manufacturing_places")
    private String manufacturingPlaces;

    @JsonbProperty("manufacturing_places_debug_tags")
    private List<String> manufacturingPlacesDebugTags;

    @JsonbProperty("manufacturing_places_tags")
    private List<String> manufacturingPlacesTags;

    @JsonbProperty("max_imgid")
    private String maxImgid;

    @JsonbProperty("minerals_prev_tags")
    private List<String> mineralsPrevTags;

    @JsonbProperty("minerals_tags")
    private List<String> mineralsTags;

    @JsonbProperty("misc_tags")
    private List<String> miscTags;

    @JsonbProperty("net_weight_unit")
    private String netWeightUnit;

    @JsonbProperty("net_weight_value")
    private String netWeightValue;

    @JsonbProperty("nutrition_data_per")
    private String nutritionDataPer;

    @JsonbProperty("nutrition_score_warning_no_fruits_vegetables_nuts")
    private int nutritionScoreWarningNoFruitsVegetablesNuts;

    @JsonbProperty("no_nutrition_data")
    private String noNutritionData;

    @JsonbProperty("nova_group")
    private String novaGroup;

    @JsonbProperty("nova_groups")
    private String novaGroups;

    @JsonbProperty("nova_group_debug")
    private String novaGroupDebug;

    @JsonbProperty("nova_group_tags")
    private List<String> novaGroupTags;

    @JsonbProperty("nova_groups_tags")
    private List<String> novaGroupsTags;

    @JsonbProperty("nucleotides_prev_tags")
    private List<String> nucleotidesPrevTags;

    @JsonbProperty("nucleotides_tags")
    private List<String> nucleotidesTags;

    @JsonbProperty("nutrient_levels_tags")
    private List<String> nutrientLevelsTags;

    @JsonbProperty("nutrition_data")
    private String nutritionData;

    @JsonbProperty("nutrition_data_per_debug_tags")
    private List<String> nutritionDataPerDebugTags;

    @JsonbProperty("nutrition_data_prepared")
    private String nutritionDataPrepared;

    @JsonbProperty("nutrition_data_prepared_per")
    private String nutritionDataPreparedPer;

    @JsonbProperty("nutrition_grades")
    private String nutritionGrades;

    @JsonbProperty("nutrition_score_beverage")
    private int nutritionScoreBeverage;

    @JsonbProperty("nutrition_score_debug")
    private String nutritionScoreDebug;

    @JsonbProperty("nutrition_score_warning_no_fiber")
    private int nutritionScoreWarningNoFiber;

    @JsonbProperty("nutrition_grades_tags")
    private List<String> nutritionGradesTags;

    private String origins;

    @JsonbProperty("origins_debug_tags")
    private List<String> originsDebugTags;

    @JsonbProperty("origins_tags")
    private List<String> originsTags;

    @JsonbProperty("other_information")
    private String otherInformation;

    @JsonbProperty("other_nutritional_substances_tags")
    private List<String> otherNutritionalSubstancesTags;

    private String packaging;

    @JsonbProperty("packaging_debug_tags")
    private List<String> packagingDebugTags;

    @JsonbProperty("packaging_tags")
    private List<String> packagingTags;

    @JsonbProperty("photographers_tags")
    private List<String> photographersTags;

    @JsonbProperty("pnns_groups_1")
    private String pnnsGroups1;

    @JsonbProperty("pnns_groups_2")
    private String pnnsGroups2;

    @JsonbProperty("pnns_groups_1_tags")
    private List<String> pnnsGroups1Tags;

    @JsonbProperty("pnns_groups_2_tags")
    private List<String> pnnsGroups2Tags;

    @JsonbProperty("popularity_key")
    private long popularityKey;

    @JsonbProperty("producer_version_id")
    private String producerVersionId;

    @JsonbProperty("product_name")
    private String productName;

    @JsonbProperty("product_quantity")
    private String productQuantity;

    @JsonbProperty("purchase_places")
    private String purchasePlaces;

    @JsonbProperty("purchase_places_debug_tags")
    private List<String> purchasePlacesDebugTags;

    @JsonbProperty("purchase_places_tags")
    private List<String> purchasePlacesTags;

    @JsonbProperty("quality_tags")
    private List<String> qualityTags;

    private String quantity;

    @JsonbProperty("quantity_debug_tags")
    private List<String> quantityDebugTags;

    @JsonbProperty("recycling_instructions_to_discard")
    private String recyclingInstructionsToDiscard;

    private int rev;

    @JsonbProperty("serving_quantity")
    private String servingQuantity;

    @JsonbProperty("serving_size")
    private String servingSize;

    @JsonbProperty("serving_size_debug_tags")
    private List<String> servingSizeDebugTags;

    private long sortkey;

    private String states;

    @JsonbProperty("states_hierarchy")
    private List<String> statesHierarchy;

    @JsonbProperty("states_tags")
    private List<String> statesTags;

    private String stores;

    @JsonbProperty("stores_debug_tags")
    private List<String> storesDebugTags;

    @JsonbProperty("stores_tags")
    private List<String> storesTags;

    private String traces;

    @JsonbProperty("traces_from_ingredients")
    private String tracesFromIngredients;

    @JsonbProperty("traces_hierarchy")
    private List<String> tracesHierarchy;

    @JsonbProperty("traces_debug_tags")
    private List<String> tracesDebugTags;

    @JsonbProperty("traces_from_user")
    private String tracesFromUser;

    @JsonbProperty("traces_lc")
    private String tracesLc;

    @JsonbProperty("traces_tags")
    private List<String> tracesTags;

    @JsonbProperty("unknown_ingredients_n")
    private int unknownIngredientsN;

    @JsonbProperty("unknown_nutrients_tags")
    private List<String> unknownNutrientsTags;

    @JsonbProperty("update_key")
    private String updateKey;

    @JsonbProperty("vitamins_prev_tags")
    private List<String> vitaminsPrevTags;

    @JsonbProperty("vitamins_tags")
    private List<String> vitaminsTags;

    Map<String, Object> other = new LinkedHashMap<>();

//    @JsonAnySetter
//    void setDetail(String key, Object value) {
//        other.put(key, value);
//    }


    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public LanguagesCodes getLanguagesCodes() {
        return languagesCodes;
    }

    public void setLanguagesCodes(LanguagesCodes languagesCodes) {
        this.languagesCodes = languagesCodes;
    }

    public NutrientLevels getNutrientLevels() {
        return nutrientLevels;
    }

    public void setNutrientLevels(NutrientLevels nutrientLevels) {
        this.nutrientLevels = nutrientLevels;
    }

    public Nutriments getNutriments() {
        return nutriments;
    }

    public void setNutriments(Nutriments nutriments) {
        this.nutriments = nutriments;
    }

    public SelectedImages getSelectedImages() {
        return selectedImages;
    }

    public void setSelectedImages(SelectedImages selectedImages) {
        this.selectedImages = selectedImages;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public int getAdditivesN() {
        return additivesN;
    }

    public void setAdditivesN(int additivesN) {
        this.additivesN = additivesN;
    }

    public int getAdditivesOldN() {
        return additivesOldN;
    }

    public void setAdditivesOldN(int additivesOldN) {
        this.additivesOldN = additivesOldN;
    }

    public List<String> getAdditivesOriginalTags() {
        return additivesOriginalTags;
    }

    public void setAdditivesOriginalTags(List<String> additivesOriginalTags) {
        this.additivesOriginalTags = additivesOriginalTags;
    }

    public List<String> getAdditivesOldTags() {
        return additivesOldTags;
    }

    public void setAdditivesOldTags(List<String> additivesOldTags) {
        this.additivesOldTags = additivesOldTags;
    }

    public List<String> getAdditivesPrevOriginalTags() {
        return additivesPrevOriginalTags;
    }

    public void setAdditivesPrevOriginalTags(List<String> additivesPrevOriginalTags) {
        this.additivesPrevOriginalTags = additivesPrevOriginalTags;
    }

    public List<String> getAdditivesDebugTags() {
        return additivesDebugTags;
    }

    public void setAdditivesDebugTags(List<String> additivesDebugTags) {
        this.additivesDebugTags = additivesDebugTags;
    }

    public List<String> getAdditivesTags() {
        return additivesTags;
    }

    public void setAdditivesTags(List<String> additivesTags) {
        this.additivesTags = additivesTags;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public String getAllergensFromIngredients() {
        return allergensFromIngredients;
    }

    public void setAllergensFromIngredients(String allergensFromIngredients) {
        this.allergensFromIngredients = allergensFromIngredients;
    }

    public String getAllergensFromUser() {
        return allergensFromUser;
    }

    public void setAllergensFromUser(String allergensFromUser) {
        this.allergensFromUser = allergensFromUser;
    }

    public List<String> getAllergensHierarchy() {
        return allergensHierarchy;
    }

    public void setAllergensHierarchy(List<String> allergensHierarchy) {
        this.allergensHierarchy = allergensHierarchy;
    }

    public String getAllergensLc() {
        return allergensLc;
    }

    public void setAllergensLc(String allergensLc) {
        this.allergensLc = allergensLc;
    }

    public List<String> getAllergensTags() {
        return allergensTags;
    }

    public void setAllergensTags(List<String> allergensTags) {
        this.allergensTags = allergensTags;
    }

    public List<String> getAminoAcidsPrevTags() {
        return aminoAcidsPrevTags;
    }

    public void setAminoAcidsPrevTags(List<String> aminoAcidsPrevTags) {
        this.aminoAcidsPrevTags = aminoAcidsPrevTags;
    }

    public List<String> getAminoAcidsTags() {
        return aminoAcidsTags;
    }

    public void setAminoAcidsTags(List<String> aminoAcidsTags) {
        this.aminoAcidsTags = aminoAcidsTags;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public List<String> getBrandsDebugTags() {
        return brandsDebugTags;
    }

    public void setBrandsDebugTags(List<String> brandsDebugTags) {
        this.brandsDebugTags = brandsDebugTags;
    }

    public List<String> getBrandsTags() {
        return brandsTags;
    }

    public void setBrandsTags(List<String> brandsTags) {
        this.brandsTags = brandsTags;
    }

    public String getCarbonFootprintPercentOfKnownIngredients() {
        return carbonFootprintPercentOfKnownIngredients;
    }

    public void setCarbonFootprintPercentOfKnownIngredients(String carbonFootprintPercentOfKnownIngredients) {
        this.carbonFootprintPercentOfKnownIngredients = carbonFootprintPercentOfKnownIngredients;
    }

    public String getCarbonFootprintFromKnownIngredientsDebug() {
        return carbonFootprintFromKnownIngredientsDebug;
    }

    public void setCarbonFootprintFromKnownIngredientsDebug(String carbonFootprintFromKnownIngredientsDebug) {
        this.carbonFootprintFromKnownIngredientsDebug = carbonFootprintFromKnownIngredientsDebug;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public List<String> getCategoriesHierarchy() {
        return categoriesHierarchy;
    }

    public void setCategoriesHierarchy(List<String> categoriesHierarchy) {
        this.categoriesHierarchy = categoriesHierarchy;
    }

    public String getCategoriesLc() {
        return categoriesLc;
    }

    public void setCategoriesLc(String categoriesLc) {
        this.categoriesLc = categoriesLc;
    }

    public List<String> getCategoriesPropertiesTags() {
        return categoriesPropertiesTags;
    }

    public void setCategoriesPropertiesTags(List<String> categoriesPropertiesTags) {
        this.categoriesPropertiesTags = categoriesPropertiesTags;
    }

    public List<String> getCategoriesTags() {
        return categoriesTags;
    }

    public void setCategoriesTags(List<String> categoriesTags) {
        this.categoriesTags = categoriesTags;
    }

    public List<String> getCheckersTags() {
        return checkersTags;
    }

    public void setCheckersTags(List<String> checkersTags) {
        this.checkersTags = checkersTags;
    }

    public List<String> getCitiesTags() {
        return citiesTags;
    }

    public void setCitiesTags(List<String> citiesTags) {
        this.citiesTags = citiesTags;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getCodesTags() {
        return codesTags;
    }

    public void setCodesTags(List<String> codesTags) {
        this.codesTags = codesTags;
    }

    public String getComparedToCategory() {
        return comparedToCategory;
    }

    public void setComparedToCategory(String comparedToCategory) {
        this.comparedToCategory = comparedToCategory;
    }

    public int getComplete() {
        return complete;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public long getCompletedT() {
        return completedT;
    }

    public void setCompletedT(long completedT) {
        this.completedT = completedT;
    }

    public float getCompleteness() {
        return completeness;
    }

    public void setCompleteness(float completeness) {
        this.completeness = completeness;
    }

    public String getConservationConditions() {
        return conservationConditions;
    }

    public void setConservationConditions(String conservationConditions) {
        this.conservationConditions = conservationConditions;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public List<String> getCountriesHierarchy() {
        return countriesHierarchy;
    }

    public void setCountriesHierarchy(List<String> countriesHierarchy) {
        this.countriesHierarchy = countriesHierarchy;
    }

    public String getCountriesLc() {
        return countriesLc;
    }

    public void setCountriesLc(String countriesLc) {
        this.countriesLc = countriesLc;
    }

    public List<String> getCountriesDebugTags() {
        return countriesDebugTags;
    }

    public void setCountriesDebugTags(List<String> countriesDebugTags) {
        this.countriesDebugTags = countriesDebugTags;
    }

    public List<String> getCountriesTags() {
        return countriesTags;
    }

    public void setCountriesTags(List<String> countriesTags) {
        this.countriesTags = countriesTags;
    }

    public List<String> getCorrectorsTags() {
        return correctorsTags;
    }

    public void setCorrectorsTags(List<String> correctorsTags) {
        this.correctorsTags = correctorsTags;
    }

    public long getCreatedT() {
        return createdT;
    }

    public void setCreatedT(long createdT) {
        this.createdT = createdT;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public List<String> getDataQualityBugsTags() {
        return dataQualityBugsTags;
    }

    public void setDataQualityBugsTags(List<String> dataQualityBugsTags) {
        this.dataQualityBugsTags = dataQualityBugsTags;
    }

    public List<String> getDataQualityErrorsTags() {
        return dataQualityErrorsTags;
    }

    public void setDataQualityErrorsTags(List<String> dataQualityErrorsTags) {
        this.dataQualityErrorsTags = dataQualityErrorsTags;
    }

    public List<String> getDataQualityInfoTags() {
        return dataQualityInfoTags;
    }

    public void setDataQualityInfoTags(List<String> dataQualityInfoTags) {
        this.dataQualityInfoTags = dataQualityInfoTags;
    }

    public List<String> getDataQualityTags() {
        return dataQualityTags;
    }

    public void setDataQualityTags(List<String> dataQualityTags) {
        this.dataQualityTags = dataQualityTags;
    }

    public List<String> getDataQualityWarningsTags() {
        return dataQualityWarningsTags;
    }

    public void setDataQualityWarningsTags(List<String> dataQualityWarningsTags) {
        this.dataQualityWarningsTags = dataQualityWarningsTags;
    }

    public String getDataSources() {
        return dataSources;
    }

    public void setDataSources(String dataSources) {
        this.dataSources = dataSources;
    }

    public List<String> getDataSourcesTags() {
        return dataSourcesTags;
    }

    public void setDataSourcesTags(List<String> dataSourcesTags) {
        this.dataSourcesTags = dataSourcesTags;
    }

    public List<String> getDebugParamSortedLangs() {
        return debugParamSortedLangs;
    }

    public void setDebugParamSortedLangs(List<String> debugParamSortedLangs) {
        this.debugParamSortedLangs = debugParamSortedLangs;
    }

    public List<String> getEditorsTags() {
        return editorsTags;
    }

    public void setEditorsTags(List<String> editorsTags) {
        this.editorsTags = editorsTags;
    }

    public String getEmbCodes() {
        return embCodes;
    }

    public void setEmbCodes(String embCodes) {
        this.embCodes = embCodes;
    }

    public List<String> getEmbCodesDebugTags() {
        return embCodesDebugTags;
    }

    public void setEmbCodesDebugTags(List<String> embCodesDebugTags) {
        this.embCodesDebugTags = embCodesDebugTags;
    }

    public String getEmbCodesOrig() {
        return embCodesOrig;
    }

    public void setEmbCodesOrig(String embCodesOrig) {
        this.embCodesOrig = embCodesOrig;
    }

    public List<String> getEmbCodesTags() {
        return embCodesTags;
    }

    public void setEmbCodesTags(List<String> embCodesTags) {
        this.embCodesTags = embCodesTags;
    }

    public List<String> getEntryDatesTags() {
        return entryDatesTags;
    }

    public void setEntryDatesTags(List<String> entryDatesTags) {
        this.entryDatesTags = entryDatesTags;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public List<String> getExpirationDateDebugTags() {
        return expirationDateDebugTags;
    }

    public void setExpirationDateDebugTags(List<String> expirationDateDebugTags) {
        this.expirationDateDebugTags = expirationDateDebugTags;
    }

    public int getFruitsVegetablesNuts100GEstimate() {
        return fruitsVegetablesNuts100GEstimate;
    }

    public void setFruitsVegetablesNuts100GEstimate(int fruitsVegetablesNuts100GEstimate) {
        this.fruitsVegetablesNuts100GEstimate = fruitsVegetablesNuts100GEstimate;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getImageFrontSmallUrl() {
        return imageFrontSmallUrl;
    }

    public void setImageFrontSmallUrl(String imageFrontSmallUrl) {
        this.imageFrontSmallUrl = imageFrontSmallUrl;
    }

    public String getImageFrontThumbUrl() {
        return imageFrontThumbUrl;
    }

    public void setImageFrontThumbUrl(String imageFrontThumbUrl) {
        this.imageFrontThumbUrl = imageFrontThumbUrl;
    }

    public String getImageFrontUrl() {
        return imageFrontUrl;
    }

    public void setImageFrontUrl(String imageFrontUrl) {
        this.imageFrontUrl = imageFrontUrl;
    }

    public String getImageIngredientsUrl() {
        return imageIngredientsUrl;
    }

    public void setImageIngredientsUrl(String imageIngredientsUrl) {
        this.imageIngredientsUrl = imageIngredientsUrl;
    }

    public String getImageIngredientsSmallUrl() {
        return imageIngredientsSmallUrl;
    }

    public void setImageIngredientsSmallUrl(String imageIngredientsSmallUrl) {
        this.imageIngredientsSmallUrl = imageIngredientsSmallUrl;
    }

    public String getImageIngredientsThumbUrl() {
        return imageIngredientsThumbUrl;
    }

    public void setImageIngredientsThumbUrl(String imageIngredientsThumbUrl) {
        this.imageIngredientsThumbUrl = imageIngredientsThumbUrl;
    }

    public String getImageNutritionSmallUrl() {
        return imageNutritionSmallUrl;
    }

    public void setImageNutritionSmallUrl(String imageNutritionSmallUrl) {
        this.imageNutritionSmallUrl = imageNutritionSmallUrl;
    }

    public String getImageNutritionThumbUrl() {
        return imageNutritionThumbUrl;
    }

    public void setImageNutritionThumbUrl(String imageNutritionThumbUrl) {
        this.imageNutritionThumbUrl = imageNutritionThumbUrl;
    }

    public String getImageNutritionUrl() {
        return imageNutritionUrl;
    }

    public void setImageNutritionUrl(String imageNutritionUrl) {
        this.imageNutritionUrl = imageNutritionUrl;
    }

    public String getImageSmallUrl() {
        return imageSmallUrl;
    }

    public void setImageSmallUrl(String imageSmallUrl) {
        this.imageSmallUrl = imageSmallUrl;
    }

    public String getImageThumbUrl() {
        return imageThumbUrl;
    }

    public void setImageThumbUrl(String imageThumbUrl) {
        this.imageThumbUrl = imageThumbUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getInformersTags() {
        return informersTags;
    }

    public void setInformersTags(List<String> informersTags) {
        this.informersTags = informersTags;
    }

    public List<String> getIngredientsAnalysisTags() {
        return ingredientsAnalysisTags;
    }

    public void setIngredientsAnalysisTags(List<String> ingredientsAnalysisTags) {
        this.ingredientsAnalysisTags = ingredientsAnalysisTags;
    }

    public List<String> getIngredientsDebug() {
        return ingredientsDebug;
    }

    public void setIngredientsDebug(List<String> ingredientsDebug) {
        this.ingredientsDebug = ingredientsDebug;
    }

    public int getIngredientsFromOrThatMayBeFromPalmOilN() {
        return ingredientsFromOrThatMayBeFromPalmOilN;
    }

    public void setIngredientsFromOrThatMayBeFromPalmOilN(int ingredientsFromOrThatMayBeFromPalmOilN) {
        this.ingredientsFromOrThatMayBeFromPalmOilN = ingredientsFromOrThatMayBeFromPalmOilN;
    }

    public List<String> getIngredientsFromPalmOilTags() {
        return ingredientsFromPalmOilTags;
    }

    public void setIngredientsFromPalmOilTags(List<String> ingredientsFromPalmOilTags) {
        this.ingredientsFromPalmOilTags = ingredientsFromPalmOilTags;
    }

    public int getIngredientsFromPalmOilN() {
        return ingredientsFromPalmOilN;
    }

    public void setIngredientsFromPalmOilN(int ingredientsFromPalmOilN) {
        this.ingredientsFromPalmOilN = ingredientsFromPalmOilN;
    }

    public List<String> getIngredientsHierarchy() {
        return ingredientsHierarchy;
    }

    public void setIngredientsHierarchy(List<String> ingredientsHierarchy) {
        this.ingredientsHierarchy = ingredientsHierarchy;
    }

    public List<String> getIngredientsIdsDebug() {
        return ingredientsIdsDebug;
    }

    public void setIngredientsIdsDebug(List<String> ingredientsIdsDebug) {
        this.ingredientsIdsDebug = ingredientsIdsDebug;
    }

    public int getIngredientsN() {
        return ingredientsN;
    }

    public void setIngredientsN(int ingredientsN) {
        this.ingredientsN = ingredientsN;
    }

    public List<String> getIngredientsNTags() {
        return ingredientsNTags;
    }

    public void setIngredientsNTags(List<String> ingredientsNTags) {
        this.ingredientsNTags = ingredientsNTags;
    }

    public List<String> getIngredientsOriginalTags() {
        return ingredientsOriginalTags;
    }

    public void setIngredientsOriginalTags(List<String> ingredientsOriginalTags) {
        this.ingredientsOriginalTags = ingredientsOriginalTags;
    }

    public List<String> getIngredientsTags() {
        return ingredientsTags;
    }

    public void setIngredientsTags(List<String> ingredientsTags) {
        this.ingredientsTags = ingredientsTags;
    }

    public String getIngredientsText() {
        return ingredientsText;
    }

    public void setIngredientsText(String ingredientsText) {
        this.ingredientsText = ingredientsText;
    }

    public String getIngredientsTextDebug() {
        return ingredientsTextDebug;
    }

    public void setIngredientsTextDebug(String ingredientsTextDebug) {
        this.ingredientsTextDebug = ingredientsTextDebug;
    }

    public String getIngredientsTextWithAllergens() {
        return ingredientsTextWithAllergens;
    }

    public void setIngredientsTextWithAllergens(String ingredientsTextWithAllergens) {
        this.ingredientsTextWithAllergens = ingredientsTextWithAllergens;
    }

    public int getIngredientsThatMayBeFromPalmOilN() {
        return ingredientsThatMayBeFromPalmOilN;
    }

    public void setIngredientsThatMayBeFromPalmOilN(int ingredientsThatMayBeFromPalmOilN) {
        this.ingredientsThatMayBeFromPalmOilN = ingredientsThatMayBeFromPalmOilN;
    }

    public List<String> getIngredientsThatMayBeFromPalmOilTags() {
        return ingredientsThatMayBeFromPalmOilTags;
    }

    public void setIngredientsThatMayBeFromPalmOilTags(List<String> ingredientsThatMayBeFromPalmOilTags) {
        this.ingredientsThatMayBeFromPalmOilTags = ingredientsThatMayBeFromPalmOilTags;
    }

    public String getInterfaceVersionCreated() {
        return interfaceVersionCreated;
    }

    public void setInterfaceVersionCreated(String interfaceVersionCreated) {
        this.interfaceVersionCreated = interfaceVersionCreated;
    }

    public String getInterfaceVersionModified() {
        return interfaceVersionModified;
    }

    public void setInterfaceVersionModified(String interfaceVersionModified) {
        this.interfaceVersionModified = interfaceVersionModified;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public int getKnownIngredientsN() {
        return knownIngredientsN;
    }

    public void setKnownIngredientsN(int knownIngredientsN) {
        this.knownIngredientsN = knownIngredientsN;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public List<String> getLabelsHierarchy() {
        return labelsHierarchy;
    }

    public void setLabelsHierarchy(List<String> labelsHierarchy) {
        this.labelsHierarchy = labelsHierarchy;
    }

    public String getLabelsLc() {
        return labelsLc;
    }

    public void setLabelsLc(String labelsLc) {
        this.labelsLc = labelsLc;
    }

    public List<String> getLabelsPrevHierarchy() {
        return labelsPrevHierarchy;
    }

    public void setLabelsPrevHierarchy(List<String> labelsPrevHierarchy) {
        this.labelsPrevHierarchy = labelsPrevHierarchy;
    }

    public List<String> getLabelsPrevTags() {
        return labelsPrevTags;
    }

    public void setLabelsPrevTags(List<String> labelsPrevTags) {
        this.labelsPrevTags = labelsPrevTags;
    }

    public List<String> getLabelsTags() {
        return labelsTags;
    }

    public void setLabelsTags(List<String> labelsTags) {
        this.labelsTags = labelsTags;
    }

    public List<String> getLabelsDebugTags() {
        return labelsDebugTags;
    }

    public void setLabelsDebugTags(List<String> labelsDebugTags) {
        this.labelsDebugTags = labelsDebugTags;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<String> getLangDebugTags() {
        return langDebugTags;
    }

    public void setLangDebugTags(List<String> langDebugTags) {
        this.langDebugTags = langDebugTags;
    }

    public List<String> getLanguagesHierarchy() {
        return languagesHierarchy;
    }

    public void setLanguagesHierarchy(List<String> languagesHierarchy) {
        this.languagesHierarchy = languagesHierarchy;
    }

    public List<String> getLanguagesTags() {
        return languagesTags;
    }

    public void setLanguagesTags(List<String> languagesTags) {
        this.languagesTags = languagesTags;
    }

    public List<String> getLastEditDatesTags() {
        return lastEditDatesTags;
    }

    public void setLastEditDatesTags(List<String> lastEditDatesTags) {
        this.lastEditDatesTags = lastEditDatesTags;
    }

    public String getLastEditor() {
        return lastEditor;
    }

    public void setLastEditor(String lastEditor) {
        this.lastEditor = lastEditor;
    }

    public List<String> getLastImageDatesTags() {
        return lastImageDatesTags;
    }

    public void setLastImageDatesTags(List<String> lastImageDatesTags) {
        this.lastImageDatesTags = lastImageDatesTags;
    }

    public long getLastImageT() {
        return lastImageT;
    }

    public void setLastImageT(long lastImageT) {
        this.lastImageT = lastImageT;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public long getLastModifiedT() {
        return lastModifiedT;
    }

    public void setLastModifiedT(long lastModifiedT) {
        this.lastModifiedT = lastModifiedT;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<String> getLinkDebugTags() {
        return linkDebugTags;
    }

    public void setLinkDebugTags(List<String> linkDebugTags) {
        this.linkDebugTags = linkDebugTags;
    }

    public String getManufacturingPlaces() {
        return manufacturingPlaces;
    }

    public void setManufacturingPlaces(String manufacturingPlaces) {
        this.manufacturingPlaces = manufacturingPlaces;
    }

    public List<String> getManufacturingPlacesDebugTags() {
        return manufacturingPlacesDebugTags;
    }

    public void setManufacturingPlacesDebugTags(List<String> manufacturingPlacesDebugTags) {
        this.manufacturingPlacesDebugTags = manufacturingPlacesDebugTags;
    }

    public List<String> getManufacturingPlacesTags() {
        return manufacturingPlacesTags;
    }

    public void setManufacturingPlacesTags(List<String> manufacturingPlacesTags) {
        this.manufacturingPlacesTags = manufacturingPlacesTags;
    }

    public String getMaxImgid() {
        return maxImgid;
    }

    public void setMaxImgid(String maxImgid) {
        this.maxImgid = maxImgid;
    }

    public List<String> getMineralsPrevTags() {
        return mineralsPrevTags;
    }

    public void setMineralsPrevTags(List<String> mineralsPrevTags) {
        this.mineralsPrevTags = mineralsPrevTags;
    }

    public List<String> getMineralsTags() {
        return mineralsTags;
    }

    public void setMineralsTags(List<String> mineralsTags) {
        this.mineralsTags = mineralsTags;
    }

    public List<String> getMiscTags() {
        return miscTags;
    }

    public void setMiscTags(List<String> miscTags) {
        this.miscTags = miscTags;
    }

    public String getNetWeightUnit() {
        return netWeightUnit;
    }

    public void setNetWeightUnit(String netWeightUnit) {
        this.netWeightUnit = netWeightUnit;
    }

    public String getNetWeightValue() {
        return netWeightValue;
    }

    public void setNetWeightValue(String netWeightValue) {
        this.netWeightValue = netWeightValue;
    }

    public String getNutritionDataPer() {
        return nutritionDataPer;
    }

    public void setNutritionDataPer(String nutritionDataPer) {
        this.nutritionDataPer = nutritionDataPer;
    }

    public int getNutritionScoreWarningNoFruitsVegetablesNuts() {
        return nutritionScoreWarningNoFruitsVegetablesNuts;
    }

    public void setNutritionScoreWarningNoFruitsVegetablesNuts(int nutritionScoreWarningNoFruitsVegetablesNuts) {
        this.nutritionScoreWarningNoFruitsVegetablesNuts = nutritionScoreWarningNoFruitsVegetablesNuts;
    }

    public String getNoNutritionData() {
        return noNutritionData;
    }

    public void setNoNutritionData(String noNutritionData) {
        this.noNutritionData = noNutritionData;
    }

    public String getNovaGroup() {
        return novaGroup;
    }

    public void setNovaGroup(String novaGroup) {
        this.novaGroup = novaGroup;
    }

    public String getNovaGroups() {
        return novaGroups;
    }

    public void setNovaGroups(String novaGroups) {
        this.novaGroups = novaGroups;
    }

    public String getNovaGroupDebug() {
        return novaGroupDebug;
    }

    public void setNovaGroupDebug(String novaGroupDebug) {
        this.novaGroupDebug = novaGroupDebug;
    }

    public List<String> getNovaGroupTags() {
        return novaGroupTags;
    }

    public void setNovaGroupTags(List<String> novaGroupTags) {
        this.novaGroupTags = novaGroupTags;
    }

    public List<String> getNovaGroupsTags() {
        return novaGroupsTags;
    }

    public void setNovaGroupsTags(List<String> novaGroupsTags) {
        this.novaGroupsTags = novaGroupsTags;
    }

    public List<String> getNucleotidesPrevTags() {
        return nucleotidesPrevTags;
    }

    public void setNucleotidesPrevTags(List<String> nucleotidesPrevTags) {
        this.nucleotidesPrevTags = nucleotidesPrevTags;
    }

    public List<String> getNucleotidesTags() {
        return nucleotidesTags;
    }

    public void setNucleotidesTags(List<String> nucleotidesTags) {
        this.nucleotidesTags = nucleotidesTags;
    }

    public List<String> getNutrientLevelsTags() {
        return nutrientLevelsTags;
    }

    public void setNutrientLevelsTags(List<String> nutrientLevelsTags) {
        this.nutrientLevelsTags = nutrientLevelsTags;
    }

    public String getNutritionData() {
        return nutritionData;
    }

    public void setNutritionData(String nutritionData) {
        this.nutritionData = nutritionData;
    }

    public List<String> getNutritionDataPerDebugTags() {
        return nutritionDataPerDebugTags;
    }

    public void setNutritionDataPerDebugTags(List<String> nutritionDataPerDebugTags) {
        this.nutritionDataPerDebugTags = nutritionDataPerDebugTags;
    }

    public String getNutritionDataPrepared() {
        return nutritionDataPrepared;
    }

    public void setNutritionDataPrepared(String nutritionDataPrepared) {
        this.nutritionDataPrepared = nutritionDataPrepared;
    }

    public String getNutritionDataPreparedPer() {
        return nutritionDataPreparedPer;
    }

    public void setNutritionDataPreparedPer(String nutritionDataPreparedPer) {
        this.nutritionDataPreparedPer = nutritionDataPreparedPer;
    }

    public String getNutritionGrades() {
        return nutritionGrades;
    }

    public void setNutritionGrades(String nutritionGrades) {
        this.nutritionGrades = nutritionGrades;
    }

    public int getNutritionScoreBeverage() {
        return nutritionScoreBeverage;
    }

    public void setNutritionScoreBeverage(int nutritionScoreBeverage) {
        this.nutritionScoreBeverage = nutritionScoreBeverage;
    }

    public String getNutritionScoreDebug() {
        return nutritionScoreDebug;
    }

    public void setNutritionScoreDebug(String nutritionScoreDebug) {
        this.nutritionScoreDebug = nutritionScoreDebug;
    }

    public int getNutritionScoreWarningNoFiber() {
        return nutritionScoreWarningNoFiber;
    }

    public void setNutritionScoreWarningNoFiber(int nutritionScoreWarningNoFiber) {
        this.nutritionScoreWarningNoFiber = nutritionScoreWarningNoFiber;
    }

    public List<String> getNutritionGradesTags() {
        return nutritionGradesTags;
    }

    public void setNutritionGradesTags(List<String> nutritionGradesTags) {
        this.nutritionGradesTags = nutritionGradesTags;
    }

    public String getOrigins() {
        return origins;
    }

    public void setOrigins(String origins) {
        this.origins = origins;
    }

    public List<String> getOriginsDebugTags() {
        return originsDebugTags;
    }

    public void setOriginsDebugTags(List<String> originsDebugTags) {
        this.originsDebugTags = originsDebugTags;
    }

    public List<String> getOriginsTags() {
        return originsTags;
    }

    public void setOriginsTags(List<String> originsTags) {
        this.originsTags = originsTags;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public List<String> getOtherNutritionalSubstancesTags() {
        return otherNutritionalSubstancesTags;
    }

    public void setOtherNutritionalSubstancesTags(List<String> otherNutritionalSubstancesTags) {
        this.otherNutritionalSubstancesTags = otherNutritionalSubstancesTags;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public List<String> getPackagingDebugTags() {
        return packagingDebugTags;
    }

    public void setPackagingDebugTags(List<String> packagingDebugTags) {
        this.packagingDebugTags = packagingDebugTags;
    }

    public List<String> getPackagingTags() {
        return packagingTags;
    }

    public void setPackagingTags(List<String> packagingTags) {
        this.packagingTags = packagingTags;
    }

    public List<String> getPhotographersTags() {
        return photographersTags;
    }

    public void setPhotographersTags(List<String> photographersTags) {
        this.photographersTags = photographersTags;
    }

    public String getPnnsGroups1() {
        return pnnsGroups1;
    }

    public void setPnnsGroups1(String pnnsGroups1) {
        this.pnnsGroups1 = pnnsGroups1;
    }

    public String getPnnsGroups2() {
        return pnnsGroups2;
    }

    public void setPnnsGroups2(String pnnsGroups2) {
        this.pnnsGroups2 = pnnsGroups2;
    }

    public List<String> getPnnsGroups1Tags() {
        return pnnsGroups1Tags;
    }

    public void setPnnsGroups1Tags(List<String> pnnsGroups1Tags) {
        this.pnnsGroups1Tags = pnnsGroups1Tags;
    }

    public List<String> getPnnsGroups2Tags() {
        return pnnsGroups2Tags;
    }

    public void setPnnsGroups2Tags(List<String> pnnsGroups2Tags) {
        this.pnnsGroups2Tags = pnnsGroups2Tags;
    }

    public long getPopularityKey() {
        return popularityKey;
    }

    public void setPopularityKey(long popularityKey) {
        this.popularityKey = popularityKey;
    }

    public String getProducerVersionId() {
        return producerVersionId;
    }

    public void setProducerVersionId(String producerVersionId) {
        this.producerVersionId = producerVersionId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getPurchasePlaces() {
        return purchasePlaces;
    }

    public void setPurchasePlaces(String purchasePlaces) {
        this.purchasePlaces = purchasePlaces;
    }

    public List<String> getPurchasePlacesDebugTags() {
        return purchasePlacesDebugTags;
    }

    public void setPurchasePlacesDebugTags(List<String> purchasePlacesDebugTags) {
        this.purchasePlacesDebugTags = purchasePlacesDebugTags;
    }

    public List<String> getPurchasePlacesTags() {
        return purchasePlacesTags;
    }

    public void setPurchasePlacesTags(List<String> purchasePlacesTags) {
        this.purchasePlacesTags = purchasePlacesTags;
    }

    public List<String> getQualityTags() {
        return qualityTags;
    }

    public void setQualityTags(List<String> qualityTags) {
        this.qualityTags = qualityTags;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public List<String> getQuantityDebugTags() {
        return quantityDebugTags;
    }

    public void setQuantityDebugTags(List<String> quantityDebugTags) {
        this.quantityDebugTags = quantityDebugTags;
    }

    public String getRecyclingInstructionsToDiscard() {
        return recyclingInstructionsToDiscard;
    }

    public void setRecyclingInstructionsToDiscard(String recyclingInstructionsToDiscard) {
        this.recyclingInstructionsToDiscard = recyclingInstructionsToDiscard;
    }

    public int getRev() {
        return rev;
    }

    public void setRev(int rev) {
        this.rev = rev;
    }

    public String getServingQuantity() {
        return servingQuantity;
    }

    public void setServingQuantity(String servingQuantity) {
        this.servingQuantity = servingQuantity;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public List<String> getServingSizeDebugTags() {
        return servingSizeDebugTags;
    }

    public void setServingSizeDebugTags(List<String> servingSizeDebugTags) {
        this.servingSizeDebugTags = servingSizeDebugTags;
    }

    public long getSortkey() {
        return sortkey;
    }

    public void setSortkey(long sortkey) {
        this.sortkey = sortkey;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public List<String> getStatesHierarchy() {
        return statesHierarchy;
    }

    public void setStatesHierarchy(List<String> statesHierarchy) {
        this.statesHierarchy = statesHierarchy;
    }

    public List<String> getStatesTags() {
        return statesTags;
    }

    public void setStatesTags(List<String> statesTags) {
        this.statesTags = statesTags;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }

    public List<String> getStoresDebugTags() {
        return storesDebugTags;
    }

    public void setStoresDebugTags(List<String> storesDebugTags) {
        this.storesDebugTags = storesDebugTags;
    }

    public List<String> getStoresTags() {
        return storesTags;
    }

    public void setStoresTags(List<String> storesTags) {
        this.storesTags = storesTags;
    }

    public String getTraces() {
        return traces;
    }

    public void setTraces(String traces) {
        this.traces = traces;
    }

    public String getTracesFromIngredients() {
        return tracesFromIngredients;
    }

    public void setTracesFromIngredients(String tracesFromIngredients) {
        this.tracesFromIngredients = tracesFromIngredients;
    }

    public List<String> getTracesHierarchy() {
        return tracesHierarchy;
    }

    public void setTracesHierarchy(List<String> tracesHierarchy) {
        this.tracesHierarchy = tracesHierarchy;
    }

    public List<String> getTracesDebugTags() {
        return tracesDebugTags;
    }

    public void setTracesDebugTags(List<String> tracesDebugTags) {
        this.tracesDebugTags = tracesDebugTags;
    }

    public String getTracesFromUser() {
        return tracesFromUser;
    }

    public void setTracesFromUser(String tracesFromUser) {
        this.tracesFromUser = tracesFromUser;
    }

    public String getTracesLc() {
        return tracesLc;
    }

    public void setTracesLc(String tracesLc) {
        this.tracesLc = tracesLc;
    }

    public List<String> getTracesTags() {
        return tracesTags;
    }

    public void setTracesTags(List<String> tracesTags) {
        this.tracesTags = tracesTags;
    }

    public int getUnknownIngredientsN() {
        return unknownIngredientsN;
    }

    public void setUnknownIngredientsN(int unknownIngredientsN) {
        this.unknownIngredientsN = unknownIngredientsN;
    }

    public List<String> getUnknownNutrientsTags() {
        return unknownNutrientsTags;
    }

    public void setUnknownNutrientsTags(List<String> unknownNutrientsTags) {
        this.unknownNutrientsTags = unknownNutrientsTags;
    }

    public String getUpdateKey() {
        return updateKey;
    }

    public void setUpdateKey(String updateKey) {
        this.updateKey = updateKey;
    }

    public List<String> getVitaminsPrevTags() {
        return vitaminsPrevTags;
    }

    public void setVitaminsPrevTags(List<String> vitaminsPrevTags) {
        this.vitaminsPrevTags = vitaminsPrevTags;
    }

    public List<String> getVitaminsTags() {
        return vitaminsTags;
    }

    public void setVitaminsTags(List<String> vitaminsTags) {
        this.vitaminsTags = vitaminsTags;
    }

    public Map<String, Object> getOther() {
        return other;
    }

    public void setOther(Map<String, Object> other) {
        this.other = other;
    }
}
