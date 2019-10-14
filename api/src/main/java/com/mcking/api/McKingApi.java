package com.mcking.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.mcking.domain.impl.DomainImplConfiguration;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DomainImplConfiguration.class)
public class McKingApi {
    public static void main(String[] args) {
        SpringApplication.run(McKingApi.class, args);
    }

    @Bean
    Jackson2ObjectMapperBuilderCustomizer customizer() {
        return jacksonObjectMapperBuilder ->
                jacksonObjectMapperBuilder
                        .failOnEmptyBeans(false)
                        .propertyNamingStrategy(PropertyNamingStrategy.KEBAB_CASE);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
