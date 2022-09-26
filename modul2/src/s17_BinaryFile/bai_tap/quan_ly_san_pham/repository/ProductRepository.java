package s17_BinaryFile.bai_tap.quan_ly_san_pham.repository;

import s17_BinaryFile.bai_tap.quan_ly_san_pham.model.Product;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private final String FILE_PATH = "D:\\CODEGYM\\Module2\\A0522I1-VoVanHoang-M2\\modul2\\src\\s17_BinaryFile\\bai_tap\\quan_ly_san_pham\\product.dat";
    List<Product> productList = new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        productList.add(product);
        writeFile(productList);
    }

    @Override
    public List<Product> findAll() {
        productList = readFile();
        return productList;
    }

    @Override
    public void findId(String id) {
        productList = readFile();
        for(Product product: productList){
           if(product.getId().equals(id)){
               System.out.println(product);
           }
       }
    }

    @Override
    public void removeId(String id) {
        productList = readFile();
        int index = productList.indexOf(new Product(id));
        if(index != -1){
            productList.remove(index);
            System.out.println("Xóa thành công");
        }else {
            System.out.println("Không thể xóa");
        }
        writeFile(productList);
    }

    public void writeFile(List<Product> productList)  {
        File file = new File(FILE_PATH);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Product> readFile(){
        File file = new File(FILE_PATH);
        FileInputStream fis = null;
        List<Product> productList1 = null;
        try {
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList1 = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList1;
    }
}
