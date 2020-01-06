package com.lwz.spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
/*
*
* 测试SpringMVC,使用MockMvc
* 一、需要import static以上几个包
* 二、需要依赖
* 1、javax.servlet-api 3.0.1以上（若无，报无servletSession错误）
* 2、javax.java22-api（若无，报无servletException错误）
* 见pom配置
*
*/
public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
