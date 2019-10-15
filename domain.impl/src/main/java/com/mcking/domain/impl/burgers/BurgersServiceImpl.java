package com.mcking.domain.impl.burgers;

import com.mcking.domain.models.burger.Burger;
import com.mcking.domain.models.ingredient.Ingredient;
import com.mcking.domain.repositories.bread.BreadRepository;
import com.mcking.domain.repositories.cheese.CheeseRepository;
import com.mcking.domain.repositories.steak.SteakRepository;
import com.mcking.domain.repositories.tomato.TomatoRepository;
import com.mcking.services.burgers.BurgersService;
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
                        cheeseRepository.getCheese(),
                        tomatoRepository.getTomato(),
                        breadRepository.GetBread(),
                        steakRepository.getSteak());
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
