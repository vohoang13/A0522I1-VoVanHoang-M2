package ss16_IOTextFile.bai_tap.copyFile;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class CopyFile {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào file nguồn: ");
        String sourceFile = scanner.nextLine();
        System.out.println("Nhập vào file đích: ");
        String targetFile = scanner.nextLine();
        copyFile(sourceFile,targetFile);
    }

    public static void copyFile(String sourceFile, String targetFile){
        try{
            File firstFile = new File(sourceFile);
            File secondFile = new File(targetFile);
            if(!firstFile.exists()){
                throw new FileNotFoundException();
            }else if(secondFile.exists()){
                System.out.println("file đích tồn tại");
            }
            String line="";
            int count = 0;
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(secondFile));
            BufferedReader bufferedReader = new BufferedReader( new FileReader(firstFile));
            while ((line = bufferedReader.readLine()) != null){
                for( int i = 0 ; i < line.length(); i++){
                    char c = line.charAt(i);
                    if((c >= 'a'  && c <='z') || (c >= 'A' && c <= 'Z')){
                        count++;
                    }
                }
                bufferedWriter.write(line);
            }
            bufferedWriter.write("\nCó " + count + " ký tự");
            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }
}
