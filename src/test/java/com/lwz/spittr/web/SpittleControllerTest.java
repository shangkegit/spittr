package com.lwz.spittr.web;

import com.lwz.spittr.domain.Spittle;
import com.lwz.spittr.domain.SpittleRepository;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpittleControllerTest {
    @Test
    public void shouldShowRecentSpittles() throws Exception {
        List<Spittle> expectedSpittles = createSpittles(20);
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findeSpittles(Long.MAX_VALUE,20)).thenReturn(expectedSpittles);
        SpittleController spittleController = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(spittleController).setSingleView(new InternalResourceView("/src/main/webapp/WEB-INF/views/spittles.jsp")).build();
        mockMvc.perform(get("/spittles")).andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList",hasItems(expectedSpittles.toArray())));
    }

    private List<Spittle> createSpittles(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle" + i,new Date()));
        }
        return spittles;
    }

    @Test
    public void testSpittle() throws Exception {
        Spittle expectedSpittle = new Spittle("Hello", new Date());
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findOne((long) 12345)).thenReturn(expectedSpittle);

        SpittleController controller = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/spittles/12345"))
                .andExpect((view().name("spittle")))
                .andExpect(model().attributeExists("spittle"))
                .andExpect(model().attribute("spittle",expectedSpittle));

    }
}
