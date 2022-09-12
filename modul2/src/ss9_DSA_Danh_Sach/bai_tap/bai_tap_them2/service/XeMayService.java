package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.service;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Moto;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.XeTai;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository.IXeMayRepository;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository.XeMayRepository;

import java.util.List;
import java.util.Scanner;

public class XeMayService implements IXeMayService{
    IXeMayRepository xeMayRepository = new XeMayRepository();

    Scanner scanner = new Scanner(System.in);
    @Override
    public void addXeMay() {
        Moto moto = this.inforXeMay();
        xeMayRepository.addXeMay(moto);
    }

    @Override
    public void display() {
        List<Moto> motoList = xeMayRepository.findAll();
        for(Moto moto: motoList){
            System.out.println(moto);
        }
    }

    @Override
    public void remove(String bienSo) {
        List<Moto> motoList = xeMayRepository.findAll();
        int index = motoList.indexOf(new Moto(bienSo));
        if (index != -1) {
            System.out.printf("Yes or No ? ");
            String yesOrNo = scanner.nextLine();
            if (yesOrNo.equals("Yes")) {
                xeMayRepository.deXeMay(index);
                System.out.printf("Xóa thành công");
            } else {
                return;
            }
        } else {
            System.out.println("Không thể xóa");
        }
    }

    @Override
    public void findTrans(String bienSo) {
        List<Moto> motoList = xeMayRepository.findAll();
        int index = motoList.indexOf(new Moto(bienSo));
        if(index != -1){
            xeMayRepository.findTrans(index);
        }else{
            return;
        }
    }

    public Moto inforXeMay(){
        System.out.println("Nhập vào biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập vào tên hãng: ");
        String tenHang = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất:");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập vào công suất:");
        String congSuat = scanner.nextLine();
        Moto moto = new Moto(bienKiemSoat,tenHang,namSX,chuSoHuu,congSuat);
        return moto;
    }
}
