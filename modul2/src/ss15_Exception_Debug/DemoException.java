package ss15_Exception_Debug;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        System.out.println("Bắt đầu");
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            check=false;
            System.out.println("nhập đường dẫn file");
            String path = scanner.nextLine();
            try {
                method2(path);
            } catch (FileNotFoundException e) {
                check=true;
                e.printStackTrace();
            }
        }while (check);

//        try {
//            checkAge(-11);
//        } catch (AgeCheckExeption ageCheckExeption) {
//            ageCheckExeption.printStackTrace();
//        }
//        System.out.println("Kết thúc");


    }
    public static void method1(){
        int[] arr ={10,20,30};
        int index=-1;
        int element=0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhập vào vị trí phần tử cần lấy");
            String str = scanner.nextLine();
            index = Integer.parseInt(str);
            element = arr[index];
        }catch (NumberFormatException e){
            System.err.println(e.getMessage());
            element=arr[0];
//            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
            element= arr[arr.length-1];
        }catch (Exception e){
            System.out.println("lỗi chưa biết");
            e.printStackTrace();
        }finally {
            System.out.println("luôn luôn chạy cho dù có hay không có exception");
        }
        System.out.println("Giá trị phần tử cần lấy ra "+ element);
    }
    public static void method2(String filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);
    }
//    public static void checkAge(int age) throws AgeCheckExeption {
//        if (age<0){
//            // sử dụng exceptio do người dùng định nghĩa
//            throw new AgeCheckExeption("lỗi do tuổi nhỏ hơn 0");
//        }else if (age>200){
//            throw new AgeCheckExeption("Lỗi do tuổi lơn hơn 200");
//        }
//    }
}

