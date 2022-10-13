package ss19_Case_Study.QuanLyResort.repository;

import ss19_Case_Study.QuanLyResort.model.Employee;
import ss19_Case_Study.QuanLyResort.until.file.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private List<Employee> employeeList = new ArrayList<>();

    private final String FILE_PATH = "D:\\CODEGYM\\Module2\\A0522I1-VoVanHoang-M2\\modul2\\src\\ss19_Case_Study\\QuanLyResort\\until\\file\\employee.csv";
    private ReadAndWrite file = new ReadAndWrite();

    @Override
    public void addEmployees(Employee employee) {
        employeeList.add(employee);
        file.writeFile(employeeList,FILE_PATH);
    }

    @Override
    public List<Employee> display() {
        List<String> stringList = file.ReadFile(FILE_PATH);
        for(String string : stringList){
            String temp[] = string.split(",");
            String hoTen = temp[0];
            String ngaySinh = temp[1];
            String gioiTinh = temp[2];
            String soCMND = temp[3];
            String soDienThoai = temp[4];
            String email = temp[5];
            String maNV = temp[6];
            String trinhDo = temp[7];
            String viTri = temp[8];
            int luong = Integer.parseInt(temp[9]);
            Employee employee = new Employee(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maNV,trinhDo,viTri,luong);
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void edit(int index, Employee employee) {
        employeeList.set(index,employee);
    }


}
