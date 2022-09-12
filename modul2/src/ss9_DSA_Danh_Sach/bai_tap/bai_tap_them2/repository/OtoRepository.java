package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.repository;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them2.model.Oto;

import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IOtoRepository {
    private List<Oto> otoList = new ArrayList<>();
    @Override
    public void addOto(Oto oto) {
        otoList.add(oto);
    }

    @Override
    public List<Oto> findAll() {
        return otoList;
    }

    @Override
    public void deOto(int index) {
        otoList.remove(index);
    }

    @Override
    public void findTrans(int index) {
        System.out.println(otoList.get(index));
    }
}
