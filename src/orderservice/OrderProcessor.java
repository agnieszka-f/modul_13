package orderservice;

import java.time.LocalDateTime;

public class OrderProcessor {
    private OrderService orderService;
    private OrderRepository orderRepository;
    private InformationService informationService;

    public OrderProcessor(final OrderService orderService, final OrderRepository orderRepository, final InformationService informationService) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }
    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getDate());
        if(isOrdered) {
            orderRepository.createOrder(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getDate());
            informationService.inform(orderRequest.getCustomer());
            return new OrderDto(orderRequest.getCustomer(),true);
        } else return new OrderDto(orderRequest.getCustomer(),false);
    }
}
