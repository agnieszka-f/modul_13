package orderservice;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] arg) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.request();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new ProductOrderRepository(),new ProductOrderInformation());
        orderProcessor.process(orderRequest);
    }

}
