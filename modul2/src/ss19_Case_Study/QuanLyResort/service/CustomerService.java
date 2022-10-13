package ss19_Case_Study.QuanLyResort.service;

import ss19_Case_Study.QuanLyResort.model.Customer;
import ss19_Case_Study.QuanLyResort.model.Employee;
import ss19_Case_Study.QuanLyResort.repository.CustomerRepository;
import ss19_Case_Study.QuanLyResort.repository.ICustomerRepository;
import ss19_Case_Study.QuanLyResort.until.Validate;
import ss19_Case_Study.QuanLyResort.until.ValidateNgaySinh;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService{
    private Validate validate = new Validate();
    private Scanner scanner = new Scanner(System.in);
    private ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public void display() {
        List<Customer> customerList = iCustomerRepository.display();
        for (Customer customer: customerList){
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        Customer customer = this.getInfor();
        iCustomerRepository.addCustomer(customer);
    }

    @Override
    public void edit(String maKH) {
        List<Customer> customerList = iCustomerRepository.display();
        int index = customerList.indexOf(new Customer(maKH));
        if(index != -1){
            boolean check = true;
            System.out.println("--ĐIỀN VÀO THÔNG TIN NHÂN VIÊN CẦN CẬP NHẬT--");
            System.out.print("Mã khách hàng: ");
            String maMoiKH = scanner.nextLine();
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
            System.out.print("Loại khách (Diamond, Platinium, Gold, Silver, Member): ");
            String loaiKhach = scanner.nextLine();
            System.out.println("Địa chỉ : ");
            String diaChi = scanner.nextLine();
            Customer customer = new Customer(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maMoiKH,loaiKhach,diaChi);
            iCustomerRepository.edit(index,customer);
        }else {
            return;
        }
    }


    public Customer getInfor(){
        boolean check = true;
        System.out.println("--ĐIỀN VÀO THÔNG TIN KHÁCH HÀNG--");
        System.out.print("Mã khách hàng: ");
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
        System.out.print("Loại khách (Diamond, Platinium, Gold, Silver, Member): ");
        String loaiKhach = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        String diaChi = scanner.nextLine();
        Customer customer = new Customer(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maNV,loaiKhach,diaChi);
        return customer;
    }
}
