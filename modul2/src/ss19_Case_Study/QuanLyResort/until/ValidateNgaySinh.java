package ss19_Case_Study.QuanLyResort.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNgaySinh {
    private static final String NGAY_SINH = "^\\d{2}[-|/]\\d{2}[-|/](([1][9]([2-9][3-9]|[3-9][0-9]))|([2][0]{2}[0-4]+))$";
    private Pattern pattern;
    private Matcher matcher;

    public ValidateNgaySinh(){
        pattern = Pattern.compile(NGAY_SINH);
    }

    public  boolean testNgaySinh(String ngaySinh){
        Pattern pattern = Pattern.compile(NGAY_SINH);
        Matcher matcher = pattern.matcher(ngaySinh);
        boolean isValidate = matcher.matches();
        return isValidate;
    }
}
