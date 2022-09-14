package ss12_JavaCollection.bai_tap.repository;

import ss12_JavaCollection.bai_tap.model.Product;

import java.util.List;

public interface IProductRepository {
    public void addProduct(Product product);

    public void setProduct(int index, Product product);

    public void remove(int index);

    public void findProduct(String name);

    public void sortProduct();

    public void sortReduceProduct();
    public List<Product> findAll();
}
