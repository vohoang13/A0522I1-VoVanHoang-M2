package ss19_Case_Study.QuanLyResort.repository;

import ss19_Case_Study.QuanLyResort.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    List<Customer> customerList = new ArrayList<>();
    @Override
    public List<Customer> display() {
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void edit(int index, Customer customer) {
        customerList.set(index,customer);
    }
}
