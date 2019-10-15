package com.mcking.fakedb.repositories.bread;

import com.mcking.domain.models.bread.Bread;
import com.mcking.domain.repositories.bread.BreadRepository;
import com.mcking.fakedb.common.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class BreadRepositoryImpl implements BreadRepository {

    private final EntityManager entityManager;

    public BreadRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Bread GetBread() {
        return new Bread(entityManager.generate());
    }
}
