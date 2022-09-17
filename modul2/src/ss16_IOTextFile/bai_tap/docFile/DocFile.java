package ss16_IOTextFile.bai_tap.docFile;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào file cần đọc: ");
        String filePath = scanner.nextLine();
        readFile(filePath);
    }

    public static void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                printCoutry(dataCountry(line));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> dataCountry(String line) {
        List<String> countryList = new ArrayList<>();
        if (line != null) {
            String[] countrySpilt = line.split(",");
            for (int i = 0; i < countrySpilt.length; i++) {
                countryList.add(countrySpilt[i]);
            }
        }
        return countryList;
    }

    public static void printCoutry(List<String> dataCountry) {
        System.out.println("Country{ id: " +
                dataCountry.get(0) + ", code: "+
                dataCountry.get(1) + ", name: "+
                dataCountry.get(2)+"}");
    }
}
