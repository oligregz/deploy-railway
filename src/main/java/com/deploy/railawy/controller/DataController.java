package com.deploy.railawy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deploy.railawy.domain.Data;
import com.deploy.railawy.service.DataService;

@RestController
public class DataController {

  private final DataService dataService;

  public DataController(DataService dataService) {
    this.dataService = dataService;
  }

  @GetMapping
  public Data retornaDataAtual() {
    return dataService.retornaDataAtual();
  }
}