package s17_BinaryFile.bai_tap.copyFile;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào file nguồn: ");
        String sourceFile = scanner.nextLine();
        System.out.println("Nhập vào file đích: ");
        String targetFile = scanner.nextLine();
        copyFile(sourceFile,targetFile);
    }

    public static void copyFile(String sourceFile, String targetFile){
        FileInputStream sourceFile1 = null;
        FileOutputStream targetFile1 = null;
        try{
            sourceFile1 = new FileInputStream(sourceFile);
            targetFile1 = new FileOutputStream(targetFile);
            byte[] bytes = new byte[100];
            int totalBytes = 0;
            int line;
            while ((line = sourceFile1.read(bytes))>0){
                targetFile1.write(bytes,0,line);
                totalBytes = totalBytes + line;
            }
            System.out.println("Tổng số byte: " + line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
