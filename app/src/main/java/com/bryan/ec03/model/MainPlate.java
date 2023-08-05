package com.bryan.ec03.model;

public class MainPlate  extends MenuModel{

    private String description;
    private String ingredients;
    public MainPlate(String name, String imgUrl, String description, String ingredients) {
        super(name, imgUrl);
        this.description = description;
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
