package com.lwz.spittr.web;

import com.lwz.spittr.domain.SongRepository;
import com.lwz.spittr.domain.Spittle;
import com.lwz.spittr.domain.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }
    @RequestMapping(method = RequestMethod.GET)
    /*
    *下面三种控制器方法都可正确返回视图
    */
    /*public String spittles(Model model) {
        model.addAttribute(spittleRepository.findeSpittles(Long.MAX_VALUE,20));
        return "spittles";
    }
    public String spittles(Map model) {
        model.put("spittleList",spittleRepository.findeSpittles(Long.MAX_VALUE,20));
        return "spittles";
    }*/
    public List<Spittle> spittles() {
        return spittleRepository.findeSpittles(Long.MAX_VALUE,20);
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") long spittleId, Model model) {
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
