package Exam2.service;


import Exam2.model.BenhNhanVIP;
import Exam2.repository.IVIPRepository;
import Exam2.repository.VIPRepository;
import Exam2.validate.Validate;

import java.util.List;
import java.util.Scanner;

public class VIPService implements IVIPService{
    private Validate validate = new Validate();
    private Scanner scanner = new Scanner(System.in);
    private IVIPRepository ivipRepository = new VIPRepository();
    @Override
    public void addVIP() {
        BenhNhanVIP benhNhanVIP = this.inforVIP();
        ivipRepository.addVIP(benhNhanVIP);
    }

    @Override
    public void findAll() {
        List<BenhNhanVIP> benhNhanVIPList = ivipRepository.findAll();
        for(BenhNhanVIP benhNhanVIP: benhNhanVIPList){
            System.out.println(benhNhanVIP);
        }
    }

    @Override
    public void xoa(String ma) {
        ivipRepository.xoa(ma);
        findAll();
    }

    public BenhNhanVIP inforVIP(){
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
        System.out.println("Loại VIP: ");
        String loaiVIP = scanner.nextLine();
        System.out.println("Nhập vào thời hạn vip:");
        String thoiHan = scanner.nextLine();
        BenhNhanVIP benhNhanVIP  = new BenhNhanVIP(soThuTu, ma, ten,ngayVao,ngayRa,lyDo,loaiVIP,thoiHan);
        return benhNhanVIP;
    }
}
