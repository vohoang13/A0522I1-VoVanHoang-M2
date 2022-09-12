package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Oto;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.XeTai;

import java.util.List;

public interface IXeTaiRepository {
    public void addXetai(XeTai xeTai);

    public List<XeTai> findAll();

    public void deXetai(int index);

    public void findTrans(int index);
}
