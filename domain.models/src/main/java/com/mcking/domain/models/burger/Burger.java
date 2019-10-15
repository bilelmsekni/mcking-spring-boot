package com.mcking.domain.models.burger;

import com.mcking.domain.models.ingredient.Ingredient;
import java.util.List;

public class Burger {

    public int getPrice() {
        return price;
    }

    private final int price;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    private final List<Ingredient> ingredients;

    public Burger(int price, List<Ingredient> ingredients) {
        this.price = price;
        this.ingredients = ingredients;
    }
}
