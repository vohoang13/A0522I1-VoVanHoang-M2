package Exam2.service;

import Exam2.model.BenhNhanThuong;
import Exam2.repository.IThuongRepository;
import Exam2.repository.ThuongRepository;
import Exam2.validate.Validate;

import java.util.List;
import java.util.Scanner;

public class ThuongService implements IThuongService{
    private Validate validate = new Validate();
    private Scanner scanner = new Scanner(System.in);
    private IThuongRepository iThuongRepository = new ThuongRepository();
    @Override
    public void addThuong() {
        BenhNhanThuong benhNhanThuong = this.infor();
        iThuongRepository.addThuong(benhNhanThuong);
    }

    @Override
    public void findAll() {
        List<BenhNhanThuong> benhNhanThuongList = iThuongRepository.findAll();
        for(BenhNhanThuong benhNhanThuong: benhNhanThuongList){
            System.out.println(benhNhanThuong);
        }
    }

    @Override
    public void xoa(String ma) {
        iThuongRepository.xoa(ma);
        findAll();
    }

    public BenhNhanThuong infor(){
        boolean check = true;
        System.out.println("--THÔNG TIN BỆNH NHÂN THƯỜNG--");
        int soThuTu = 0;
        String ma;
        do {
            System.out.println("Nhập vào mã bệnh án: ");
            ma = scanner.nextLine();
            check = validate.testBenhAn(ma);
        }while (!check);
        System.out.println("Nhập vào tên bệnh nhân:");
        String ten = scanner.nextLine();
        System.out.println("Nhập vào ngày nhập viện: ");
        String ngayVao = scanner.nextLine();
        System.out.println("Nhập vào ngày ra viện: ");
        String ngayRa = scanner.nextLine();
        System.out.println("Nhập vào lý do nhập viện: ");
        String lyDo = scanner.nextLine();
        System.out.println("Viện phí: ");
        int vienPhi = Integer.parseInt(scanner.nextLine());
        BenhNhanThuong benhNhanThuong = new BenhNhanThuong(soThuTu, ma, ten,ngayVao,ngayRa,lyDo,vienPhi);
        return benhNhanThuong;
    }
}
