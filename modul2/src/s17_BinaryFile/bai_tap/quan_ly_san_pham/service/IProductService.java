package s17_BinaryFile.bai_tap.quan_ly_san_pham.service;

import java.io.IOException;

public interface IProductService {
    void addProduct() throws IOException;

    void findAll();

    void findId(String id);

    void removeId(String id);
}
