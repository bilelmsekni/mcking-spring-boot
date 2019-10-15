package com.mcking.fakedb.repositories.tomato;

import com.mcking.domain.models.tomato.Tomato;
import com.mcking.domain.repositories.tomato.TomatoRepository;
import com.mcking.fakedb.common.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class TomatoRepositoryImpl implements TomatoRepository {
    private final EntityManager entityManager;

    public TomatoRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Tomato getTomato() {
        return new Tomato(entityManager.generate());
    }
}
