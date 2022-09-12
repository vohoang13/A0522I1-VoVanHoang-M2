package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.service;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Oto;

import java.util.List;

public interface IXeMayService {
    public void addXeMay();

    public void display();

    public void remove(String bienSo);

    public void findTrans(String bienSo);
}
