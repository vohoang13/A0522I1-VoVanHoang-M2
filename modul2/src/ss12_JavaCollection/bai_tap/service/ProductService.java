package ss12_JavaCollection.bai_tap.service;

import ss12_JavaCollection.bai_tap.model.Product;
import ss12_JavaCollection.bai_tap.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    private Scanner scanner = new Scanner(System.in);
    ProductRepository productRepository = new ProductRepository();
    @Override
    public void addProduct() {
        Product product = this.inforProduct();
        productRepository.addProduct(product);
    }

    @Override
    public void findAll() {
        List<Product> productList =productRepository.findAll();
        for (Product product : productList){
            System.out.println(product);
        }
    }

    @Override
    public void setProduct(int id) {
        List<Product> productList =productRepository.findAll();
        int index = productList.indexOf(new Product(id));
        if(index != -1){
            Product product = this.setProduct();
            productRepository.setProduct(index,product);
            System.out.printf("Thay đổi thành công");
        }else {
            return;
        }
    }

    public Product setProduct(){
        System.out.print("Nhập vào id mới: ");
        int newId = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập vào tên sản phẩm mới: ");
        String newName = scanner.nextLine();
        System.out.printf("Nhập vào giá tiền mới: ");
        int newPrice = Integer.parseInt(scanner.nextLine());
        Product product = new Product(newId,newName,newPrice);
        return product;
    }

    @Override
    public void removeProduct(int id) {
        List<Product> productList =productRepository.findAll();
        int index = productList.indexOf(new Product(id));
        if(index != -1){
            productRepository.remove(index);
            System.out.println("Xóa thành công");
        }else {
            System.out.println("Không thể xóa");
        }
    }

    @Override
    public void findProduct(String name) {
       productRepository.findProduct(name);
    }

    @Override
    public void sortProduct() {
        productRepository.sortProduct();
    }

    @Override
    public void sortReduceProduct() {
        productRepository.sortReduceProduct();
    }


    public Product inforProduct(){
        System.out.print("Nhập vào id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập vào tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.printf("Nhập vào giá thành sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id,nameProduct,price);
        return product;
    }
}
