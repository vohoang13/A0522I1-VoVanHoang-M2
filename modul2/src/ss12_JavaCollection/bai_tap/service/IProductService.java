package ss12_JavaCollection.bai_tap.service;

public interface IProductService {
    public void addProduct();

    public void setProduct(int id);

    public void removeProduct(int id);

    public void findProduct(String name);

    public void sortProduct();

    public void sortReduceProduct();

    public void findAll();
}
