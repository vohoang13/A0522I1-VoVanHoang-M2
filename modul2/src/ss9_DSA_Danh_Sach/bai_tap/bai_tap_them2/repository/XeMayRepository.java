package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Moto;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepository implements IXeMayRepository{
    private List<Moto> motoList = new ArrayList<>();
    @Override
    public void addXeMay(Moto moto) {
        motoList.add(moto);
    }

    @Override
    public List<Moto> findAll() {
        return motoList;
    }

    @Override
    public void deXeMay(int index) {
        motoList.remove(index);
    }

    @Override
    public void findTrans(int index) {
        System.out.println(motoList.get(index));
    }


}
