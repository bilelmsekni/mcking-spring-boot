package com.mcking.api.common;

import com.mcking.api.models.Burger;
import com.mcking.api.models.Burger.CreationRequest;
import com.mcking.api.models.Burger.UpdateRequest;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class DtoModelMapper {

    public final ModelMapper modelMapper;

    public DtoModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public List<Burger> mapMany(
            List<com.mcking.domain.models.burger.Burger> burgers, Class<Burger> burgerDtoClass) {
        return burgers.stream()
                .map(source -> modelMapper.map(source, burgerDtoClass))
                .collect(Collectors.toList());
    }

    public Burger map(com.mcking.domain.models.burger.Burger burger, Class<Burger> burgerClass) {
        return modelMapper.map(burger, burgerClass);
    }

    public com.mcking.domain.models.burger.Burger map(
            CreationRequest request, Class<com.mcking.domain.models.burger.Burger> burgerClass) {
        return modelMapper.map(request, burgerClass);
    }

    public com.mcking.domain.models.burger.Burger map(
            UpdateRequest request, Class<com.mcking.domain.models.burger.Burger> burgerClass) {
        return modelMapper.map(request, burgerClass);
    }
}
