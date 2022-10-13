package ss19_Case_Study.QuanLyResort.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDienTich {
    private static final String DIEN_TICH = "^([3-9][0-9]*\\.[1-9]+)|([4-9][0-9]*\\.[0-9]+)$";

    private Pattern pattern;

    private Matcher matcher;

    public ValidateDienTich(){
        pattern = Pattern.compile(DIEN_TICH);
    }

    public  boolean testDienTich(String dienTich){
        Pattern pattern = Pattern.compile(DIEN_TICH);
        Matcher matcher = pattern.matcher(dienTich);
        boolean isValidate = matcher.matches();
        return isValidate;
    }
}
