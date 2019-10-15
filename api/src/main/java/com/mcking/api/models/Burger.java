package com.mcking.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Burger {

    public Burger() {}

    public Burger(int price, List<Ingredient> ingredients) {
        this.price = price;
        this.ingredients = ingredients;
    }

    public int getPrice() {
        return price;
    }

    private int price;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    private List<Ingredient> ingredients;

    public Burger(Integer price, List<Ingredient> ingredients) {
        this.price = price;
        this.ingredients = ingredients;
    }

    public static class CreationRequest {

        @Min(0)
        private final Integer price;

        @NotEmpty private final List<Ingredient> ingredients;

        @JsonCreator
        public CreationRequest(
                @JsonProperty("price") Integer price,
                @JsonProperty("ingredients") List<Ingredient> ingredients) {
            this.price = price;
            this.ingredients = ingredients;
        }
    }

    public static class UpdateRequest {

        @NotNull private final Integer id;

        @Min(0)
        private final Integer price;

        @NotEmpty private final List<Ingredient> ingredients;

        @JsonCreator
        public UpdateRequest(
                @NotNull Integer id,
                @JsonProperty("price") Integer price,
                @JsonProperty("ingredients") List<Ingredient> ingredients) {
            this.id = id;
            this.price = price;
            this.ingredients = ingredients;
        }
    }
}
