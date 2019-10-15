package com.mcking.services.burgers;

import com.mcking.domain.models.burger.Burger;
import java.util.List;

public interface BurgersService {

    List<Burger> getBurgers();

    Burger getBurger(int id);

    void deleteBurger(int id);

    Burger createBurger(Burger burger);

    Burger updateBurger(int id, Burger burger);
}
