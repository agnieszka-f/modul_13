package orderservice;

public class ProductOrderInformation implements InformationService{
    public boolean inform(Customer customer){
        System.out.println("Potwierdzenie zamówienia dla: "+customer.getFirsName()+" "+customer.getSecondName());
        return true;
    }
}
