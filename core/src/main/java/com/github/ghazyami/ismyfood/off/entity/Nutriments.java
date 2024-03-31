package com.github.ghazyami.ismyfood.off.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;

public class Nutriments implements Serializable  {

    private float calcium;

    @JsonbProperty("calcium_value")
    private float calciumValue;

    @JsonbProperty("calcium_100g")
    private float calcium100G;

    @JsonbProperty("calcium_serving")
    private float calciumServing;

    @JsonbProperty("calcium_unit")
    private String calciumUnit;

    private float carbohydrates;

    @JsonbProperty("carbohydrates_value")
    private float carbohydratesValue;

    @JsonbProperty("carbohydrates_100g")
    private float carbohydrates100G;

    @JsonbProperty("carbohydrates_serving")
    private float carbohydratesServing;

    @JsonbProperty("carbohydrates_unit")
    private String carbohydratesUnit;

    @JsonbProperty("carbon-footprint-from-known-ingredients_product")
    private float carbonFootprintFromKnownIngredientsProduct;

    @JsonbProperty("carbon-footprint-from-known-ingredients_100g")
    private float carbonFootprintFromKnownIngredients100G;

    @JsonbProperty("carbon-footprint-from-known-ingredients_serving")
    private float carbonFootprintFromKnownIngredientsServing;

    private float cholesterol;

    @JsonbProperty("cholesterol_value")
    private float cholesterolValue;

    @JsonbProperty("cholesterol_100g")
    private float cholesterol100G;

    @JsonbProperty("cholesterol_serving")
    private float cholesterolServing;

    @JsonbProperty("cholesterol_unit")
    private String cholesterolUnit;

    private int energy;

    @JsonbProperty("energy-kcal")
    private int energyKcal;

    @JsonbProperty("energy-kj")
    private int energyKj;

    @JsonbProperty("energy_value")
    private int energyValue;

    @JsonbProperty("energy-kcal_value")
    private int energyKcalValue;

    @JsonbProperty("energy-kj_value")
    private int energyKjValue;

    @JsonbProperty("energy_100g")
    private int energy100G;

    @JsonbProperty("energy-kcal_100g")
    private int energyKcal100G;

    @JsonbProperty("energy-kj_100g")
    private int energyKj100G;

    @JsonbProperty("energy_serving")
    private int energyServing;

    @JsonbProperty("energy-kcal_serving")
    private int energyKcalServing;

    @JsonbProperty("energy-kj_serving")
    private int energyKjServing;

    @JsonbProperty("energy_unit")
    private String energyUnit;

    @JsonbProperty("energy-kcal_unit")
    private String energyKcalUnit;

    @JsonbProperty("energy-kj_unit")
    private String energyKjUnit;

    private float fat;

    @JsonbProperty("fat_value")
    private float fatValue;

    @JsonbProperty("fat_100g")
    private float fat100G;

    @JsonbProperty("fat_serving")
    private float fatServing;

    @JsonbProperty("fat_unit")
    private String fatUnit;

    private float fiber;

    @JsonbProperty("fiber_value")
    private float fiberValue;

    @JsonbProperty("fiber_100g")
    private float fiber100G;

    @JsonbProperty("fiber_serving")
    private float fiberServing;

    @JsonbProperty("fiber_unit")
    private String fiberUnit;

    @JsonbProperty("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    private float fruitsVegetablesNutsEstimateFromIngredients100G;

    private float iron;

    @JsonbProperty("iron_value")
    private float ironValue;

    @JsonbProperty("iron_100g")
    private float iron100G;

    @JsonbProperty("iron_serving")
    private float ironServing;

    @JsonbProperty("iron_unit")
    private String ironUnit;

    @JsonbProperty("nova-group")
    private float novaGroup;

    @JsonbProperty("nova-group_100g")
    private float novaGroup100G;

    @JsonbProperty("nova-group_serving")
    private float novaGroupServing;

    private float proteins;

    @JsonbProperty("proteins_value")
    private float proteinsValue;

    @JsonbProperty("proteins_100g")
    private float proteins100G;

    @JsonbProperty("proteins_serving")
    private float proteinsServing;

    @JsonbProperty("proteins_unit")
    private String proteinsUnit;

    private float salt;

    @JsonbProperty("salt_value")
    private float saltValue;

    @JsonbProperty("salt_100g")
    private float salt100G;

    @JsonbProperty("salt_serving")
    private float saltServing;

    @JsonbProperty("salt_unit")
    private String saltUnit;

    @JsonbProperty("saturated-fat")
    private float saturatedFat;

    @JsonbProperty("saturated-fat_value")
    private float saturatedFatValue;

    @JsonbProperty("saturated-fat_100g")
    private float saturatedFat100G;

    @JsonbProperty("saturated-fat_serving")
    private float saturatedFatServing;

    @JsonbProperty("saturated-fat_unit")
    private String saturatedFatUnit;

    private float sodium;

    @JsonbProperty("sodium_value")
    private float sodiumValue;

    @JsonbProperty("sodium_100g")
    private float sodium100G;

    @JsonbProperty("sodium_serving")
    private float sodiumServing;

    @JsonbProperty("sodium_unit")
    private String sodiumUnit;

    private float sugars;

    @JsonbProperty("sugars_value")
    private float sugarsValue;

    @JsonbProperty("sugars_100g")
    private float sugars100G;

    @JsonbProperty("sugars_serving")
    private float sugarsServing;

    @JsonbProperty("sugars_unit")
    private String sugarsUnit;

    @JsonbProperty("trans-fat")
    private float transFat;

    @JsonbProperty("trans-fat_value")
    private float transFatValue;

    @JsonbProperty("trans-fat_100g")
    private float transFat100G;

    @JsonbProperty("trans-fat_serving")
    private float transFatServing;

    @JsonbProperty("trans-fat_unit")
    private String transFatUnit;

    @JsonbProperty("vitamin-a")
    private float vitaminA;

    @JsonbProperty("vitamin-a_value")
    private float vitaminAValue;

    @JsonbProperty("vitamin-a_100g")
    private float vitaminA100G;

    @JsonbProperty("vitamin-a_serving")
    private float vitaminAServing;

    @JsonbProperty("vitamin-a_unit")
    private String vitaminAUnit;

    @JsonbProperty("vitamin-c")
    private float vitaminC;

    @JsonbProperty("vitamin-c_value")
    private float vitaminCValue;

    @JsonbProperty("vitamin-c_100g")
    private float vitaminC100G;

    @JsonbProperty("vitamin-c_serving")
    private float vitaminCServing;

    @JsonbProperty("vitamin-c_unit")
    private String vitaminCUnit;

    @JsonbProperty("vitamin-d")
    private float vitaminD;

    @JsonbProperty("vitamin-d_value")
    private float vitaminDValue;

    @JsonbProperty("vitamin-d_100g")
    private float vitaminD100G;

    @JsonbProperty("vitamin-d_serving")
    private float vitaminDServing;

    @JsonbProperty("vitamin-d_unit")
    private String vitaminDUnit;

    Map<String, Object> other = new LinkedHashMap<>();

//    @JsonAnySetter
//    void setDetail(String key, Object value) {
//        other.put(key, value);
//    }


    public float getCalcium() {
        return calcium;
    }

    public void setCalcium(float calcium) {
        this.calcium = calcium;
    }

    public float getCalciumValue() {
        return calciumValue;
    }

    public void setCalciumValue(float calciumValue) {
        this.calciumValue = calciumValue;
    }

    public float getCalcium100G() {
        return calcium100G;
    }

    public void setCalcium100G(float calcium100G) {
        this.calcium100G = calcium100G;
    }

    public float getCalciumServing() {
        return calciumServing;
    }

    public void setCalciumServing(float calciumServing) {
        this.calciumServing = calciumServing;
    }

    public String getCalciumUnit() {
        return calciumUnit;
    }

    public void setCalciumUnit(String calciumUnit) {
        this.calciumUnit = calciumUnit;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public float getCarbohydratesValue() {
        return carbohydratesValue;
    }

    public void setCarbohydratesValue(float carbohydratesValue) {
        this.carbohydratesValue = carbohydratesValue;
    }

    public float getCarbohydrates100G() {
        return carbohydrates100G;
    }

    public void setCarbohydrates100G(float carbohydrates100G) {
        this.carbohydrates100G = carbohydrates100G;
    }

    public float getCarbohydratesServing() {
        return carbohydratesServing;
    }

    public void setCarbohydratesServing(float carbohydratesServing) {
        this.carbohydratesServing = carbohydratesServing;
    }

    public String getCarbohydratesUnit() {
        return carbohydratesUnit;
    }

    public void setCarbohydratesUnit(String carbohydratesUnit) {
        this.carbohydratesUnit = carbohydratesUnit;
    }

    public float getCarbonFootprintFromKnownIngredientsProduct() {
        return carbonFootprintFromKnownIngredientsProduct;
    }

    public void setCarbonFootprintFromKnownIngredientsProduct(float carbonFootprintFromKnownIngredientsProduct) {
        this.carbonFootprintFromKnownIngredientsProduct = carbonFootprintFromKnownIngredientsProduct;
    }

    public float getCarbonFootprintFromKnownIngredients100G() {
        return carbonFootprintFromKnownIngredients100G;
    }

    public void setCarbonFootprintFromKnownIngredients100G(float carbonFootprintFromKnownIngredients100G) {
        this.carbonFootprintFromKnownIngredients100G = carbonFootprintFromKnownIngredients100G;
    }

    public float getCarbonFootprintFromKnownIngredientsServing() {
        return carbonFootprintFromKnownIngredientsServing;
    }

    public void setCarbonFootprintFromKnownIngredientsServing(float carbonFootprintFromKnownIngredientsServing) {
        this.carbonFootprintFromKnownIngredientsServing = carbonFootprintFromKnownIngredientsServing;
    }

    public float getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(float cholesterol) {
        this.cholesterol = cholesterol;
    }

    public float getCholesterolValue() {
        return cholesterolValue;
    }

    public void setCholesterolValue(float cholesterolValue) {
        this.cholesterolValue = cholesterolValue;
    }

    public float getCholesterol100G() {
        return cholesterol100G;
    }

    public void setCholesterol100G(float cholesterol100G) {
        this.cholesterol100G = cholesterol100G;
    }

    public float getCholesterolServing() {
        return cholesterolServing;
    }

    public void setCholesterolServing(float cholesterolServing) {
        this.cholesterolServing = cholesterolServing;
    }

    public String getCholesterolUnit() {
        return cholesterolUnit;
    }

    public void setCholesterolUnit(String cholesterolUnit) {
        this.cholesterolUnit = cholesterolUnit;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergyKcal() {
        return energyKcal;
    }

    public void setEnergyKcal(int energyKcal) {
        this.energyKcal = energyKcal;
    }

    public int getEnergyKj() {
        return energyKj;
    }

    public void setEnergyKj(int energyKj) {
        this.energyKj = energyKj;
    }

    public int getEnergyValue() {
        return energyValue;
    }

    public void setEnergyValue(int energyValue) {
        this.energyValue = energyValue;
    }

    public int getEnergyKcalValue() {
        return energyKcalValue;
    }

    public void setEnergyKcalValue(int energyKcalValue) {
        this.energyKcalValue = energyKcalValue;
    }

    public int getEnergyKjValue() {
        return energyKjValue;
    }

    public void setEnergyKjValue(int energyKjValue) {
        this.energyKjValue = energyKjValue;
    }

    public int getEnergy100G() {
        return energy100G;
    }

    public void setEnergy100G(int energy100G) {
        this.energy100G = energy100G;
    }

    public int getEnergyKcal100G() {
        return energyKcal100G;
    }

    public void setEnergyKcal100G(int energyKcal100G) {
        this.energyKcal100G = energyKcal100G;
    }

    public int getEnergyKj100G() {
        return energyKj100G;
    }

    public void setEnergyKj100G(int energyKj100G) {
        this.energyKj100G = energyKj100G;
    }

    public int getEnergyServing() {
        return energyServing;
    }

    public void setEnergyServing(int energyServing) {
        this.energyServing = energyServing;
    }

    public int getEnergyKcalServing() {
        return energyKcalServing;
    }

    public void setEnergyKcalServing(int energyKcalServing) {
        this.energyKcalServing = energyKcalServing;
    }

    public int getEnergyKjServing() {
        return energyKjServing;
    }

    public void setEnergyKjServing(int energyKjServing) {
        this.energyKjServing = energyKjServing;
    }

    public String getEnergyUnit() {
        return energyUnit;
    }

    public void setEnergyUnit(String energyUnit) {
        this.energyUnit = energyUnit;
    }

    public String getEnergyKcalUnit() {
        return energyKcalUnit;
    }

    public void setEnergyKcalUnit(String energyKcalUnit) {
        this.energyKcalUnit = energyKcalUnit;
    }

    public String getEnergyKjUnit() {
        return energyKjUnit;
    }

    public void setEnergyKjUnit(String energyKjUnit) {
        this.energyKjUnit = energyKjUnit;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getFatValue() {
        return fatValue;
    }

    public void setFatValue(float fatValue) {
        this.fatValue = fatValue;
    }

    public float getFat100G() {
        return fat100G;
    }

    public void setFat100G(float fat100G) {
        this.fat100G = fat100G;
    }

    public float getFatServing() {
        return fatServing;
    }

    public void setFatServing(float fatServing) {
        this.fatServing = fatServing;
    }

    public String getFatUnit() {
        return fatUnit;
    }

    public void setFatUnit(String fatUnit) {
        this.fatUnit = fatUnit;
    }

    public float getFiber() {
        return fiber;
    }

    public void setFiber(float fiber) {
        this.fiber = fiber;
    }

    public float getFiberValue() {
        return fiberValue;
    }

    public void setFiberValue(float fiberValue) {
        this.fiberValue = fiberValue;
    }

    public float getFiber100G() {
        return fiber100G;
    }

    public void setFiber100G(float fiber100G) {
        this.fiber100G = fiber100G;
    }

    public float getFiberServing() {
        return fiberServing;
    }

    public void setFiberServing(float fiberServing) {
        this.fiberServing = fiberServing;
    }

    public String getFiberUnit() {
        return fiberUnit;
    }

    public void setFiberUnit(String fiberUnit) {
        this.fiberUnit = fiberUnit;
    }

    public float getFruitsVegetablesNutsEstimateFromIngredients100G() {
        return fruitsVegetablesNutsEstimateFromIngredients100G;
    }

    public void setFruitsVegetablesNutsEstimateFromIngredients100G(float fruitsVegetablesNutsEstimateFromIngredients100G) {
        this.fruitsVegetablesNutsEstimateFromIngredients100G = fruitsVegetablesNutsEstimateFromIngredients100G;
    }

    public float getIron() {
        return iron;
    }

    public void setIron(float iron) {
        this.iron = iron;
    }

    public float getIronValue() {
        return ironValue;
    }

    public void setIronValue(float ironValue) {
        this.ironValue = ironValue;
    }

    public float getIron100G() {
        return iron100G;
    }

    public void setIron100G(float iron100G) {
        this.iron100G = iron100G;
    }

    public float getIronServing() {
        return ironServing;
    }

    public void setIronServing(float ironServing) {
        this.ironServing = ironServing;
    }

    public String getIronUnit() {
        return ironUnit;
    }

    public void setIronUnit(String ironUnit) {
        this.ironUnit = ironUnit;
    }

    public float getNovaGroup() {
        return novaGroup;
    }

    public void setNovaGroup(float novaGroup) {
        this.novaGroup = novaGroup;
    }

    public float getNovaGroup100G() {
        return novaGroup100G;
    }

    public void setNovaGroup100G(float novaGroup100G) {
        this.novaGroup100G = novaGroup100G;
    }

    public float getNovaGroupServing() {
        return novaGroupServing;
    }

    public void setNovaGroupServing(float novaGroupServing) {
        this.novaGroupServing = novaGroupServing;
    }

    public float getProteins() {
        return proteins;
    }

    public void setProteins(float proteins) {
        this.proteins = proteins;
    }

    public float getProteinsValue() {
        return proteinsValue;
    }

    public void setProteinsValue(float proteinsValue) {
        this.proteinsValue = proteinsValue;
    }

    public float getProteins100G() {
        return proteins100G;
    }

    public void setProteins100G(float proteins100G) {
        this.proteins100G = proteins100G;
    }

    public float getProteinsServing() {
        return proteinsServing;
    }

    public void setProteinsServing(float proteinsServing) {
        this.proteinsServing = proteinsServing;
    }

    public String getProteinsUnit() {
        return proteinsUnit;
    }

    public void setProteinsUnit(String proteinsUnit) {
        this.proteinsUnit = proteinsUnit;
    }

    public float getSalt() {
        return salt;
    }

    public void setSalt(float salt) {
        this.salt = salt;
    }

    public float getSaltValue() {
        return saltValue;
    }

    public void setSaltValue(float saltValue) {
        this.saltValue = saltValue;
    }

    public float getSalt100G() {
        return salt100G;
    }

    public void setSalt100G(float salt100G) {
        this.salt100G = salt100G;
    }

    public float getSaltServing() {
        return saltServing;
    }

    public void setSaltServing(float saltServing) {
        this.saltServing = saltServing;
    }

    public String getSaltUnit() {
        return saltUnit;
    }

    public void setSaltUnit(String saltUnit) {
        this.saltUnit = saltUnit;
    }

    public float getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(float saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public float getSaturatedFatValue() {
        return saturatedFatValue;
    }

    public void setSaturatedFatValue(float saturatedFatValue) {
        this.saturatedFatValue = saturatedFatValue;
    }

    public float getSaturatedFat100G() {
        return saturatedFat100G;
    }

    public void setSaturatedFat100G(float saturatedFat100G) {
        this.saturatedFat100G = saturatedFat100G;
    }

    public float getSaturatedFatServing() {
        return saturatedFatServing;
    }

    public void setSaturatedFatServing(float saturatedFatServing) {
        this.saturatedFatServing = saturatedFatServing;
    }

    public String getSaturatedFatUnit() {
        return saturatedFatUnit;
    }

    public void setSaturatedFatUnit(String saturatedFatUnit) {
        this.saturatedFatUnit = saturatedFatUnit;
    }

    public float getSodium() {
        return sodium;
    }

    public void setSodium(float sodium) {
        this.sodium = sodium;
    }

    public float getSodiumValue() {
        return sodiumValue;
    }

    public void setSodiumValue(float sodiumValue) {
        this.sodiumValue = sodiumValue;
    }

    public float getSodium100G() {
        return sodium100G;
    }

    public void setSodium100G(float sodium100G) {
        this.sodium100G = sodium100G;
    }

    public float getSodiumServing() {
        return sodiumServing;
    }

    public void setSodiumServing(float sodiumServing) {
        this.sodiumServing = sodiumServing;
    }

    public String getSodiumUnit() {
        return sodiumUnit;
    }

    public void setSodiumUnit(String sodiumUnit) {
        this.sodiumUnit = sodiumUnit;
    }

    public float getSugars() {
        return sugars;
    }

    public void setSugars(float sugars) {
        this.sugars = sugars;
    }

    public float getSugarsValue() {
        return sugarsValue;
    }

    public void setSugarsValue(float sugarsValue) {
        this.sugarsValue = sugarsValue;
    }

    public float getSugars100G() {
        return sugars100G;
    }

    public void setSugars100G(float sugars100G) {
        this.sugars100G = sugars100G;
    }

    public float getSugarsServing() {
        return sugarsServing;
    }

    public void setSugarsServing(float sugarsServing) {
        this.sugarsServing = sugarsServing;
    }

    public String getSugarsUnit() {
        return sugarsUnit;
    }

    public void setSugarsUnit(String sugarsUnit) {
        this.sugarsUnit = sugarsUnit;
    }

    public float getTransFat() {
        return transFat;
    }

    public void setTransFat(float transFat) {
        this.transFat = transFat;
    }

    public float getTransFatValue() {
        return transFatValue;
    }

    public void setTransFatValue(float transFatValue) {
        this.transFatValue = transFatValue;
    }

    public float getTransFat100G() {
        return transFat100G;
    }

    public void setTransFat100G(float transFat100G) {
        this.transFat100G = transFat100G;
    }

    public float getTransFatServing() {
        return transFatServing;
    }

    public void setTransFatServing(float transFatServing) {
        this.transFatServing = transFatServing;
    }

    public String getTransFatUnit() {
        return transFatUnit;
    }

    public void setTransFatUnit(String transFatUnit) {
        this.transFatUnit = transFatUnit;
    }

    public float getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(float vitaminA) {
        this.vitaminA = vitaminA;
    }

    public float getVitaminAValue() {
        return vitaminAValue;
    }

    public void setVitaminAValue(float vitaminAValue) {
        this.vitaminAValue = vitaminAValue;
    }

    public float getVitaminA100G() {
        return vitaminA100G;
    }

    public void setVitaminA100G(float vitaminA100G) {
        this.vitaminA100G = vitaminA100G;
    }

    public float getVitaminAServing() {
        return vitaminAServing;
    }

    public void setVitaminAServing(float vitaminAServing) {
        this.vitaminAServing = vitaminAServing;
    }

    public String getVitaminAUnit() {
        return vitaminAUnit;
    }

    public void setVitaminAUnit(String vitaminAUnit) {
        this.vitaminAUnit = vitaminAUnit;
    }

    public float getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(float vitaminC) {
        this.vitaminC = vitaminC;
    }

    public float getVitaminCValue() {
        return vitaminCValue;
    }

    public void setVitaminCValue(float vitaminCValue) {
        this.vitaminCValue = vitaminCValue;
    }

    public float getVitaminC100G() {
        return vitaminC100G;
    }

    public void setVitaminC100G(float vitaminC100G) {
        this.vitaminC100G = vitaminC100G;
    }

    public float getVitaminCServing() {
        return vitaminCServing;
    }

    public void setVitaminCServing(float vitaminCServing) {
        this.vitaminCServing = vitaminCServing;
    }

    public String getVitaminCUnit() {
        return vitaminCUnit;
    }

    public void setVitaminCUnit(String vitaminCUnit) {
        this.vitaminCUnit = vitaminCUnit;
    }

    public float getVitaminD() {
        return vitaminD;
    }

    public void setVitaminD(float vitaminD) {
        this.vitaminD = vitaminD;
    }

    public float getVitaminDValue() {
        return vitaminDValue;
    }

    public void setVitaminDValue(float vitaminDValue) {
        this.vitaminDValue = vitaminDValue;
    }

    public float getVitaminD100G() {
        return vitaminD100G;
    }

    public void setVitaminD100G(float vitaminD100G) {
        this.vitaminD100G = vitaminD100G;
    }

    public float getVitaminDServing() {
        return vitaminDServing;
    }

    public void setVitaminDServing(float vitaminDServing) {
        this.vitaminDServing = vitaminDServing;
    }

    public String getVitaminDUnit() {
        return vitaminDUnit;
    }

    public void setVitaminDUnit(String vitaminDUnit) {
        this.vitaminDUnit = vitaminDUnit;
    }

    public Map<String, Object> getOther() {
        return other;
    }

    public void setOther(Map<String, Object> other) {
        this.other = other;
    }
}