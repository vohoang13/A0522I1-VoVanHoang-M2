package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.service;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.model.Student;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Moto;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Oto;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository.IOtoRepository;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository.OtoRepository;

import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService{
    private Scanner scanner = new Scanner(System.in);
    IOtoRepository iOtoRepository = new OtoRepository();
    @Override
    public void addOto() {
        Oto oto = this.inforOto();
        iOtoRepository.addOto(oto);
    }

    @Override
    public void display() {
        List<Oto> otoList = iOtoRepository.findAll();
        for(Oto oto: otoList){
            System.out.println(oto);
        }
    }

    @Override
    public void remove(String bienSo) {
        List<Oto> otoList = iOtoRepository.findAll();
        int index = otoList.indexOf(new Oto(bienSo));
        if (index != -1) {
            System.out.printf("Yes or No ? ");
            String yesOrNo = scanner.nextLine();
            if (yesOrNo.equals("Yes")) {
                iOtoRepository.deOto(index);
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
        List<Oto> otoList = iOtoRepository.findAll();
        int index = otoList.indexOf(new Oto(bienSo));
        if(index != -1){
            iOtoRepository.findTrans(index);
        }else {
            return;
        }
    }

    public Oto inforOto(){
       System.out.println("Nhập vào Biển kiểm soát: ");
       String bienKiemSoat = scanner.nextLine();
       System.out.println("Nhập vào tên Hãng: ");
       String tenHang = scanner.nextLine();
       System.out.println("Nhập vào năm sản xuất:");
       int namSX = Integer.parseInt(scanner.nextLine());
       System.out.println("Nhập vào chủ sở hữu:");
       String chuSoHuu = scanner.nextLine();
       System.out.println("Nhập vào số chỗ ngồi: ");
       int soChoNgoi = Integer.parseInt(scanner.nextLine());
       System.out.println("Nhập vào kiểu xe:");
       String kieuXe = scanner.nextLine();
       Oto oto = new Oto(bienKiemSoat,tenHang,namSX,chuSoHuu,soChoNgoi,kieuXe);
       return oto;
   }
}
