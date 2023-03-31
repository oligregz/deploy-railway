package com.deploy.railawy.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Data {

  private final LocalDateTime data;

  public Data(LocalDateTime data) {
    this.data = data;
  }

  @JsonFormat(pattern = "EEEE, MMM dd, yyyy HH:mm:ss a")
  public LocalDateTime getData() {
    return data;
  }
}