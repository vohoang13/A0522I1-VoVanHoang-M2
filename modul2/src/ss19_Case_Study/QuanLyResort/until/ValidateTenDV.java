package ss19_Case_Study.QuanLyResort.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTenDV {
    private static final String TEN_DV ="^[A-Z][a-z]+$";

    private Pattern pattern;
    private Matcher matcher;

    public ValidateTenDV(){
        pattern = Pattern.compile(TEN_DV);
    }

    public boolean testTenDV(String tenDV){
        Pattern pattern = Pattern.compile(TEN_DV);
        Matcher matcher = pattern.matcher(tenDV);
        boolean isValidate = matcher.matches();
        return isValidate;
    }
}
