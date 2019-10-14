package com.mcking.api.common;

import com.mcking.api.models.BurgerDto;
import com.mcking.api.models.BurgerDto.CreationRequest;
import com.mcking.api.models.BurgerDto.UpdateRequest;
import com.mcking.domain.models.Burger;
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

    public List<BurgerDto> mapMany(List<Burger> burgers, Class<BurgerDto> burgerDtoClass) {
        return burgers.stream()
                .map(source -> modelMapper.map(source, burgerDtoClass))
                .collect(Collectors.toList());
    }

    public BurgerDto map(Burger burger, Class<BurgerDto> burgerDtoClass) {
        return modelMapper.map(burger, burgerDtoClass);
    }

    public Burger map(CreationRequest request, Class<Burger> burgerClass) {
        return modelMapper.map(request, burgerClass);
    }

    public Burger map(UpdateRequest request, Class<Burger> burgerClass) {
        return modelMapper.map(request, burgerClass);
    }
}
