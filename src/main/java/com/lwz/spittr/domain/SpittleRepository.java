package com.lwz.spittr.domain;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findeSpittles(Long max, int count);
    Spittle findOne(Long Id);
}
