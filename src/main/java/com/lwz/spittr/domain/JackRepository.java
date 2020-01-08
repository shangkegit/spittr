package com.lwz.spittr.domain;

import org.springframework.stereotype.Repository;

@Repository
public class JackRepository implements SpitterRepository {
    @Override
    public Spitter save(Spitter spitter) {
        spitter.setId(24L);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        return new Spitter(24L,"Jack", "Bauer", "jbauer", "24hours");
    }
}
