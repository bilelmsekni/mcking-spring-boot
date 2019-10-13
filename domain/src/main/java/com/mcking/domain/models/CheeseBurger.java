package com.mcking.domain.models;

import java.util.List;

public class CheeseBurger {

  private final Integer price;
  private final List<Ingredient> ingredients;

  public CheeseBurger(Integer price,
      List<Ingredient> ingredients) {
    this.price = price;
    this.ingredients = ingredients;
  }
}
