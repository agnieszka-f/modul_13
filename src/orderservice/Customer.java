package orderservice;

public class Customer {
    String firsName;
    String secondName;
    String address;

    public Customer(String firsName, String secondName, String address) {
        this.firsName = firsName;
        this.secondName = secondName;
        this.address = address;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }
}
