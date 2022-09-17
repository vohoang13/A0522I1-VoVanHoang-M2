package ss16_IOTextFile.thuc_hanh.tongFile;

import java.io.*;
import java.util.Scanner;

public class FileReaderSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào file cần đọc: ");
        String path = scanner.nextLine();
        fileReader(path);
    }

    public static void fileReader(String path){
        try{
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng = " + sum);
        }catch (FileNotFoundException e){
            System.out.println("Lỗi không tìm thấy file hoặc lỗi do nội dùng file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
