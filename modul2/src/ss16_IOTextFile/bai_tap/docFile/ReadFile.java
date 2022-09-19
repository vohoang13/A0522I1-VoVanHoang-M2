package ss16_IOTextFile.bai_tap.docFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String FILE_PATH = "D:\\CODEGYM\\Module2\\A0522I1-VoVanHoang-M2\\modul2\\src\\ss16_IOTextFile\\bai_tap\\docFile\\country.csv";

    public static List<Country> ReadFile(String filePath) {
        List<Country> countryList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
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

    public static void main(String[] args) {
        List<Country> countryList = ReadFile(FILE_PATH);
        for(Country country: countryList){
            System.out.println(country);
        }
    }
}
