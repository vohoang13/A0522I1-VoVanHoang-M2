package Exam.repository;

import Exam.model.DienThoaiChinhHang;
import Exam.model.DienThoaiXachTay;

import java.util.List;

public interface IChinhHangRepository {
    public void themChinhHang(DienThoaiChinhHang dienThoaiChinhHang);

    public List danhSach();

    public List findAll();

    public void xoa(int id);

    public void timKiemID(int id);

    public void timKiemTen(String name);
}
