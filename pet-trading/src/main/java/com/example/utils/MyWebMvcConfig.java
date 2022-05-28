package com.example.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//配置静态资源映射，解决新上传的文件无法访问的问题
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/avatar/**").addResourceLocations("file:E:/git/pettrading/pet-trading/src/main/resources/resources/avatar/");
        registry.addResourceHandler("/resources/petimg/**").addResourceLocations("classpath:/resources/resources/petimg/");
        //registry.addResourceHandler("/resources/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

    }
}
