package com.mcking.fakedb.common;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

@Service
public class EntityManager {

    private final Faker faker = new Faker();

    public String generate() {
        return faker.food().vegetable();
    }
}
