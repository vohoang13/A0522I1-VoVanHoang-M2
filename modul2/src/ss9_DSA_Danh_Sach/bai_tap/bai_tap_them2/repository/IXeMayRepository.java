package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Moto;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Oto;

import java.util.List;

public interface IXeMayRepository {
    public void addXeMay(Moto moto);

    public List<Moto> findAll();

    public void deXeMay(int index);

    public void findTrans(int index);
}
