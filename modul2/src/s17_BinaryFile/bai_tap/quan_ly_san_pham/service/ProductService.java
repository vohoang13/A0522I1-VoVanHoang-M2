package s17_BinaryFile.bai_tap.quan_ly_san_pham.service;

import s17_BinaryFile.bai_tap.quan_ly_san_pham.model.Product;
import s17_BinaryFile.bai_tap.quan_ly_san_pham.repository.IProductRepository;
import s17_BinaryFile.bai_tap.quan_ly_san_pham.repository.ProductRepository;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{

    Scanner scanner = new Scanner(System.in);
    IProductRepository iProductRepository = new ProductRepository();
    ProductRepository repository = new ProductRepository();
    @Override
    public void addProduct() throws IOException {
        Product product = this.inforProduct();
        iProductRepository.addProduct(product);
    }

    @Override
    public void findAll() {
        List<Product> productList = iProductRepository.findAll();
        for(Product product: productList){
            System.out.println(product);
        }
    }

    @Override
    public void findId(String id) {
        iProductRepository.findId(id);
    }

    @Override
    public void removeId(String id) {
        iProductRepository.removeId(id);
    }


    public Product inforProduct(){
        System.out.println("Nhập vào id sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập vào tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập vào tên hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, nameProduct, manufacturer, price);
        return product;
    }
}
