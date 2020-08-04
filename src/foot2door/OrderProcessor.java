package foot2door;

public class OrderProcessor {
    private DatabaseService databaseService;

    public OrderProcessor(final DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    public OrderProducentDto process(final Request request){
        boolean isAccepted = request.getProducentOrderFulfillment().process(request.getOrder().getProductOrderList());

        if(isAccepted){
            databaseService.createAnEntry(request.getProducent(),request.getOrder());
            return new OrderProducentDto(request.getProducent(),request.getOrder(),true);
        } else return new OrderProducentDto(request.getProducent(),request.getOrder(),false);
    }

}
