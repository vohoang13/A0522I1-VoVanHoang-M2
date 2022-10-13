package Exam.service;

import Exam.model.DienThoaiChinhHang;
import Exam.model.DienThoaiXachTay;
import Exam.repository.IXachTayRepository;
import Exam.repository.XachTayRepository;
import Exam.until.Validate.Validate;

import java.util.List;
import java.util.Scanner;

public class XachTayService implements IXachTayService{
    private Validate validate = new Validate();
    private DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay();
    private IXachTayRepository iXachTayRepository = new XachTayRepository();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void themXachTay() {
        DienThoaiXachTay dienThoaiXachTay = this.getThongTin();
        iXachTayRepository.themXachTay(dienThoaiXachTay);
    }
    public void danhSach(){
        List<DienThoaiXachTay> dienThoaiXachTayList = iXachTayRepository.findAll();
        for(DienThoaiXachTay dienThoai : dienThoaiXachTayList){
            System.out.println(dienThoai);
        }
    }

    @Override
    public void xoa(int id) {
        iXachTayRepository.xoa(id);
        danhSach();
    }

    @Override
    public void timKiemID(int id) {
        iXachTayRepository.timKiemID(id);
    }

    @Override
    public void timKiemTen(String name) {
        iXachTayRepository.timKiemTen(name);
    }

    public DienThoaiXachTay getThongTin(){
        boolean check = true;
        System.out.println("Nhập vào thông tin điện thoại xách tay: ");
//        System.out.println("Nhập vào id: ");
        int id = 0;
        System.out.println("Tên điện thoại: ");
        String tenDienThoai = scanner.nextLine();
        int giaBan;
        do {
            System.out.println("Nhập vào giá bán: ");
            giaBan = Integer.parseInt(scanner.nextLine());
            check = validate.testChiPhi(String.valueOf(giaBan));
        }while (!check);
        int soLuong;
        do{
            System.out.println("Nhập vào số lượng: ");
            soLuong = Integer.parseInt(scanner.nextLine());
            check = validate.testChiPhi(String.valueOf(soLuong));
        }while (!check);
        System.out.println("Nhập vào nhà sản xuất: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Quốc gia: ");
        String quocGia = scanner.nextLine();
        System.out.println("Trạng thái: ");
        String trangThai = scanner.nextLine();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id,tenDienThoai,giaBan,soLuong,nhaSanXuat,quocGia,trangThai);
        return dienThoaiXachTay;
    }
}
