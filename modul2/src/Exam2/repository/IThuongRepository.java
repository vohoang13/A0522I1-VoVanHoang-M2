package Exam2.repository;

import Exam2.model.BenhNhanThuong;

import java.util.List;

public interface IThuongRepository {
    public void addThuong(BenhNhanThuong benhNhanThuong);

    public List findAll();

    public void xoa(String ma);
}
