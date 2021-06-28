package com.senso.management.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigBens {

    @Bean
    public ModelMapper map(){
        return new ModelMapper();
    }

}
