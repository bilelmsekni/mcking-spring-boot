package com.mcking.api.controllers;

import com.mcking.api.common.DtoModelMapper;
import com.mcking.api.models.Burger;
import com.mcking.services.burgers.BurgersService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/burgers")
public class BurgersController {

    private final BurgersService burgerService;
    private final DtoModelMapper dtoModelMapper;

    public BurgersController(BurgersService burgerService, DtoModelMapper dtoModelMapper) {
        this.burgerService = burgerService;
        this.dtoModelMapper = dtoModelMapper;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Burger> fetchBurgers() {
        List<com.mcking.domain.models.burger.Burger> burgers = this.burgerService.getBurgers();
        return dtoModelMapper.mapMany(burgers, Burger.class);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Burger> fetchBurger(@PathVariable int id) {
        return Optional.ofNullable(dtoModelMapper.map(burgerService.getBurger(id), Burger.class))
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    com.mcking.domain.models.burger.Burger createBurger(
            @RequestBody @Valid Burger.CreationRequest request) {
        com.mcking.domain.models.burger.Burger burger =
                dtoModelMapper.map(request, com.mcking.domain.models.burger.Burger.class);
        return burgerService.createBurger(burger);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    com.mcking.domain.models.burger.Burger updateBurger(
            @PathVariable int id, @RequestBody @Valid Burger.UpdateRequest request) {
        com.mcking.domain.models.burger.Burger burger =
                dtoModelMapper.map(request, com.mcking.domain.models.burger.Burger.class);
        return burgerService.updateBurger(id, burger);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteBurger(@PathVariable int id) {
        burgerService.deleteBurger(id);
    }
}
