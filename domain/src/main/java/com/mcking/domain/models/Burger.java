package com.mcking.domain.models;

import java.util.List;

public class Burger {

    private final int price;
    private final List<Ingredient> ingredients;

    public Burger(int price, List<Ingredient> ingredients) {
        this.price = price;
        this.ingredients = ingredients;
    }
}
