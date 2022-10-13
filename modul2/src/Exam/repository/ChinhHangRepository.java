package Exam.repository;

import Exam.model.DienThoaiChinhHang;
import Exam.model.DienThoaiXachTay;
import Exam.until.File.ReadFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChinhHangRepository implements IChinhHangRepository{
    private final String FILE_PATH = "D:\\CODEGYM\\Module2\\A0522I1-VoVanHoang-M2\\modul2\\src\\Exam\\until\\File\\chinhhang.csv";
    private List<DienThoaiChinhHang> dienThoaiChinhHangs = new ArrayList<>();
    private ReadFile readFile = new ReadFile();

    public ChinhHangRepository(){
        dienThoaiChinhHangs = danhSach();
    };
    @Override
    public void themChinhHang(DienThoaiChinhHang dienThoaiChinhHang) {
        int lastID = 0;
        if(dienThoaiChinhHangs.size() > 0){
            lastID = dienThoaiChinhHangs.get(dienThoaiChinhHangs.size()-1).getId();
        }
        dienThoaiChinhHang.setId(lastID + 1);
        dienThoaiChinhHangs.add(dienThoaiChinhHang);
        writeFile(Collections.singletonList(dienThoaiChinhHang),FILE_PATH,true);
    }



    @Override
    public List danhSach() {
        List result = new ArrayList<>();
        List<String> stringList = readFile.ReadFile(FILE_PATH);
        for(String string : stringList){
            String temp[] = string.trim().split(",");
            int id = Integer.parseInt(temp[0]);
            String tenDienThoai = temp[1];
            int giaBan = Integer.parseInt(temp[2]);
            int soLuong  = Integer.parseInt(temp[3]);
            String nhaSanXuat = temp[4];
            int thoiGianBaoHanh = Integer.parseInt(temp[5]);
            String phamVi = temp[6];
            DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id,tenDienThoai,giaBan,soLuong,nhaSanXuat,thoiGianBaoHanh,phamVi);
            result.add(dienThoaiChinhHang);
        }
        return result;
    }

    @Override
    public List findAll() {
        return dienThoaiChinhHangs;
    }

    @Override
    public void xoa(int id) {
       dienThoaiChinhHangs = danhSach();
       int index = dienThoaiChinhHangs.indexOf(new DienThoaiChinhHang(id));
       if(index != -1){
           dienThoaiChinhHangs.remove(index);
           writeFile(dienThoaiChinhHangs,FILE_PATH,false);
       }
    }

    @Override
    public void timKiemID(int id) {
        for(DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangs){
            if(dienThoaiChinhHang.getId() == id){
                System.out.println(dienThoaiChinhHang);
            }
        }
    }

    @Override
    public void timKiemTen(String name) {
        for(DienThoaiChinhHang dienThoaiChinhHang: dienThoaiChinhHangs){
            if(dienThoaiChinhHang.getTenDienThoai().equals(name)){
                System.out.println(dienThoaiChinhHang);
            }
        }
    }


    public void writeFile(List<DienThoaiChinhHang> dienThoaiChinhHangList, String filePath,boolean append) {
        File file = new File(filePath);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = " ";
            for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
                str += dienThoaiChinhHang.getId() + "," + dienThoaiChinhHang.getTenDienThoai() + "," + dienThoaiChinhHang.getGiaBan() + "," + dienThoaiChinhHang.getSoLuong() + "," + dienThoaiChinhHang.getNhaSanXuat() +"," + dienThoaiChinhHang.getThoiGianBaoHanh() + ","
                        + dienThoaiChinhHang.getPhamVi() + "\n";
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
}
