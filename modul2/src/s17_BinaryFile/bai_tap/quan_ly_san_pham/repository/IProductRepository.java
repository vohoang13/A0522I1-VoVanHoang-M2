package s17_BinaryFile.bai_tap.quan_ly_san_pham.repository;

import s17_BinaryFile.bai_tap.quan_ly_san_pham.model.Product;

import java.io.IOException;
import java.util.List;

public interface IProductRepository {
    void addProduct(Product product) throws IOException;

    List<Product> findAll();

    void findId(String id);

    void removeId(String id);
}
