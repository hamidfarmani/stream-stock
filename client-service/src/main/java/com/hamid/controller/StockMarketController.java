package com.hamid.controller;

import com.google.protobuf.Descriptors.FieldDescriptor;
import com.hamid.service.StockMarketClientService;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StockMarketController {

  private final StockMarketClientService stockMarketClientService;

  @GetMapping("/stock/{stockSymbol}")
  public Map<FieldDescriptor, Object> getStock(@PathVariable String stockSymbol){
    return stockMarketClientService.getStock(stockSymbol);
  }

}
