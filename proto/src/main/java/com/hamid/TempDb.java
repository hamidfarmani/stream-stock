package com.hamid;

import com.hamid.Schema.StockResponse;
import java.util.ArrayList;
import java.util.List;


public class TempDb {

  public static List<StockResponse> getStockResponsesFromTempDb() {
    return new ArrayList<StockResponse>() {
      {
        add(StockResponse.newBuilder().setStockSymbol("GOGL").setPrice(1).build());
        add(StockResponse.newBuilder().setStockSymbol("APPL").setPrice(2).build());
        add(StockResponse.newBuilder().setStockSymbol("META").setPrice(3).build());
        add(StockResponse.newBuilder().setStockSymbol("SPOT").setPrice(4).build());
      }
    };
  }

}