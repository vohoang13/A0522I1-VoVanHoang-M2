package ss19_Case_Study.QuanLyResort.until.file;

import ss19_Case_Study.QuanLyResort.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {

    public List<String> ReadFile(String filePath) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }

    public void writeFile(List<Employee> employeeList, String filePath) {
        File file = new File(filePath);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = " ";
            for (Employee employee : employeeList) {
                str += employee.getHoTen() + "," + employee.getNgaySinh() + "," + employee.getGioiTinh() + "," + employee.getSoCMND() + "," + employee.getSoDienThoai() + ","
                        + employee.getEmail() + "," + employee.getMaNV() + "," + employee.getTrinhDo() + "," + employee.getViTri() +"," + employee.getLuong() + "\n";
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
}
