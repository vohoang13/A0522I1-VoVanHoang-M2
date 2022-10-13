package ss19_Case_Study.QuanLyResort.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSoLuong {
    private static final String SO_LUONG = "^([1-9])|([1][0-9])$";
    private Pattern pattern;
    private Matcher matcher;

    public ValidateSoLuong(){
        pattern = Pattern.compile(SO_LUONG);
    }

    public boolean testSoLuong(String soLuong){
        Pattern pattern = Pattern.compile(SO_LUONG);
        Matcher matcher = pattern.matcher(soLuong);
        boolean isValidate = matcher.matches();
        return isValidate;
    }

}
