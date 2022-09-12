package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.service;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.XeTai;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository.IXeTaiRepository;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository.XeTaiRepository;

import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeTaiService {
    private Scanner scanner = new Scanner(System.in);

    IXeTaiRepository iXeTaiRepository = new XeTaiRepository();

    @Override
    public void addXeTai() {
        XeTai xeTai = this.inforXeTai();
        iXeTaiRepository.addXetai(xeTai);
    }

    @Override
    public void display() {
        List<XeTai> xeTaiList = iXeTaiRepository.findAll();
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai);
        }
    }

    @Override
    public void remove(String bienSo) {
        List<XeTai> xeTaiList = iXeTaiRepository.findAll();
        int index = xeTaiList.indexOf(new XeTai(bienSo));
        if (index != -1) {
            System.out.printf("Yes or No ? ");
            String yesOrNo = scanner.nextLine();
            if (yesOrNo.equals("Yes")) {
                iXeTaiRepository.deXetai(index);
                System.out.println("Xóa thành công");
            } else {
                return;
            }
        } else {
            System.out.println("Không thể xóa");
        }
    }

    @Override
    public void findTrans(String bienSo) {
        List<XeTai> xeTaiList = iXeTaiRepository.findAll();
        int index = xeTaiList.indexOf(new XeTai(bienSo));
        if(index != -1){
            iXeTaiRepository.findTrans(index);
        }else{
            return;
        }
    }

    public XeTai inforXeTai() {
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Tên Hãng:");
        String tenHang = scanner.nextLine();
        System.out.println("Năm sản xuất:");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Trọng tải:");
        String trongTai = scanner.nextLine();
        XeTai xeTai = new XeTai(bienKiemSoat, tenHang, namSX, chuSoHuu, trongTai);
        return xeTai;
    }
}
