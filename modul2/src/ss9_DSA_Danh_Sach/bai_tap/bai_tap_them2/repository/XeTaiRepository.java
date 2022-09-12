package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepository implements IXeTaiRepository{
    private List<XeTai> xeTaiList = new ArrayList<>();
    @Override
    public void addXetai(XeTai xeTai) {
        xeTaiList.add(xeTai);
    }

    @Override
    public List<XeTai> findAll() {
        return xeTaiList;
    }

    @Override
    public void deXetai(int index) {
        xeTaiList.remove(index);
    }

    @Override
    public void findTrans(int index) {
        System.out.println(xeTaiList.get(index));

    }
}
