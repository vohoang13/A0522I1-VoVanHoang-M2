package Exam2.repository;

import Exam2.data.DocFile;
import Exam2.model.BenhNhanThuong;
import Exam2.model.BenhNhanVIP;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VIPRepository implements IVIPRepository{
    private Scanner scanner = new Scanner(System.in);
    private final String FILE_PATH = "D:\\CODEGYM\\Module2\\A0522I1-VoVanHoang-M2\\modul2\\src\\Exam2\\data\\vip.csv";
    private List<BenhNhanVIP> benhNhanVIPList = new ArrayList<>();

    public VIPRepository(){
        benhNhanVIPList = danhSach();
    }

    private DocFile docFile = new DocFile();
    @Override
    public void addVIP(BenhNhanVIP benhNhanVIP) {
        int lastID = 0;
        if(benhNhanVIPList.size() > 0){
            lastID = benhNhanVIPList.get(benhNhanVIPList.size()-1).getSoThuTu();
        }
        benhNhanVIP.setSoThuTu(lastID + 1);
        benhNhanVIPList.add(benhNhanVIP);
        writeFile2(Collections.singletonList(benhNhanVIP),FILE_PATH,true);
    }

    @Override
    public List findAll() {
        return benhNhanVIPList;
    }

    @Override
    public void xoa(String ma) {
        int index = benhNhanVIPList.indexOf(new BenhNhanVIP(ma));
        if(index != -1){
            int choice = 0;
            do {
                System.out.println("1.Yes\n" +
                        "2.No");
                System.out.println("Nhập vào lựa chọn :");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        benhNhanVIPList.remove(index);
                        writeFile2(benhNhanVIPList,FILE_PATH,false);
                        break;
                    case 2:
                        break;
                }
            }while (choice < 1 || choice > 2 );
        }else {
            return;
        }
    }

    public void writeFile2(List<BenhNhanVIP> benhNhanVIPList, String filePath, boolean append) {
        File file = new File(filePath);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = " ";
            for (BenhNhanVIP benhNhanVIP : benhNhanVIPList) {
                str += benhNhanVIP.getSoThuTu() + "," + benhNhanVIP.getMaBenhAn() + "," + benhNhanVIP.getTenBenhNhan() + "," + benhNhanVIP.getNgayNhapVien() + "," + benhNhanVIP.getNgayRaVien() +"," + benhNhanVIP.getLyDoNhapVien() + ","
                        + benhNhanVIP.getLoaiVIP() + "," + benhNhanVIP.getThoiHan() + "\n";
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
            BenhNhanVIP benhNhanVIP = new BenhNhanVIP(thuTu,ma,ten,ngayVao,ngayRa,lyDo);
            result.add(benhNhanVIP);
        }
        return result;
    }
}
