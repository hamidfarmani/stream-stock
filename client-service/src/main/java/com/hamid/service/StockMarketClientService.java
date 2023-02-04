package com.hamid.service;

import com.google.protobuf.Descriptors.FieldDescriptor;
import com.hamid.Schema.StockRequest;
import com.hamid.Schema.StockResponse;
import com.hamid.StockMarketServiceGrpc;
import java.util.Map;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class StockMarketClientService {

  @GrpcClient("grpc-hamid-service")
  StockMarketServiceGrpc.StockMarketServiceBlockingStub syncClient;

  public Map<FieldDescriptor, Object> getStock(String stockSymbol) {
    StockRequest stockRequest = StockRequest.newBuilder().setStockSymbol(stockSymbol).build();
    StockResponse stockResponse = syncClient.getStockPrice(stockRequest);
    return stockResponse.getAllFields();
  }
}
