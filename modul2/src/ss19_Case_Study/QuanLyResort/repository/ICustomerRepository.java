package ss19_Case_Study.QuanLyResort.repository;

import ss19_Case_Study.QuanLyResort.model.Customer;
import ss19_Case_Study.QuanLyResort.model.Employee;

import java.util.List;

public interface ICustomerRepository {
    public List<Customer> display();

    public void addCustomer(Customer customer);

    public void edit(int index, Customer customer);
}
