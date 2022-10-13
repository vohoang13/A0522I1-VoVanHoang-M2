package ss19_Case_Study.QuanLyResort.repository;

import ss19_Case_Study.QuanLyResort.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    public void addEmployees(Employee employee);

    public List<Employee> display();

    public void edit(int index, Employee employee);
}
