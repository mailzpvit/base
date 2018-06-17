package com.lzp.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfWebMvcConfigure implements WebMvcConfigurer {
    @Autowired
    ConfInterCepter confInterCepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(confInterCepter).excludePathPatterns("/addLogin", "/**", "/login", "/css/**", "/tpl/**", "/js/**","/webjars/**","*.con", "/img/**", "/key**","/swagger-resources/**","/v2/**","tpmo/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/tpl/**").addResourceLocations("classpath:/templates/tpl/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
        registry.addResourceHandler("webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
    }
}
