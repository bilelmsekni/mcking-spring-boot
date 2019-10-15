package com.mcking.fakedb.repositories.cheese;

import com.mcking.domain.models.cheese.Cheese;
import com.mcking.domain.repositories.cheese.CheeseRepository;
import com.mcking.fakedb.common.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class CheeseRepositoryImpl implements CheeseRepository {

    private final EntityManager entityManager;

    public CheeseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Cheese getCheese() {
        return new Cheese(entityManager.generate());
    }
}
