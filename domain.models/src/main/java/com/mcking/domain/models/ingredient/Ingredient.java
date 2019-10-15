package com.mcking.domain.models.ingredient;

public class Ingredient {

    public String getName() {
        return name;
    }

    private final String name;

    public Ingredient(String name) {
        this.name = name;
    }
}
