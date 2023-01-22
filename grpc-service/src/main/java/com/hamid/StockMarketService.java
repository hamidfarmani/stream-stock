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
    super.getRealTimeStockPrices(request, responseObserver);
  }
}
