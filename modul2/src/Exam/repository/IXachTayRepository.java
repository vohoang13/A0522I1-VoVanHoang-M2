package Exam.repository;

import Exam.model.DienThoaiXachTay;

import java.util.List;

public interface IXachTayRepository {
    public void themXachTay(DienThoaiXachTay dienThoaiXachTay);

    public List danhSach();

    public List findAll();
    public void xoa(int id);

    public void timKiemID(int id);

    public void timKiemTen(String name);
}
