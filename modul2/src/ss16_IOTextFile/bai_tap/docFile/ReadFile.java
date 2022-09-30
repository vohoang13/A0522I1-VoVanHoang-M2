package ss16_IOTextFile.bai_tap.docFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILE_PATH = "D:\\CODEGYM\\Module2\\A0522I1-VoVanHoang-M2\\modul2\\src\\ss16_IOTextFile\\bai_tap\\docFile\\country.csv";

    public static List<Country> ReadFile(String filePath) {
        List<Country> countryList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp[];
            Country country;
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                country = new Country(id, code, name);
                countryList.add(country);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countryList;
    }
    public static void writeFile(List<Country> countryList) {
        File file = new File(FILE_PATH);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = " ";
            for (Country country : countryList) {
                str += country.getId() + "," + country.getCode() + "," + country.getName() + "\n";
            }
            if (str != null && !str.isEmpty()) {
                bufferedWriter.write(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        //ĐỌC FILE ==>> LƯU VÀO COLLECTION
        List<Country> countryList = ReadFile(FILE_PATH);
        for(Country country: countryList){
            System.out.println(country);
        }

        // CRUD TRÊN COLLECTION
        countryList.add(new Country(123,"VN","VietNam"));

        //Chọn lưu v gọi method ghi vào file
        writeFile(countryList);
    }
}
