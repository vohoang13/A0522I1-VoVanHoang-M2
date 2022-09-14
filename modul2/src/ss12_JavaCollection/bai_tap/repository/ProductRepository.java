package ss12_JavaCollection.bai_tap.repository;

import ss12_JavaCollection.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void setProduct(int index, Product product) {
        productList.set(index,product);
    }

    @Override
    public void remove(int index) {
        productList.remove(index);
    }

    @Override
    public void findProduct(String name) {
       for(Product product : productList){
           if(product.getNameProduct().equals(name)){
               System.out.println(product);
           }
       }
    }

    @Override
    public void sortProduct() {
        Collections.sort(productList);
    }

    @Override
    public void sortReduceProduct() {
        for (int i = 0; i < productList.size(); i++){
            for (int j = productList.size()-1; j > i; j--){
                if(productList.get(j).getPrice() > productList.get(j-1).getPrice()){
                    Product temp = productList.get(j);
                    productList.set(j,productList.get(j-1));
                    productList.set(j-1,temp);
                }
            }
        }
    }


    @Override
    public List<Product> findAll() {
        return productList;
    }
}
