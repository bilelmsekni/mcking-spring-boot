package com.mcking.fakedb.repositories.steak;

import com.mcking.domain.models.steak.Steak;
import com.mcking.domain.repositories.steak.SteakRepository;
import com.mcking.fakedb.common.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class SteakRepositoryImpl implements SteakRepository {
    private final EntityManager entityManager;

    public SteakRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Steak getSteak() {
        return new Steak(entityManager.generate());
    }
}
