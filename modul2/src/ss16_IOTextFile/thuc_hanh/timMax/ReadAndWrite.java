package ss16_IOTextFile.thuc_hanh.timMax;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào file cần đọc: ");
        String filePath = scanner.nextLine();
        List<Integer> number = readFile(filePath);
        int maxValue = findMax(number);
        System.out.println("Nhập vào file cần lưu giá trị lớn nhất: ");
        String maxFile = scanner.nextLine();
        writeFile(maxFile, maxValue);
    }

    public static List<Integer> readFile(String path){
        List<Integer> number = new ArrayList<>();
        try{
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line="";
            while ((line = bufferedReader.readLine()) != null){
                number.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return number;
    }

    public static void writeFile(String filePath, int max){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> number){
        int max = number.get(0);
        for(int i = 1; i < number.size(); i++){
            if(max < number.get(i)){
                max = number.get(i);
            }
        }
        return max;
    }
}
