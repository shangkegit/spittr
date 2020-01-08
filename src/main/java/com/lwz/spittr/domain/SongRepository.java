package com.lwz.spittr.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Component
public class SongRepository implements SpittleRepository {
    private List<Spittle> spittleList;

    public SongRepository(List<Spittle> spittleList) {
        this.spittleList = spittleList;
    }

    @Override
    public List<Spittle> findeSpittles(Long max, int count) {
        /*List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Song_" + i,new Date()));
        }*/
        return spittleList;
    }

    @Override
    public Spittle findOne(Long Id) {
        return new Spittle("Hello world! The First Spittle", new Date());
    }
}
