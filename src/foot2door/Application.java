package foot2door;

public class Application {
    public static void main(String[] arg){

        ClassRetrieve classRetrieve = new ClassRetrieve();
        Request request = classRetrieve.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderDatabase());
        orderProcessor.process(request);

    }
}
