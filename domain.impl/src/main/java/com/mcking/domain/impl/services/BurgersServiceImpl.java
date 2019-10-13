package com.mcking.domain.impl.services;

import com.mcking.domain.models.CheeseBurger;
import com.mcking.domain.models.Ingredient;
import com.mcking.domain.services.BurgersService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BurgersServiceImpl implements BurgersService {

    @Override
    public List<CheeseBurger> getCheeseBurgers() {
        List<Ingredient> ingredients =
            List.of(
                new Ingredient("cheese"),
                new Ingredient("tomato"),
                new Ingredient("bread"),
                new Ingredient("steak"));
        return List.of(new CheeseBurger(10, ingredients));
    }
}
