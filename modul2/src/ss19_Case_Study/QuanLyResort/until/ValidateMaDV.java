package ss19_Case_Study.QuanLyResort.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMaDV {
    private static final String MA_DV = "^(SV){1}(VL|HO|RO)[-][0-9]{4}$";
    private Pattern pattern;
    private Matcher matcher;

    public ValidateMaDV() {
        pattern = Pattern.compile(MA_DV);
    }

    public  boolean testMaDV(String maDV){
        Pattern pattern = Pattern.compile(MA_DV);
        Matcher matcher = pattern.matcher(maDV);
        boolean isValidate = matcher.matches();
        return isValidate;
    }
}
