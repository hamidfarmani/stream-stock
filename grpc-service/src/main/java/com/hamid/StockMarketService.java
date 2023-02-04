package com.hamid;

import com.hamid.Schema.StockRequest;
import com.hamid.Schema.StockResponse;
import com.hamid.StockMarketServiceGrpc.StockMarketServiceImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class StockMarketService extends StockMarketServiceImplBase {

  @Override
  public void getRealTimeStockPrices(StockRequest request,
      StreamObserver<StockResponse> responseObserver) {
    TempDb.getStockResponsesFromTempDb()
        .stream()
            .filter(stockResponse -> stockResponse.getStockSymbol() == request.getStockSymbol())
                .findFirst()
                    .ifPresent(responseObserver::onNext);
    responseObserver.onCompleted();
  }

  @Override
  public void getStockPrice(StockRequest request, StreamObserver<StockResponse> responseObserver) {
    TempDb.getStockResponsesFromTempDb()
        .stream()
        .filter(stock -> stock.getStockSymbol().equals(request.getStockSymbol()))
        .findFirst()
        .ifPresent(responseObserver::onNext);
    responseObserver.onCompleted();

  }
}
