package ss19_Case_Study.QuanLyResort.until;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    public Validate(){

    }
    private static final String TEN_DV ="^[A-Z][a-z]+$";
    private static final String MA_DV = "^(SV){1}(VL|HO|RO)[-][0-9]{4}$";

    private static final String DIEN_TICH = "^([3-9][0-9]*\\.[1-9]+)|([4-9][0-9]*\\.[0-9]+)$";

    private static final String CHI_PHI = "^[0-9]*$";

    private static final String SO_LUONG = "^([1-9])|([1][0-9])$";

    private static final String NGAY_SINH = "^\\d{2}[-|/]\\d{2}[-|/](([1][9]([2-9][3-9]|[3-9][0-9]))|([2][0]{2}[0-4]+))$";

    private static final String MA_BA = "^(BA)[-][0-9]{3}$";
    public boolean testMaDV(String maDV){
        Pattern pattern = Pattern.compile(MA_DV);
        Matcher matcher = pattern.matcher(maDV);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public boolean testTenDV(String tenDV){
        Pattern pattern = Pattern.compile(TEN_DV);
        Matcher matcher = pattern.matcher(tenDV);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public boolean testDienTich(String dienTich){
        Pattern pattern = Pattern.compile(DIEN_TICH);
        Matcher matcher = pattern.matcher(dienTich);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public boolean testChiPhi(String chiPhi){
        Pattern pattern = Pattern.compile(CHI_PHI);
        Matcher matcher = pattern.matcher(chiPhi);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public boolean testSoLuong(String soLuong){
        Pattern pattern = Pattern.compile(SO_LUONG);
        Matcher matcher = pattern.matcher(soLuong);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public boolean testNgaySinh(String ngaySinh){
        Pattern pattern = Pattern.compile(NGAY_SINH);
        Matcher matcher = pattern.matcher(ngaySinh);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public static boolean testTinhTrang(String tinhTrang){
        Pattern pattern = Pattern.compile(MA_DV);
        Matcher matcher = pattern.matcher(tinhTrang);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public static boolean testBenhAn(String benhAn){
        Pattern pattern = Pattern.compile(MA_BA);
        Matcher matcher = pattern.matcher(benhAn);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

    public static void main(String[] args) {
        System.out.println("Nhập vào diện tích: ");
        String dienTich = scanner.nextLine();
        boolean check = testBenhAn(dienTich);
        System.out.println(check);


//        System.out.println("Nhập vào chi phí: ");
//        int chiPhi = Integer.parseInt(scanner.nextLine());
//        boolean check = testChiPhi(String.valueOf(chiPhi));
//        System.out.println(check);

//        System.out.println("Nhập vào số lượng: ");
//        int soLuong = Integer.parseInt(scanner.nextLine());
//        boolean check = testSoLuong(String.valueOf(soLuong));
//        System.out.println(check);


//        System.out.println("Nhập vào ngày sinh: ");
//        String ngaySinh = scanner.nextLine();
//        boolean check = testNgaySinh(ngaySinh);
//        System.out.println(check);
    }
}
