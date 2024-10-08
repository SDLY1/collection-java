package west2;
import java.util.List;

public interface AnimalShop {
    void buyAnimal(Animal animal) throws InsufficientBalanceException;
    void serveCustomer(Customer customer) throws AnimalNotFoundException;
    void closeShop();
    List<Customer> getCustomers();
    double getBalance();
}
