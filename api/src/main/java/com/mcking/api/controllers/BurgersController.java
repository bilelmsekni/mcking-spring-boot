package com.mcking.api.controllers;

import com.mcking.domain.models.CheeseBurger;
import com.mcking.domain.services.BurgersService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/burgers")
public class BurgersController {

  private final BurgersService burgerService;

  public BurgersController(BurgersService burgerService) {
    this.burgerService = burgerService;
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  List<CheeseBurger> fetchCheeseBurgers() {
    return this.burgerService.getCheeseBurgers();
  }
}
