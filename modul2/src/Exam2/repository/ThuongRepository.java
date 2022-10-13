package Exam2.repository;

import Exam.model.DienThoaiChinhHang;
import Exam2.data.DocFile;
import Exam2.model.BenhNhanThuong;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThuongRepository implements IThuongRepository{
    private Scanner scanner = new Scanner(System.in);
    private final String FILE_PATH = "D:\\CODEGYM\\Module2\\A0522I1-VoVanHoang-M2\\modul2\\src\\Exam2\\data\\thuong.csv";
    private List<BenhNhanThuong> benhNhanThuongList = new ArrayList<>();

    public ThuongRepository(){
        benhNhanThuongList = danhSach();
    }
    private DocFile docFile = new DocFile();
    @Override
    public void addThuong(BenhNhanThuong benhNhanThuong) {
        int lastID = 0;
        if(benhNhanThuongList.size() > 0){
            lastID = benhNhanThuongList.get(benhNhanThuongList.size()-1).getSoThuTu();
        }
        benhNhanThuong.setSoThuTu(lastID + 1);
        benhNhanThuongList.add(benhNhanThuong);
        writeFile1(Collections.singletonList(benhNhanThuong),FILE_PATH,true);
    }

    @Override
    public List findAll() {
        return benhNhanThuongList;
    }

    @Override
    public void xoa(String ma) {
        int index = benhNhanThuongList.indexOf(new BenhNhanThuong(ma));
        if(index != -1){
            int choice = 0;
            do {
                System.out.println("1.Yes\n" +
                        "2.No");
                System.out.println("Nhập vào lựa chọn :");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        benhNhanThuongList.remove(index);
                        writeFile1(benhNhanThuongList, FILE_PATH, false);
                        break;
                    case 2:
                        break;
                }
            }while (choice > 2 || choice <1 );
        }else {
            return;
        }
    }

    public void writeFile1(List<BenhNhanThuong> benhNhanThuongList, String filePath, boolean append) {
        File file = new File(filePath);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = " ";
            for (BenhNhanThuong benhNhanThuong : benhNhanThuongList) {
                str += benhNhanThuong.getSoThuTu() + "," + benhNhanThuong.getMaBenhAn() + "," + benhNhanThuong.getTenBenhNhan() + "," + benhNhanThuong.getNgayNhapVien() + "," + benhNhanThuong.getNgayRaVien() +"," + benhNhanThuong.getLyDoNhapVien() + ","
                        + benhNhanThuong.getPhiNamVien() + "\n";
            }
            if (str != null && !str.isEmpty()) {
                bufferedWriter.write(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public List danhSach() {
        List result = new ArrayList<>();
        List<String> stringList = docFile.ReadFile(FILE_PATH);
        for(String string : stringList){
            String temp[] = string.trim().split(",");
            int thuTu = Integer.parseInt(temp[0]);
            String ma = temp[1];
            String ten = temp[2];
            String ngayVao = temp[3];
            String ngayRa = temp[4];
            String lyDo = temp[5];
            BenhNhanThuong benhNhanThuong = new BenhNhanThuong(thuTu,ma,ten,ngayVao,ngayRa,lyDo);
            result.add(benhNhanThuong);
        }
        return result;
    }
}
