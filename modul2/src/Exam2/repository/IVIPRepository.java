package Exam2.repository;

import Exam2.model.BenhNhanVIP;

import java.util.List;

public interface IVIPRepository {
    public void addVIP(BenhNhanVIP benhNhanVIP);

    public List findAll();

    public void xoa(String ma);
}
