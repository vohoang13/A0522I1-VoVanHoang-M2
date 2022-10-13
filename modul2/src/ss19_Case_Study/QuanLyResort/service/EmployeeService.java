package ss19_Case_Study.QuanLyResort.service;

import ss19_Case_Study.QuanLyResort.model.Employee;
import ss19_Case_Study.QuanLyResort.repository.EmployeeRepository;
import ss19_Case_Study.QuanLyResort.repository.IEmployeeRepository;
import ss19_Case_Study.QuanLyResort.until.Validate;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    private Validate validate = new Validate();
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void addEmployees() {
        Employee employee = this.getInfor();
        iEmployeeRepository.addEmployees(employee);
    }

    @Override
    public void display() {
        List<Employee> employeeList = iEmployeeRepository.display();
        for (Employee employee: employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void edit(String maNV) {
        List<Employee> employeeList = iEmployeeRepository.display();
        int index = employeeList.indexOf(new Employee(maNV));
        if(index != -1){
            System.out.println("--ĐIỀN VÀO THÔNG TIN NHÂN VIÊN CẦN CẬP NHẬT--");
            System.out.print("Mã nhân viên: ");
            String maMoiNV = scanner.nextLine();
            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh = scanner.nextLine();
            System.out.print("Giới tính: ");
            String gioiTinh = scanner.nextLine();
            System.out.print("Số CMND: ");
            String soCMND = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            System.out.println("Email : ");
            String email = scanner.nextLine();
            System.out.print("Trình độ ( Trung Cấp / Cao Đẳng / Đại Học / sau Đại Học ) : ");
            String trinhDo = scanner.nextLine();
            System.out.println("Vị trí ( Lễ tân / Phục vụ / Chuyên viên / Giám sát / Quản Lý / Giám đốc) : ");
            String viTri = scanner.nextLine();
            System.out.println("Lương: ");
            int luong = Integer.parseInt(scanner.nextLine());
            Employee employee = new Employee(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maMoiNV,trinhDo,viTri,luong);
            iEmployeeRepository.edit(index,employee);
        }else {
            return;
        }
    }

    public Employee getInfor(){
        boolean check = true;
        System.out.println("--ĐIỀN VÀO THÔNG TIN NHÂN VIÊN--");
        System.out.print("Mã nhân viên: ");
        String maNV = scanner.nextLine();
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        String ngaySinh;
        do {
            System.out.print("Ngày sinh: ");
            ngaySinh = scanner.nextLine();
            check = validate.testNgaySinh(ngaySinh);
        }while (!check);
        System.out.print("Giới tính: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Số CMND: ");
        String soCMND = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        String soDienThoai = scanner.nextLine();
        System.out.println("Email : ");
        String email = scanner.nextLine();
        System.out.print("Trình độ ( Trung Cấp / Cao Đẳng / Đại Học / sau Đại Học ) : ");
        String trinhDo = scanner.nextLine();
        System.out.println("Vị trí ( Lễ tân / Phục vụ / Chuyên viên / Giám sát / Quản Lý / Giám đốc) : ");
        String viTri = scanner.nextLine();
        System.out.println("Lương: ");
        int luong = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maNV,trinhDo,viTri,luong);
        return employee;
    }
}
