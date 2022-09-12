package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Oto;

import java.util.List;

public interface IOtoRepository {
    public void addOto(Oto oto);

    public List<Oto> findAll();

    public void deOto(int index);

    public void findTrans(int index);
}
