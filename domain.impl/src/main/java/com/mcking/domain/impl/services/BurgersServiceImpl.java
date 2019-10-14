package com.mcking.domain.impl.services;

import com.mcking.dal.repositories.BreadRepository;
import com.mcking.dal.repositories.CheeseRepository;
import com.mcking.dal.repositories.SteakRepository;
import com.mcking.dal.repositories.TomatoRepository;
import com.mcking.domain.models.Burger;
import com.mcking.domain.models.Ingredient;
import com.mcking.domain.services.BurgersService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BurgersServiceImpl implements BurgersService {

    private final CheeseRepository cheeseRepository;
    private final TomatoRepository tomatoRepository;
    private final BreadRepository breadRepository;
    private final SteakRepository steakRepository;

    public BurgersServiceImpl(
            CheeseRepository cheeseRepository,
            TomatoRepository tomatoRepository,
            BreadRepository breadRepository,
            SteakRepository steakRepository) {
        this.cheeseRepository = cheeseRepository;
        this.tomatoRepository = tomatoRepository;
        this.breadRepository = breadRepository;
        this.steakRepository = steakRepository;
    }

    @Override
    public List<Burger> getBurgers() {
        List<Ingredient> ingredients =
                List.of(
                        new Ingredient("cheese"),
                        new Ingredient("tomato"),
                        new Ingredient("bread"),
                        new Ingredient("steak"));
        return List.of(new Burger(10, ingredients));
    }

    @Override
    public Burger getBurger(int id) {
        return null;
    }

    @Override
    public void deleteBurger(int id) {}

    @Override
    public Burger createBurger(Burger burger) {
        return null;
    }

    @Override
    public Burger updateBurger(int id, Burger burger) {
        return null;
    }
}
