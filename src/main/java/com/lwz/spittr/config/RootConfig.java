package com.lwz.spittr.config;

import com.lwz.spittr.domain.SongRepository;
import com.lwz.spittr.domain.Spittle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.lwz.spittr"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class))
public class RootConfig {
    @Bean
    public SongRepository songRepository() {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < 20; i++) {
            spittles.add(new Spittle("SongSpittle_" + i,new Date()));
        }
        return new SongRepository(spittles);
    }

}
